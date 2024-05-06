package APP;

import javax.ejb.Stateful;

import entity.List;



public class ListService {
	public List createList(String name,int id ) {
		return new List(name,id);
	}
}
//m