package ejbs;

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
	String userName;
	@NotNull
	@Size (min=4, max=20)
	String name;
	@NotNull
	@Size (min=4, max=20)
	String password;
	@NotNull
	String email;
	boolean isLeader;
	Board board[];
	//setters
	public void setUserName(String userName) {
		this.userName=userName;
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
	
	public String getUserName() {
		return userName;
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
