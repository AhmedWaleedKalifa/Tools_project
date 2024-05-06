package APP;

import java.util.ArrayList;

import entity.Board;
import entity.List;
import entity.User;

public class BoardService {
	public Board createBoard(String name,int id ,User u,ArrayList<User>collaborators,ArrayList<List>lists) {
		return new Board(name,id,u,collaborators,lists);
	}
}
//m
