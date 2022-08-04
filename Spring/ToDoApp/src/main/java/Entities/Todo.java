package Entities;

import java.sql.Date;

public class Todo {
	
	private String todoTittle;
	private String todoContent;
	private Date todeDate;
	public String getTodoTittle() {
		return todoTittle;
	}
	public void setTodoTittle(String todoTittle) {
		this.todoTittle = todoTittle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getTodeDate() {
		return todeDate;
	}
	public void setTodeDate(Date todeDate) {
		this.todeDate = todeDate;
	}
	@Override
	public String toString() {
		return this.getTodoTittle()+" : "+this.todoContent;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(String todoTittle, String todoContent, Date todeDate) {
		super();
		this.todoTittle = todoTittle;
		this.todoContent = todoContent;
		this.todeDate = todeDate;
	}
	
	
	
	
}
