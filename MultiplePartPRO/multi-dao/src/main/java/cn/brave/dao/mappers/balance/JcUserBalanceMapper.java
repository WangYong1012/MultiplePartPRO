package cn.brave.dao.mappers.balance;

import cn.brave.entity.JcUserBalance;
import cn.brave.entity.JcUserBalanceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public abstract interface JcUserBalanceMapper
{
    public abstract int countByExample(JcUserBalanceExample paramJcUserBalanceExample);

    public abstract int deleteByExample(JcUserBalanceExample paramJcUserBalanceExample);

    public abstract int deleteByPrimaryKey(Integer paramInteger);

    public abstract int insert(JcUserBalance paramJcUserBalance);

    public abstract int insertSelective(JcUserBalance paramJcUserBalance);

    public abstract List<JcUserBalance> selectByExample(JcUserBalanceExample paramJcUserBalanceExample);

    public abstract JcUserBalance selectByPrimaryKey(Integer paramInteger);

    public abstract int updateByExampleSelective(@Param("record") JcUserBalance paramJcUserBalance, @Param("example") JcUserBalanceExample paramJcUserBalanceExample);

    public abstract int updateByExample(@Param("record") JcUserBalance paramJcUserBalance, @Param("example") JcUserBalanceExample paramJcUserBalanceExample);

    public abstract int updateByPrimaryKeySelective(JcUserBalance paramJcUserBalance);
  
    public abstract int updateByPrimaryKey(JcUserBalance paramJcUserBalance);
}
