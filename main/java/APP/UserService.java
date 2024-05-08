package APP;




import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ejbs.UserEjb;
import entity.User;



@Stateful
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserService {
	@PersistenceContext(unitName="hello")
	private EntityManager em;
	@EJB
	UserEjb userejb;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("register")
	public String register(User u){
		return userejb.register(u);
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("login")
	public String login(User u) {
	  return userejb.login(u);
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("update")
	public String uptadeProfile(User u) {
		return userejb.updateProfile(u);
	}
	
}
