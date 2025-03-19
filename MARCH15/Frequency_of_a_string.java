package MARCH15;

public class Frequency_of_a_string {
    public static void getfre(String str) {
    	int [] arr = new int[256];
    	
    	for(int i = 0;i<str.length();i++) {
    		char ch = str.charAt(i);
    		int ascii = ch;
    		arr[ascii]++;
    		
    		//arr[str.charAt(i)]++;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
