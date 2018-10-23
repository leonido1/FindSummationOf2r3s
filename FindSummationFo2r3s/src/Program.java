import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
	

		System.out.println(findSummationOf2r3s(42221));
		
		
	}



public static ArrayList<Integer> findSummationOf2r3s(int n ){

	if (n < 0){
		System.out.println("number must be positive integer");
		return null;
	}

	 ArrayList<Integer> returnList = new ArrayList<Integer>();
	
	if(n == 0)
		return returnList;
		
	 
	if ( n==1 || n==2 || n==3 ){
		returnList.add(n);
	    return returnList;
	}
	
	
	if (n%2 == 1){//odd
		
		int x = 3;
		
		while (3*x <= n)	
			x=x*3; 
			
		returnList.add(x);
		returnList.addAll(findSummationOf2r3s(n-x));
		
		
	}else 
		returnList.addAll(multiplyByTwo(findSummationOf2r3s(n/2)));	
	
	
	return returnList;


}


private static ArrayList<Integer> multiplyByTwo(ArrayList<Integer> findSummationOf2r3s) {
	
	return (ArrayList<Integer>) findSummationOf2r3s.stream().map(i->i*2).collect(Collectors.toList());


}

} 

