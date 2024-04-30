package ejb;

public class Board {
	int id;
	String name;
	User creator;
	User collaborators[];
	List lists[];
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
	
	public String getUserName() {
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
}
