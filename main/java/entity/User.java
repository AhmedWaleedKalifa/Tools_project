package entity;

import javax.ejb.Stateful;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Stateful
@Entity
public class User {
	@Id
	@NotNull
	int id;
	@NotNull
	@Size (min=4, max=20)
	String name;
	@NotNull
	@Size (min=4, max=20)
	String password;
	@NotNull
	String email;
	boolean isLeader;
//	Board board[];
	//constructor
	public User() {
		id=0;
		name="----";
		password="00000";
		email="-----";
	}
	public User(int id,String name,String password,String email, boolean isLeader) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.email=email;
		this.isLeader=isLeader;
	}
	//setters
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setIsLeader(boolean isLeader) {
		this.isLeader=isLeader;
	}
	//getters
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	public boolean getIsLeader() {
		return isLeader;
	}
	//methods
	
	
	}