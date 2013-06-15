package com.company.web.domain;

import java.util.Date;

import com.company.common.utils.validation.Validateable;
import com.company.common.utils.validation.constraints.Length;
import com.company.common.utils.validation.constraints.NotNull;
/**
 * 
 *@author thinkingdyw
 *----------------------------------
 * 2013-6-12 
 * email:thinkingdyw@gmail.com
 */
public class EntityA implements Validateable{
	
	private Long id;
	private String name;
	private Date createTime;
	private Integer[] hobbies;
	private EntityB b = new EntityB();
	@NotNull(name="用户名")
	@Length(max=10,name="用户名")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(Integer[] hobbies) {
		this.hobbies = hobbies;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@NotNull(name="生成日期")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public EntityB getB() {
		return b;
	}
	public void setB(EntityB b) {
		this.b = b;
	}
	
}