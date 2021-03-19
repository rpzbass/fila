package entities;

public class Client {

	private String client;
	private String email;
	
	public Client() {
		
	}
	
	public Client(String client,String email) {
		this.client = client;
		this.email = email;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return client + " email=" + email +"\n" ;
	}
	
	
	
	
	
}
