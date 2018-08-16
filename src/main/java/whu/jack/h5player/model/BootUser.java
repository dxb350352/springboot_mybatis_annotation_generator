package whu.jack.h5player.model;

import java.lang.Long;
import java.lang.String;
import java.lang.Integer;
import java.util.Date;

public class BootUser{
	private Long testId;
	private Long tenantId;
	private String name;
	private Integer age;
	private Integer testType;
	private Date testDate;
	private Long role;
	private String phone;

	public Long getTestId(){
		return this.testId;
	}

	public void setTestId(Long testId){
		this.testId=testId;
	}

	public Long getTenantId(){
		return this.tenantId;
	}

	public void setTenantId(Long tenantId){
		this.tenantId=tenantId;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name=name;
	}

	public Integer getAge(){
		return this.age;
	}

	public void setAge(Integer age){
		this.age=age;
	}

	public Integer getTestType(){
		return this.testType;
	}

	public void setTestType(Integer testType){
		this.testType=testType;
	}

	public Date getTestDate(){
		return this.testDate;
	}

	public void setTestDate(Date testDate){
		this.testDate=testDate;
	}

	public Long getRole(){
		return this.role;
	}

	public void setRole(Long role){
		this.role=role;
	}

	public String getPhone(){
		return this.phone;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}

}
