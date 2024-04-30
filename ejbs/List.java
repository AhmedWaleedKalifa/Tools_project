package ejb;

public class List {
	String name;
	int id;
	Card cards[];
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
		
		public String getUserName() {
			return name;
		}
		public int getId() {
			return id;
		}
		public Card[] getCards() {
			return cards;
		}
}
