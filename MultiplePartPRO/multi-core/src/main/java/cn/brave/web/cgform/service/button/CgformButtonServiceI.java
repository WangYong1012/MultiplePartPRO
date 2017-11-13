package cn.brave.web.cgform.service.button;

import cn.brave.tags.core.common.service.CommonService;
import cn.brave.web.cgform.entity.button.CgformButtonEntity;

import java.util.List;

/**
 * 
 * @author  张代浩
 *
 */
public interface CgformButtonServiceI extends CommonService {
	
	/**
	 * 查询按钮list
	 * @param formId
	 * @return
	 */
	public List<CgformButtonEntity> getCgformButtonListByFormId(String formId);

	/**
	 * 校验按钮唯一性
	 * @param cgformButtonEntity
	 * @return
	 */
	public List<CgformButtonEntity> checkCgformButton(CgformButtonEntity cgformButtonEntity);
	
	
}
