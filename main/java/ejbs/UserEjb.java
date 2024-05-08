package ejbs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
//import javax.annotation.security.RolesAllowed;
//import javax.resource.spi.work.SecurityContext;
//import javax.ws.rs.core.Context;

import APP.BoardService;
import entity.Board;
import entity.User;

@Stateless 
public class UserEjb {
    @PersistenceContext(unitName="hello")
    private EntityManager em;
    
//    @Context
//    private SecurityContext securityContext;

    // Method to register a new user
   
    public String register(User u) {
		 if (em.find(User.class, u.getUserName()) == null) {
	            em.persist(u);
	            String name = u.getName();
	            return name + " registered successfully";
	        } else {
	            return "User already exists";
	        }
	}
    // Method to login a user
    public String login(User u) {
    	//this query to get list of users that has the same email as we input and has same password 
        String queryStr = "SELECT u FROM User u WHERE u.email = :email AND u.password = :password";
        Query query = em.createQuery(queryStr);
        query.setParameter("email", u.getEmail());
        query.setParameter("password", u.getPassword());

        List<User> resultList = query.getResultList();
        if (resultList != null && !resultList.isEmpty()) {
            User loggedInUser = resultList.get(0);
            String result = "Hello " + loggedInUser.getName() + ", you logged in successfully";
            return result;
        } else {
            return "Login failed. Incorrect email or password.";
        }
    }
    
    public String updateProfile(User u) {
    		if(em.find( User.class,u.getUserName())!=null) {
    			em.merge(u);
                return "User profile updated successfully";
    		}else {
    			return "User not found the update failed";
    		}
    		
    }


}
//