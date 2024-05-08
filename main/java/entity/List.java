package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class List {
	@Id
	int id;
	String name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "creator_id")
	Board container;
	Card cards[];
		//constructor
		public List(String name,int id) {
			this.id=id;
			this.name=name;
		}
		public List() {
			id = 0;
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
		public void setContainer(Board b) {
			this.container=b;
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
		public Board getContainer() {
			return container;
		}
}