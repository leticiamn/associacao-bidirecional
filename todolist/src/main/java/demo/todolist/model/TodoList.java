package demo.todolist.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @OneToMany(mappedBy = "id")
    private List<TodoListItem> items = new ArrayList<TodoListItem>();

    public TodoList() {
    }

    public TodoList(Integer id, String nome, List<TodoListItem> items) {
        this.id = id;
        this.nome = nome;
        this.items = items;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<TodoListItem> getItems() {
        return this.items;
    }

    public void setItems(List<TodoListItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nome='" + getNome() + "'" +
                ", items='" + getItems() + "'" +
                "}";
    }

}
