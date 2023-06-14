
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class Connection{
	public static void main (String[] args){
	    List<String> websites=new ArrayList<>();
		websites.add("www.google.com");
		websites.add( "www.youtube.com");
		websites.add("www.facebook.com");
		websites.add("www.imdb.com") ; 
		websites.add("www.irinashahumyan.com");
		
		for (String website: websites){

	    	try { 
		    	InetAddress address=InetAddress.getByName(website);
		    	boolean isConnected=address.isReachable(5000) ; // Timeout in milliseconds
		      	System.out.println(website + " is " + (isConnected ? "is accessible from your device" : " is not accessible from your device "));
	        } catch (Exception e) {
				System.out.println("Check your network connection"  + " " + website);
			}
			
 
		}
	}
}