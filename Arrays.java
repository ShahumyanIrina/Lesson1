public class Arrays{
	public static void main(String[] args){
		int[] numbers= {1,2,3,4,5} ;
		System.out.println(numbers[4]);

		double[] asd= new double[4];
		asd[0]=(double)numbers[4]/numbers[1];
		asd[1]=3.14;
		asd[2]= numbers[4]/asd[0];
		System.out.println(asd[0]);
		System.out.println(asd[1]);
		System.out.println(asd[2]);
		
		String[] names= new String[6];
		names[0]="Anahit";
		names[1]="Tatev";
		names[2]="Mkho";
		names[3]="Gag";
		names[4]="Elen";
		names[5]="Anna";
		System.out.println(names[5]);
		if(names.length%2!=0){
			System.out.println(names[names.length-1]);
		} else if(names[names.length-1]=="Anna"){
			System.out.println(names[1]);

		} else{
			System.out.println(names[0]);
		}
	
		}
       }
	
