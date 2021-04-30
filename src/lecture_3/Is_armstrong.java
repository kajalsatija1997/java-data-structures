package lecture_3;
import java.util.*;

public class Is_armstrong {

	public static void main(String[] args) {
		 int c=0,a,temp;  
         boolean flag=true;
         Scanner s = new Scanner(System.in);
		int n = s.nextInt();
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println(flag);   
    else  
        System.out.println(!flag);
    s.close();
   }  

}
