<#assign className=table.className/>
<#assign classNameLower = table.classNameFirstLower/>
<#if className?starts_with("Tdim")>
    <#assign className = className?substring(4)?cap_first/>
</#if>
<#if className?starts_with("T")>
    <#assign className = className?substring(1)?cap_first/>
</#if>
<#if classNameLower?starts_with("tdim")>
    <#assign classNameLower = classNameLower?substring(4)?uncap_first/>
</#if>
<#if classNameLower?starts_with("t")>
    <#assign classNameLower = classNameLower?substring(1)?uncap_first/>
</#if>
${gg.setOverride(false)}<#t/>
${gg.setOutputFile(javaPath+"\\dao\\${pageModuleName}\\"+className+"Dao.java")}<#t/>
/**
*@Project: LXC_WEB
*@Author: ${author}
*@Date: ${createTime}
*@Copyright: 2015-2020 LVXC . All rights reserved.
*/
package ${basepackage}.dao.${pageModuleName};
import ${basepackage}.entity.${pageModuleName}.${className};
import ${basepackage}.dao.base.IBaseDao;
/**
* @ClassName: ${className}Dao
* @Description:
* @author ${author}
* @date ${createTime}
*/
public interface ${className}Dao extends IBaseDao<${className}>{
	
}