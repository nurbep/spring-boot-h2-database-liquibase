package com.hhimanshu.persistence.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity extends Audit{
	 @Column(nullable = false, unique = true)
	 private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

}
