package base;
import java.util.*;

public class Sorted_Unique {
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,5,3,7,3,2);
		l.stream().distinct().sorted().forEach(i->System.out.println(i));
		
	}

}
