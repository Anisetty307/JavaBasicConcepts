package LoopsConcept;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[3][2];  // Declaration 
		
		a[0][0]=10;    // storing the elements // vlaues into the array 
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		
		// classic for loop 
	/*	for(int i=0;i<=2;i++)   //for incrementing the rows 
			{	
			for(int j=0;j<=1;j++)  // for incrementing the columns
				{	
			    System.out.println(a[i][j]);
			    }
		     }  
		
		// for each loop
		
		for(int i[]:a) {
			for (int j:i) {
				System.out.println(j);
			}
		} */
		
		
		int b[][]= {{1,2}, {3,4}, {5,6}, {7,8}};
		
		for(int i[]:b) {
			for (int j:i) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
	}

}
