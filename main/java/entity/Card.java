package entity;

import javax.ejb.Stateful;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Stateful
@Entity
public class Card {
	@Id
	int id;
	@NotNull
	String name;
	
	String description;
		//constructor
		public Card(String name,int id,String description) {
			this.name=name;
			this.id=id;
			this.description=description;
		}
		public Card() {
			id=1;
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
}