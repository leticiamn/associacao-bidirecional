package demo.todolist.repository;

import demo.todolist.model.TodoList;

import org.springframework.data.repository.CrudRepository;

public interface TodoListRepository extends CrudRepository<TodoList, Integer> {

}
