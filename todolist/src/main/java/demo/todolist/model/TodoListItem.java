package demo.todolist.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TodoListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDoItem;
    @ManyToOne
    private TodoList todoList;

    public TodoListItem() {
    }

    public TodoListItem(Integer id, String nomeDoItem) {
        this.id = id;
        this.nomeDoItem = nomeDoItem;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDoItem() {
        return this.nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nomeDoItem='" + getNomeDoItem() + "'" +
                "}";
    }

}
