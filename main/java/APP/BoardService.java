package APP;

import javax.ejb.Stateful;

import entity.Board;
import entity.User;

public class BoardService {
	public Board createBoard(String name,int id ,User u) {
		return new Board(name,id,u);
	}
}
