package demo.todolist.repository;

import org.springframework.data.repository.CrudRepository;

import demo.todolist.model.TodoListItem;

public interface TodoListItemRepository extends CrudRepository<TodoListItem, Integer> {

}
