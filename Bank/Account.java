public class Account {

	private  String id;
	private String account;
	private static int counter = 0;

	public Account(String prefix, String account){
		counter++;
		this.id = prefix + counter;
		this.account = account;
	}

	public String getID(){
		return id;
	}

	public void setID(String id){
		this.id = id;
	}

	public void setAccount(String account){
		this.account = account;
 	}

	public String getAccount() {
		return account;
	}

}	
