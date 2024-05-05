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
	UserEjb user;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("register")
	public String register(User u){
		return user.register(u);
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("login")
	public String login(User u) {
	  return user.login(u);
	}
	
	//need test
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Path("update")
//	public String updateProfile(User u,String password) {
//		User temp=em.find(User.class, u.getEmail());
//		if(temp!=null&&temp.getPassword()==u.getPassword()) {
//			em.merge(u);
//			return "The user updated successfully";
//
//		}else {
//			return "the password is  incorrect";
//		}
//	}

	//methods
//	@EJB
//	BoardService boardService;
//	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Path("createBoard")
//	public void createBoard() {
//		boardService.createBoard(, , )
//	}
//	public void deleteBoard() {
//		
//	}
//	
//	public String viewBoard(int id) {
//		try{
//			return "board name "+user.getBoards().get(0).getName();
//		}
//		catch(Exception e){
//			return "boards list is empty!";
//		}
//	}
//	
//	@EJB
//	Card card;
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Path("createCard")
//	public void createCard(Card c) {
//		
//	}
//	
	
}