package i377.team6.yl3.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Guard
 *
 */
@Entity

public class Guard implements Serializable {

	   
	@Id
	private Integer Id;
	private int age;
	private String name;
	private static final long serialVersionUID = 1L;
	
	public Guard(int index) {
		this.Id = index;
	}

	public Guard() {
		super(); 
	}   
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
