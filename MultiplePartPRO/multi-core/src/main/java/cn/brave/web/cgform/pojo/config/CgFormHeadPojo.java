package cn.brave.web.cgform.pojo.config;


/**   
 * @Title: Entity
 * @Description: 自动生成表属性
 * @author jueyue
 * @date 2013-06-30 11:36:53
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
public class CgFormHeadPojo implements java.io.Serializable {
	/**id*/
	private String id;
	/**表格名称*/
	private String tableName;
	/**dategrid是否为树形*/
	private String isTree;
	/**datagrid是否分页*/
	private String isPagination;
	/**是否同步了数据库*/
	private String isDbsynch;
	/**datagrid是否显示复选框*/
	private String isCheckbox;
	/**查询模式：single(单条件查询：默认),group(组合查询)*/
	private String querymode;
	/**功能注释*/
	private String content;
	/**创建时间*/
	private java.util.Date createDate;
	/**创建人ID*/
	private String createBy;
	/**创建人名称*/
	private String createName;
	/**修改时间*/
	private java.util.Date updateDate;
	/**修改人*/
	private String updateBy;
	/**修改人名称*/
	private String updateName;
	/**表单版本*/
	private String jformVersion;
	/**表单类型*/
	private Integer jformType;
	/**表单主键策略*/
	private String jformPkType;
	/**表单主键策略-序列(针对oracle等数据库)*/
	private String jformPkSequence;
	/**附表关联类型*/
	private Integer relationType;
	/**附表清单*/
	private String subTableStr;
	/**一对多Tab顺序*/
	private Integer tabOrder;
	
	//--author：zhoujf---start------date:20170207--------for:online表单 表单导出字段不全
	/**树形列表 父id列名*/
	private String treeParentIdFieldName;
	/**树形列表 id列名*/
	private String treeIdFieldname;
	/**树形列表 菜单列名*/
	private String treeFieldname;
	/**表单分类*/
	private String jformCategory;
	/**表单模板*/
	private String formTemplate;
	/**表单模板样式(移动端)*/
	private String formTemplateMobile;
	/**表单类型，0为物理表，1为配置表*/
	private String tableType;
	/**配置表版本*/
	private Integer tableVersion;
	/**物理表id*/
	private String physiceId;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  id
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  表格名称
	 */
	public String getTableName(){
		return this.tableName;
	}
	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  表格名称
	 */
	public void setTableName(String tableName){
		this.tableName = tableName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  dategrid是否为树形
	 */
	public String getIsTree(){
		return this.isTree;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  dategrid是否为树形
	 */
	public void setIsTree(String isTree){
		this.isTree = isTree;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  datagrid是否分页
	 */
	public String getIsPagination(){
		return this.isPagination;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  datagrid是否分页
	 */
	public void setIsPagination(String isPagination){
		this.isPagination = isPagination;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否同步了数据库
	 */
	public String getIsDbsynch(){
		return this.isDbsynch;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否同步了数据库
	 */
	public void setIsDbsynch(String isDbsynch){
		this.isDbsynch = isDbsynch;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  datagrid是否显示复选框
	 */
	public String getIsCheckbox(){
		return this.isCheckbox;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  datagrid是否显示复选框
	 */
	public void setIsCheckbox(String isCheckbox){
		this.isCheckbox = isCheckbox;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  查询模式：single(单条件查询：默认),group(组合查询)
	 */
	public String getQuerymode(){
		return this.querymode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  查询模式：single(单条件查询：默认),group(组合查询)
	 */
	public void setQuerymode(String querymode){
		this.querymode = querymode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  功能注释
	 */
	public String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  功能注释
	 */
	public void setContent(String content){
		this.content = content;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间
	 */
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建时间
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人ID
	 */
	public String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人ID
	 */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	public String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  修改时间
	 */
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  修改时间
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  修改人ID
	 */
	public String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  修改人ID
	 */
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  修改人名称
	 */
	public String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  修改人名称
	 */
	public void setUpdateName(String updateName){
		this.updateName = updateName;
	}

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  表单版本号
	 */
	public String getJformVersion() {
		return jformVersion;
	}

	public void setJformVersion(String jformVersion) {
		this.jformVersion = jformVersion;
	}
	/**
	 *方法: 取得Integer
	 *1-单表,2-主表,3-从表
	 *@return: INteger  表单类型
	 */
	public Integer getJformType() {
		return jformType;
	}

	public void setJformType(Integer jformType) {
		this.jformType = jformType;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键策略
	 */
	public String getJformPkType() {
		return jformPkType;
	}

	public void setJformPkType(String jformPkType) {
		this.jformPkType = jformPkType;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键策略-序列
	 */
	public String getJformPkSequence() {
		return jformPkSequence;
	}

	public void setJformPkSequence(String jformPkSequence) {
		this.jformPkSequence = jformPkSequence;
	}

	public String getSubTableStr() {
		return subTableStr;
	}

	public void setSubTableStr(String subTableStr) {
		this.subTableStr = subTableStr;
	}
	
	/**
	 *方法: 取得Integer
	 *0：一对多 1：一对一
	 *@return: INteger  附表关联类型
	 */
	public Integer getRelationType() {
		return relationType;
	}

	public void setRelationType(Integer relationType) {
		this.relationType = relationType;
	}
	
	public Integer getTabOrder() {
		return tabOrder;
	}

	public void setTabOrder(Integer tabOrder) {
		this.tabOrder = tabOrder;
	}

	public String getTreeParentIdFieldName() {
		return treeParentIdFieldName;
	}

	public void setTreeParentIdFieldName(String treeParentIdFieldName) {
		this.treeParentIdFieldName = treeParentIdFieldName;
	}

	public String getTreeIdFieldname() {
		return treeIdFieldname;
	}

	public void setTreeIdFieldname(String treeIdFieldname) {
		this.treeIdFieldname = treeIdFieldname;
	}

	public String getTreeFieldname() {
		return treeFieldname;
	}

	public void setTreeFieldname(String treeFieldname) {
		this.treeFieldname = treeFieldname;
	}

	public String getJformCategory() {
		return jformCategory;
	}

	public void setJformCategory(String jformCategory) {
		this.jformCategory = jformCategory;
	}

	public String getFormTemplate() {
		return formTemplate;
	}

	public void setFormTemplate(String formTemplate) {
		this.formTemplate = formTemplate;
	}

	public String getFormTemplateMobile() {
		return formTemplateMobile;
	}

	public void setFormTemplateMobile(String formTemplateMobile) {
		this.formTemplateMobile = formTemplateMobile;
	}

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public Integer getTableVersion() {
		return tableVersion;
	}

	public void setTableVersion(Integer tableVersion) {
		this.tableVersion = tableVersion;
	}

	public String getPhysiceId() {
		return physiceId;
	}

	public void setPhysiceId(String physiceId) {
		this.physiceId = physiceId;
	}
	
	
}
