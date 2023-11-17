package com.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.demo.entity.Account;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Infomation")
public class Infomation implements Serializable{
	@Id
    Long id;
	@ManyToOne 
	@JoinColumn(name = "username")
	Account account;
	String name;
	String stage_name;
	String avatar;
	String wallet_address;
	@OneToMany(mappedBy = "infomation")
	List<Product> product;
}
