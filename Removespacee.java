public class Removespacee{

	public static void main(String[]args){

	String str = "Good morning Vietnam";
	String noSpaceStr = str.replaceAll("\\s" , "");
	System.out.println(noSpaceStr);


	}
	
}