package cn.brave.web.cgdynamgraph.service.core;

import cn.brave.tags.core.common.service.CommonService;
import cn.brave.web.cgdynamgraph.entity.core.CgDynamGraphConfigHeadEntity;
import cn.brave.web.cgdynamgraph.entity.core.CgDynamGraphConfigItemEntity;
import cn.brave.web.cgdynamgraph.entity.core.CgDynamGraphConfigParamEntity;

import java.util.List;


public interface CgDynamGraphConfigHeadServiceI extends CommonService {
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(CgDynamGraphConfigHeadEntity cgDynamGraphConfigHead,
						List<CgDynamGraphConfigItemEntity> cgDynamGraphConfigItemList, List<CgDynamGraphConfigParamEntity> cgDynamGraphConfigParamList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(CgDynamGraphConfigHeadEntity cgDynamGraphConfigHead,
                           List<CgDynamGraphConfigItemEntity> cgDynamGraphConfigItemList, List<CgDynamGraphConfigParamEntity> cgDynamGraphConfigParamList);
	public void delMain(CgDynamGraphConfigHeadEntity cgDynamGraphConfigHead);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(CgDynamGraphConfigHeadEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(CgDynamGraphConfigHeadEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(CgDynamGraphConfigHeadEntity t);
}
