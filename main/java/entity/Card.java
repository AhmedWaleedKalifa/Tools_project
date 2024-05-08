package entity;

import javax.ejb.Stateful;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import entity.List;
@Stateful
@Entity
public class Card {
	@Id
	int id;
	@NotNull
	String name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "creator_id")
	List container;
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
		public void setContainer(List l) {
			this.container=l;
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
		public List getContainer() {
			return container;
		}
}