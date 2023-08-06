import java.util.List;

public class Bank {

 	private  String id;
	private  String prefix;
	private  String name;
	private  List<Branch> branches;
	private  List<Client> clients;
	private static int counter = 0;

	public Bank(String name){
		this.id = generateUniqueID(name);
		this.name = name;
		this.prefix = generatePrefix();
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public List<Branch> getBranches(){
		return branches;
	}

	public void setBranches(List<Branch> branches){
		this.branches = branches;
	}

	public List<Client> getClients(){
		return clients;
	}

	public void setClients(List<Client> clients){
		this.clients = clients;
	}

	public String getPrefix(){
		return prefix;
	}

	public void addBranch(Branch branch){
		this.branches.add(branch);
	}

	public void addClient(Client client){
		this.clients.add(client);
	}

	public String generatePrefix(){
		counter++;
		return "Bank-" + counter;
	}

	public String generateUniqueID(String name){
		return "Bank-" + name;
	}

}
