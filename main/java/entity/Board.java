package entity;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.ArrayList;

import javax.ejb.Stateful;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Stateful
@Entity
public class Board {
    @Id
    @NotNull
    int id;
    @Size (min=4, max=20)
    String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "creator_id")
    User creator;
    ArrayList<User> collaborators=new ArrayList<>();
    ArrayList <List>lists=new ArrayList<>();
    //constructor
    public Board(String name,int id,User creator,ArrayList<User>collaborators,ArrayList<List>lists) {
        this.name=name;
        this.id=id;
        this.creator=creator;
        this.collaborators=collaborators;
        this.lists=lists;
    }
    public Board() {
    	id=0;
        name="---";
        
    }
    //setters
    public void setId(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setCreator(User creator) {
        this.creator=creator;
    }
    public void setLists(ArrayList<List>lists) {
        this.lists=lists;
    }
    //getters
    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public User getCreator() {
        return creator;
    }
    public ArrayList<List> getLists() {
        return lists;
    }

}