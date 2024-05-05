package entity;

import javax.ejb.Stateful;
import javax.persistence.Entity;
//@Stateful
//@Entity
public class Board {
	
	String name;
	int id;
	User creator;
	User collaborators[];
	List lists[];
	//constructor
	public Board(String name,int id,User creator) {
		this.name=name;
		this.id=id;
		this.creator=creator;
	}
	public Board() {
		name="---";
	}
	//setters
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setCreator(User creator) {
		this.creator=creator;
	}
	public void setLists(List lists[]) {
		this.lists=lists;
	}
	//getters
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public User getCreator() {
		return creator;
	}
	public List[] getLists() {
		return lists;
	}
	//methods
}