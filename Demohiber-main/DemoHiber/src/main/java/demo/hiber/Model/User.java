package demo.hiber.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class User implements Serializable{
	@Id
	@Column(name="userid")
	private String userid;
	@Column(name="pass")
	private String pass;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String pass) {
		super();
		this.userid = userid;
		this.pass = pass;
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
	
}
