package com.ezen.spring.board.teampro;
  
import java.util.*;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
    
@Component("fairyMem")
@NoArgsConstructor
@AllArgsConstructor
@Data  
public class MemberVO 
{
	private int fnum;
	private String userid;
	private String pass;
	private String name;
	private String phone;
	private String email;
	//private String ad; //주소
	private String birth; //생년월일
	private String gender; 
	private boolean agrStipulation1;
    private boolean agrStipulation2;
    private boolean agrStipulation3;
	
   /* 
    @NoArgsConstructor 오류로 이용 불가시 아래 생성자 주석을 해제하세요 
	public MemberVO(){}  */
		
  
	/* @AllArgsConstructor 오류로 이용 불가시 아래 생성자 주석을 해제하세요 
	public MemberVO(int fnum, String userid, String pass, String name, String phone, String email, String birth,
			String gender, boolean agrStipulation1, boolean agrStipulation2, boolean agrStipulation3) 
{
		this.fnum = fnum;
		this.userid = userid;
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.email = email;
	    this.birth = birth;
		this.gender = gender;
		this.agrStipulation1 = agrStipulation1;
		this.agrStipulation2 = agrStipulation2;
		this.agrStipulation3 = agrStipulation3;
	}
*/			
			

/* @Data 안 되는 경우 아래 주석을 해제해서 사용하세요

	@Override
	public int hashCode() {
		return Objects.hash(userid, pass);
	}

	
	@Override
	public boolean equals(Object obj) {
		MemberVO other = (MemberVO) obj;
		return this.userid.equals(other.userid)&&this.pass.equals(other.pass);
		//return Objects.equals(userid, other.userid) && Objects.equals(userpw, other.userpw);
	}

		
	@Override
	public String toString() {
		
		return "%s %s %s %s %s %s %s %b %b %b".formatted(userid, pass, name, phone, email, birth, gender, agrStipulation1, agrStipulation2, agrStipulation3); 
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public boolean isAgrStipulation1() {
		return agrStipulation1;
	}


	public void setAgrStipulation1(boolean agrStipulation1) {
		this.agrStipulation1 = agrStipulation1;
	}


	public boolean isAgrStipulation2() {
		return agrStipulation2;
	}


	public void setAgrStipulation2(boolean agrStipulation2) {
		this.agrStipulation2 = agrStipulation2;
	}


	public boolean isAgrStipulation3() {
		return agrStipulation3;
	}


	public void setAgrStipulation3(boolean agrStipulation3) {
		this.agrStipulation3 = agrStipulation3;
	}


	*/
	

	
}
