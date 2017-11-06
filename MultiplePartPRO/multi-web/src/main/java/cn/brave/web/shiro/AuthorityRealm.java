package cn.brave.web.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 2017年11月6日 10:45:39
 * 认证中心设置
 * @author Administrator
 * TODO：有了用户表以后需要改动此类
 */
public class AuthorityRealm extends AuthorizingRealm
{
	//需要将操作用户底层数据的service集成进来,以便获取用户信息
	
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal)
	{
		try
		{
			
			
			
			
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException
	{
		try
		{
			
			
			
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
