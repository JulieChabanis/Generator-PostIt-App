public class User {
	private static int numberUsers = 0;
	
	private int id;
	private String pseudo;
	private String function;
	
	public User(String pseudo, String function) {
		this.id = ++numberUsers;
		this.pseudo = pseudo;
		this.function = function;
	}
	
	public static int getNumberUsers() {
		return numberUsers;
	}

	public int getId() {
		return this.id;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
	
	@Override
	public boolean equals(Object o) {
		return o != null && o.getClass() == this.getClass()
				&& ((User) o).getId() == this.getId();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public String toString() {
		return this.getPseudo() + ", " + this.getFunction(); 
	}
}