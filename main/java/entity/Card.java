package entity;

import javax.ejb.Stateful;
import javax.persistence.Entity;

//@Stateful
//@Entity
public class Card {
	String name;
	int id;
	String description;
		//constructor
		public Card(String name,int id,String description) {
			this.name=name;
			this.id=id;
			this.description=description;
		}
		public Card() {
			
		}
		//setters
		public void setId(int id) {
			this.id=id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setDescription(String description) {
			this.description=description;
		}
		
		//getters
		
		public String getName() {
			return name;
		}
		public int getId() {
			return id;
		}
		public String getDescription() {
			return description;
		}
		//methods
}