package APP;

import javax.ejb.EJB;
import javax.ejb.Stateful;


import ejbs.List;

@Stateful
public class ListService {
	@EJB
	List list;
	public List CreateList (String name,int id) {
		list=new List(name,id);
		return list;
	}
	
}
//