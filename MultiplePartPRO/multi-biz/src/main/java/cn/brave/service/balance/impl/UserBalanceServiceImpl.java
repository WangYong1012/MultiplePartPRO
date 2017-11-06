package cn.brave.service.balance.impl;

import cn.brave.dao.mappers.balance.JcUserBalanceMapper;
import cn.brave.entity.JcUserBalance;
import cn.brave.service.balance.IUserBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBalanceServiceImpl implements IUserBalanceService
{
    @Autowired
    private JcUserBalanceMapper jcUserBalanceMapper;
    
    @Override
    public List<JcUserBalance> getList()
    {
        
        return jcUserBalanceMapper.selectByExample(null);
    }
    
    
    
    
    
    
}
