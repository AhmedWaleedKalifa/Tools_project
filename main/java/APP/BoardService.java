package APP;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import ejbs.Board;
import ejbs.User;

@Stateful
public class BoardService {
	@EJB
	Board board;
	public Board CreateBoard (String name,int id,User creator) {
		board=new Board(name,id,creator);
		return board;
	}
}
