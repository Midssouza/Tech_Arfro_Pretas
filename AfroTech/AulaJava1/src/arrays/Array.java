package arrays;

public class Array {

	public static void main(String[] args) {
		int[] x = new int [10];
		 x[9] = 8 ;
		 
		 System.out.println(" O tamanho do array � : " + x.length);
		 
		 for( int i = 0; i < x.length; i++)
		 {
			 x[i] = i * 2;
			
			 System.out.println(" O valor da posi��o " +i+ "�: " + x[i] );
		 }
		 //for ( int i = 0; i < x.length; i++)
		 	
		 
	}

}
