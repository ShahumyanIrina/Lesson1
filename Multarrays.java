import java.util.Arrays;

public class Multarrays{

	public static void main(String[]args){
		int[]arrays1 = {1,2,3,4};		
		System.out.println(Arrays.toString(multEachElement(arrays1)));
	}
	
    public static int[] multEachElement(int[] arrays1){
    	
		int[] arrays = new int[arrays1.length];

		for (int i = 0; i < arrays1.length; i++){
			arrays[i] = arrays1[i] * 3;
				
        }
        return arrays;
          
	}

}
