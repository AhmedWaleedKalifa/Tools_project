package APP;

import javax.ejb.Stateful;

import entity.Card;



public class CardService {
	public Card createCard(String name, int id ,String description ) {
		return new Card(name,id, description);
	}
}
