package lecture_2;

public class binry_gap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=529;
     System.out.println(solution(n));
	}
	public static int solution(int N) {
	    int binaryGap = 0;
	    boolean found_one = false;

	    for (int j = 0; N > 0; N /= 2) {
	        if (N % 2 == 0) {
	            j++;
	        } else {
	            if (j > binaryGap && found_one == true){
	                binaryGap = j;
	            }
	            found_one = true;
	            j = 0;
	        }
	    }

	    return binaryGap;
	}
}
