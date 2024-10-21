package entities;

public class Pessoas {
	private Integer id;
	private String name;
	private String email;
	private String adress;
	private String birthDate;

	
	public Pessoas(Integer id, String name, String email, String adress, String birthDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.adress = adress;
		this.birthDate = birthDate;
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String toString() {
		return "ID " +
				id +
				":" 
				+ name 
				+ ", email: " 
				+ email + 
				", Endereço: " 
				+ adress +
				", Data de nascimento: "
				+ birthDate;
	}

	
	}
