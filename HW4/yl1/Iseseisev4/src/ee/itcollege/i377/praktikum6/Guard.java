package ee.itcollege.i377.praktikum6;

public class Guard {
	
	@Size(min=1, max=16)
	@NotNull 
	private String name;
	
	@Min(15)
	@NotNull 
	private int age;
	
	@Min(9) @Max(9)
	@NotNull 
	private String idCode;
	
	@ValidEmail 
	@NotNull 
	private String EmailAddress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String idCode() {
		return idCode;
	}
	public void idCode(String idCode) {
		this.idCode = idCode;
	}
	
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAdress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

}
