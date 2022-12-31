
public class ssusobhan {
	public static void main(String [] args) {
		
		String line = "HAPPY NEW YEAR";
		//split all the wod one by one
		String word[] = line.split(" ");
		int n = word.length;
		String reverse=" ";
		for(int i=0;i<=n-1;i++) {
			String str = word[i];
			String rev = " ";
			
			int z= str.length();
			for(int j=z-1;j>=0;j--) {
				char c = str.charAt(j);
				
				rev = rev+c;
				
			}
			System.out.println(rev);
			
			reverse+= rev;
			
			
			
	
			
			
		}
		System.out.print(reverse);
		//System.out.print(rev);
	}

}
