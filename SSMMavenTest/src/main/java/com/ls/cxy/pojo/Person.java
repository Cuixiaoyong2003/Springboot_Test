package com.ls.cxy.pojo;

import org.apache.ibatis.type.Alias;

/**
 * 简单Java实体类对象测试
 * 
 * @author Cuixiaoyong
 *
 */
@Alias(value = "Person")
public class Person {
	private Integer id;

	private String name;

	private Integer age;

	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}