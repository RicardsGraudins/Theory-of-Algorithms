import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class runner {
	//global collection which stores the sets that sum to 0,
	//not exactly the best coding practise would rather have an object result(powerset, sums)
	//where powerset contains the (Set<Set<Integer>>) powerset sets and (Set<Set<Integer>>) sums contains sets that sum to 0
	//but to keep it simple we're just going to use a global collection
	public static Set<Set<Integer>> sums = new HashSet<Set<Integer>>();
	
	public static void main(String[] args){
		Set<Integer> set = new HashSet<Integer>();
		//add elements to set
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(-5);
		
		//create set to store the powerset
		Set<Set<Integer>> set2 = new HashSet<Set<Integer>>();
		set2 = powerSet(set);
		
		System.out.println("Sets: " + set2);
		
		//[[2, 3, -5], [1, 4, -5]]
		System.out.println("Sums to 0: " + sums);
	}//main
	
	//takes in an integer set and returns Set<Set<Integer>> powerset
	//adapted from: https://stackoverflow.com/questions/4640034/calculating-all-of-the-subsets-of-a-set-of-numbers
	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }//if
        List<Integer> list = new ArrayList<Integer>(originalSet);
        int sum = 0;
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
            
            sum = 0;
            for(Integer i: newSet){
            	sum = sum+i;
                if (sum == 0){
                	sums.add(newSet);
                }//if
            }//for
        }//for
        return sets;
    }//powerSet
} //runner