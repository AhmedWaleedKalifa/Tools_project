package APP;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ejbs.CardEjb;
import entity.Card;
//@RolesAllowed("teamleader,collaborator")
@Stateful
@Path("/cards")
public class CardService {
	@EJB
	CardEjb cardEjb;
	//Card ID is the entity identifier so no 2 IDs can coexist
	//handle error 500 after creating another card object of existing Id and return 403 forbidden
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("create")
	public String createCard(@QueryParam("id")int id ,Card c) {
		
		return cardEjb.createCard(c,id);
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("delete")
	public String deleteCard(Card c) {
		return cardEjb.deleteCard(c);
	}
}