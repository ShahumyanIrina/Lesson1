import java.util.List;

public class Client {

	private  String id;
	private  int clientCode;
	private  List<Account> accounts;
	private static int counter = 0;

	public Client(String prefix, int clientCode){
		counter++;
		this.id = prefix + counter;
		this.clientCode = clientCode;
	}
	
	public String getId(){
		return id;
	}
	public void setID(String id){
		this.id = id;
	}

	public int getClientCode(){
		return clientCode;
	}
	public void setClientCode(int clientCode){
		this.clientCode = clientCode;
	}

	public void addAccounts(Account account){
		this.accounts.add(account);
	}

	public List<Account> getAccounts(){
		return accounts;
	}

	public void setAccounts(List<Account> accounts){
		this.accounts = accounts;
	}

}