import java.util.LinkedList;
import java.util.TreeSet;

public class SetsUnionIntersection {

	public static void main(String[] args) {
		TreeSet<Integer>treeSet1 = new TreeSet<>();
		treeSet1.add(1);
		treeSet1.add(2);
		treeSet1.add(3);
		treeSet1.add(4);
		treeSet1.add(5);
		
		TreeSet<Integer>treeSet2 = new TreeSet<>();
		
		treeSet2.add(3);
		treeSet2.add(4);
		treeSet2.add(5);
		
		 System.out.println("TreeSet1: " + treeSet1); 
	        System.out.println("TreeSet2: " + treeSet2); 
	        
	        TreeSet<Integer> union = new TreeSet<>(); 
	        union.addAll(treeSet2); 
	        union.addAll(treeSet1); 
	        
	        TreeSet<Integer> intersection = new TreeSet<>(); 

	        intersection.addAll(treeSet1); 
	        System.out.println(intersection);
	        intersection.retainAll(treeSet2); 

	   System.out.println("Inter: " + intersection); 

	        
	}

}
