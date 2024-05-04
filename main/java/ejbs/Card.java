package ejbs;

import javax.persistence.Entity;
import javax.persistence.Id;
////
@Entity
public class Card {
	@Id
	int id;
	String name;
	
	String description;
		//constractor
		public Card(String name,int id,String description) {
			this.name=name;
			this.id=id;
			this.description=description;
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
