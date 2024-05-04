package ejbs;

import javax.persistence.Entity;
import javax.persistence.Id;
//
@Entity
public class List {
	@Id
	int id;
	String name;
	
	Card cards[];
		//constractor
		public List(String name,int id) {
			this.id=id;
			this.name=name;
		}
		//setters
		public void setId(int id) {
			this.id=id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setCards(Card cards[]) {
			this.cards=cards;
		}
		//getters
		
		public String getName() {
			return name;
		}
		public int getId() {
			return id;
		}
		public Card[] getCards() {
			return cards;
		}
		//methods
}
