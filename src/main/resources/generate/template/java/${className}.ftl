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
${gg.setOutputFile(javaPath+"\\entity\\${pageModuleName}\\"+className+".java")}<#t/>
/**
*@Project: LXC_WEB
*@Author: ${author}
*@Date: ${createTime}
*@Copyright: 2015-2020 LVXC . All rights reserved.
*/
package ${basepackage}.entity.${pageModuleName};

/**
* @ClassName: ${className}
* @Description:${(table.remarks)!}
* @author ${author}
* @date ${createTime}
*/
public class ${className}{
	
	<#list table.columns as column>
    /**
     *${(column.remarks)!}
     */
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#list>

<@generateJavaColumns/>

	public String toString() {
		return "${className}{" +
			<#list table.columns as column>
            	"${column.columnNameLower}=" + ${column.columnNameLower} +
			</#list>
				'}';
	}
}

<#macro generateJavaColumns>
	<#list table.columns as column>
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>


