package br.com.fiap.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	private String email;
	private String password;
	private String phone;
	private String cpf;
	




	public User(String name, Date birthDate, String email, String password, String phone, String cpf) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.cpf = cpf;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Date getBirthDate() {
		return birthDate;
	}




	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public User() {
		super();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	
	

}
