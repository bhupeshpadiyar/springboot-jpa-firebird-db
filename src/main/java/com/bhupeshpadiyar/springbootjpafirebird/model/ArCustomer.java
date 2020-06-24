package com.bhupeshpadiyar.springbootjpafirebird.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ar_customer")
public class ArCustomer {
	
	@Id
	@Column(name = "code")
	private String code;
	@Column(name = "controlaccount")
	private String controlaccount;
	@Column(name = "companyname")
	private String companyname;
	@Column(name = "companycategory")
	private String companycategory;
	@Column(name = "creditterm")
	private String creditterm;
	
}
