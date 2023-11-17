package com.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.demo.entity.Authority;


import lombok.Data;

@Data
@Entity
@Table(name = "Role")
public class Role implements Serializable{
	@Id
	private String id;
	private String name;
	@OneToMany(mappedBy = "role")
	List<Authority> authorities;
}
