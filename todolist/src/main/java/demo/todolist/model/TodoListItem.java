package demo.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDoItem;
    private String todoList;

    public TodoListItem() {
    }

    public TodoListItem(Integer id, String nomeDoItem, String todoList) {
        this.id = id;
        this.nomeDoItem = nomeDoItem;
        this.todoList = todoList;
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

    public String getTodoList() {
        return this.todoList;
    }

    public void setTodoList(String todoList) {
        this.todoList = todoList;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nomeDoItem='" + getNomeDoItem() + "'" +
                ", todoList='" + getTodoList() + "'" +
                "}";
    }

}
