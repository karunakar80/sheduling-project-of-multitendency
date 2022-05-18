package com.codingworld.multitenant.model;

import java.io.Serializable;


public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8741857713238735824L;
	
	private Long id;

    private String name;
    
    private Long rollNumber;

    private String tenantId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNumber=" + rollNumber + ", tenantId=" + tenantId + "]";
	}
	
    
    
}