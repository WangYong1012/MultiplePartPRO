package cn.brave.service.balance.impl;

import cn.brave.dao.mappers.balance.JcUserBalanceMapper;
import cn.brave.entity.JcUserBalance;
import cn.brave.service.balance.IUserBalanceService;
import org.apache.shiro.session.mgt.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserBalanceServiceImpl implements IUserBalanceService
{
    @Autowired
    private JcUserBalanceMapper jcUserBalanceMapper;
    @Autowired
    private DataSourceTransactionManager transactionManager;
    
    @Override
    public List<JcUserBalance> getList()
    {
        
        return jcUserBalanceMapper.selectByExample(null);
    }
    
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertBalances(List<JcUserBalance> jcUserBalances) throws SQLException
    {
        String uuid = UUID.randomUUID().toString();
        int nums = 0;
        Connection conn = transactionManager.getDataSource().getConnection();
        conn.setAutoCommit(false);
        //获取当前设置的point
        Savepoint point = conn.setSavepoint(uuid);
        try
        {
            for(JcUserBalance balance : jcUserBalances)
            {
                nums += jcUserBalanceMapper.insertSelective(balance);
            }
        }catch(Exception ex)
        {
            conn.rollback(point);
            ex.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        //保存完成后返回
        return nums;
    }
    
    
    
}