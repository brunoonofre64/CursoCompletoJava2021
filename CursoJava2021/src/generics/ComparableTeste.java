package generics;

import java.util.TreeSet;

public class ComparableTeste {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(10);
		nums.add(1);
		nums.add(40);
		nums.add(50);
		nums.add(-20);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
		
		
		
	}

}
