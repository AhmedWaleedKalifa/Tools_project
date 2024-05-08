package APP;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ejbs.BoardEjb;

import java.util.ArrayList;
import java.util.Queue;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.inject.Inject;

import entity.Board;
import entity.List;
import entity.User;

//@RolesAllowed("teamleader")
@Path("/boards")
public class BoardService {
	@EJB
	BoardEjb boardEjb;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("create")
    public Board createBoard(Board b) {
        return boardEjb.createBoard(b);
    }
//    @Resource(lookup="java:/jms/queue/DLQ")
//    private Queue msgQueue;
//    @Inject
//    private JMSContext jmsContext;
//    
//    public void handleBoardChange(Board board) {
//    	try {
//    		String msg = "Board change message";
//    		jmsContext.createProducer().send((Destination) msgQueue,msg);
//    	}
//    	catch(Exception e) {
//    		
//    	}
//    }
}