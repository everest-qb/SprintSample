package tw.taichung.spring.test.jpa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Abc implements Serializable {

	private static final long serialVersionUID = 547305675015603767L;
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column(nullable=true)
	private int number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Abc [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
}
