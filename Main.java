class Main {  
	// 2 + 4 + 6 + ..... + n
	static void add(int n) {
		int sum  = 0;
		for(int i = 2 ; i<n; i=i+2){
			sum = sum + i ;
		}		  
    System.out.println(sum);
  }
  public static void main(String args[]) { 
		add(10);
  } 
}