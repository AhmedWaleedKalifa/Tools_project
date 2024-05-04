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
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserService {
	@PersistenceContext(unitName="hello")
	private EntityManager em;
	@EJB
	User user;
//	ArrayList<User>usersList=new ArrayList<User>();
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("register")
	public String register(User u){
		if(em.find(User.class, u.getUserName())==null) {
			em.persist(u);
//			usersList.add(u);
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
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("update")
	public String updateProfile(User u,String password) {
		User temp=em.find(User.class, u.getUserName());
		if(temp!=null&&temp.getPassword()==u.getPassword()) {
			em.merge(u);
			return "The user updated successfully";

		}else {
			return "the password is  incorrect";
		}
	}
//	@GET 
//	@Path("login")
//	public String login(User u) {
//	    String queryStr = "SELECT u FROM User u WHERE u.email = :email AND u.password = :password";
//	    Query query = em.createQuery(queryStr);
//	    query.setParameter("email", u.getEmail());
//	    query.setParameter("password", u.getPassword());
//
//	    
//	        if((User) query.getSingleResult()!=null) {
//	        	 String result = "Hello " + u.getName() + ", you logged in successfully";
//	 	        return result;
//	        }else {
//		        return "Login failed. Incorrect email or password.";
//
//	        }	    
//	}
	
//	@GET 
//	@Path("login")
//	public String login(User u) {
//		String simpleQuery="FROM User WHERE password = "+u.getPassword()+" And "+"email ="+u.getEmail();
//		Query query=em.createQuery(simpleQuery);
//		List<User> l=query.getResultList();
//		int f=0;
////		l= new ArrayList<User>();
//		for(int i =0;i<l.size();i++) {
//			if(u.getEmail()==l.get(i).getEmail()&u.getPassword()==l.get(i).getPassword()) {
//				f=1;
//				break;
//			}else {
//				f=0;
//			}
//		}
//		 if(f==1) {
//			 String result= "Hello "+ u.getName()+" you login successfully";
//			 return result;
//		 }else {
//			 return "Loin failed";
//		 }
//	}
//	

}