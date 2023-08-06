public class Branch {

	private  String id;
	private  String branchName;
	private  String branchCode;
	private static int counter = 0;

	public Branch ( String prefix,  String branchCode,  String branchName){
		counter++;
		this.id = prefix + counter;
		this.branchCode = branchCode;
		this.branchName = branchName;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getBranchCode(){
		return branchCode;
	}

	public void setBrancCode(String brancCode){
		this.branchCode = branchCode;
	}

	public String getBranchName(){
		return branchName;
	}

	public void setBranchName(String branchName){
		this.branchName = branchName;
	}

}