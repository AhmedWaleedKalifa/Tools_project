package entity;

import java.util.ArrayList;

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
	String email;
	@Size (min=4, max=20)
	String name;
	@NotNull
	@Size (min=4, max=20)
	String password;
	@NotNull
	boolean isLeader;
	ArrayList<Board>boards=new ArrayList<>();
	//constructor
	public User() {
		name="----";
		password="00000";
		email="-----";
	}
	public User(String name,String password,String email, boolean isLeader) {

		this.name=name;
		this.password=password;
		this.email=email;
		this.isLeader=isLeader;
	}
	//setters
	
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
	//add single board to boards list
	public void setBoards(Board b) {
		boards.add(b);
	}
	//getters
	
	
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
	public ArrayList<Board> getBoards(){
		return boards;
	}

}
//m