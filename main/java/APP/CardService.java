package APP;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import ejbs.Card;

@Stateful
public class CardService {
	@EJB
    Card card ;
	
	public Card createCard(String name, int id,String description) {
		 card=new Card(name ,id,description);
		return card;
	}
	
}
