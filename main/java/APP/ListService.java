package APP;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ejbs.ListEjb;
import entity.List;

@Stateful
@Path("/lists")
public class ListService {
	@EJB
	ListEjb listEjb;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("create")
	public List createList(List l) {
		return listEjb.createList(l);
	}
}
