package com.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Account")
public class Account implements Serializable{
	@Id
	String username;
	String password;
	@OneToMany(mappedBy = "account")
	List<Infomation> infomation;
	@OneToMany(mappedBy = "account")
	List<Authority> authorities;
}