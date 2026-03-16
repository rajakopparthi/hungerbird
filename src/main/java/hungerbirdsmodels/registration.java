package hungerbirdsmodels;

public class registration {
	private int id;
	private String username;
	private String firstname;
	private String lastame;
	private String email;
	private String pasword;
	private String confirmpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastame() {
		return lastame;
	}
	public void setLastame(String lastame) {
		this.lastame = lastame;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public registration(int id, String username, String firstname, String lastame, String email, String pasword,
			String confirmpassword) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastame = lastame;
		this.email = email;
		this.pasword = pasword;
		this.confirmpassword = confirmpassword;
	}
	public registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}