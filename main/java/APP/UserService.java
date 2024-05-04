package APP;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ejbs.User;

@Stateful

@Path("/users")
public class UserService {
	
	@PersistenceContext(unitName="hello")
    private EntityManager em;
	@EJB
    User user;
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("register")
	public String register(User u) {
		if(em.find(User.class, u.getEmail())==null) {
            em.persist(u);
            //usersList.add(u);
            String name=u.getName();
            return name+ " Register successfully";
        }else {
            return "You Registered before";
        }
	}
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("login")
    public String login(User u) {
        String queryStr = "SELECT u FROM User u WHERE u.email = :email AND u.password = :password";
        Query query = em.createQuery(queryStr);
        query.setParameter("email", u.getEmail());
        query.setParameter("password", u.getPassword());

        List<User> resultList = query.getResultList();
        if (resultList != null && !resultList.isEmpty()) {
            User loggedInUser = resultList.get(0); // Assuming unique email-password combination
            String result = "Hello " + loggedInUser.getName() + ", you logged in successfully";
            return result;
        } else {
            return "Login failed. Incorrect email or password.";
        }
    }
}