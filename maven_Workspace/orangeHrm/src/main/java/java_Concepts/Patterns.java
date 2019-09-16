package java_Concepts;

public class Patterns {

	public static void main(String[] args) {
	
	//To print * pattern	
    for(int i=1;i<=4;i++) {
    	
    	for(int j=1;j<=i;j++) {
    		
    		System.out.print("*");
    	}
    	System.out.println();
		
	}
    
    System.out.println("\n");
    
    // To print 1,22,333 format
    for(int i=1;i<=4;i++) {
    	for (int j=1;j<=i;j++) {
    		System.out.print(i);
    	}
    	System.out.println();
    }
    
    System.out.println("\n");
    //To print 1,12,123,1234 format
    for(int i=1;i<=4;i++) {
    	for (int j=1;j<=i;j++) {
    		System.out.print(j);
    	}
    	System.out.println();
    }
    
    System.out.println("\n");
    //To print pyramid format
    for(int i=1;i<=4;i++) {
    	for(int k=1;k<=4-i;k++) {
    		System.out.print("*");
	}
    	for (int j=1;j<=i;j++) {
    		System.out.println(j);
    	}
    	System.out.println();
    }
    
  }
}
