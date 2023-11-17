package com.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Product")
public class Product implements Serializable {
	@Id
	Integer id;
	String name;
	String price;
	String image;;
	String nft_name;
	@ManyToOne
	@JoinColumn(name = "username")
	private Infomation infomation;

}
