public class Loop{
	

public static void main (String [] args){

int a = 4;
int b = 5;
/*
while(a<b && b==5){
	System.out.println("While loop");
}
*/


/*int counter=4;
while(counter>0) {
	
System.out.println("While loop");
		counter--;
	}
	*/

String[] names= {"Irina", "Tatev", "Anahit", "Elen","Anna", "Gagik", "Hasmik"};
/*for (int i=0;i<names.length; i++){
	System.out.println(names[i]);
}
*/
for (String name:names){
	System.out.println(name);
}
}

}
