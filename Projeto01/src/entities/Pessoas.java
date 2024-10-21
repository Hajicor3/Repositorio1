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
