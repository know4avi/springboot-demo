package com.capgemini.springboot.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "departments")
@CrossOrigin(origins = "http://localhost:3000/")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "department_id")
	private int departmentId;

	@Column(name = "department_name")
	private String departmentName;

	@Column(name = "city")
	private String city;

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, String city) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.city = city;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", city=" + city
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, departmentId, departmentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(city, other.city) && departmentId == other.departmentId
				&& Objects.equals(departmentName, other.departmentName);
	}

}