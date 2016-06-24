/**
*@Project: LXC_WEB
*@Author: lvxiaocheng
*@Date: 2016-6-24
*@Copyright: 2015-2020 LVXC . All rights reserved.
*/
package com.lxxc.entity.user;

/**
* @ClassName: User
* @Description:
* @author lvxiaocheng
* @date 2016-6-24
*/
public class User{
	
    /**
     *
     */
	private Integer id;
    /**
     *
     */
	private String name;
    /**
     *
     */
	private String password;

	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return this.password;
	}

	public String toString() {
		return "User{" +
            	"id=" + id +
            	"name=" + name +
            	"password=" + password +
				'}';
	}
}

