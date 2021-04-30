package lecture_2;

public class InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=4;
     int row=1;
     int col=1;
     while(row<=n)
     {
    	 col=1;
    	 while(col<=n-row)
    	 {
    		 System.out.print("* \t");
    		 col++;
    	 }
    	 row++;
    	 System.out.println();
     }
     
	}

}
