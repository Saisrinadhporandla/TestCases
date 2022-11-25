package base;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Merge_2Lists {
	public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Sai");
	ArrayList<String> a2=new ArrayList<String>();
	a2.add("Srinadh");
	Stream<String> tl=Stream.concat(a1.stream(),a2.stream());
	tl.forEach(i->System.out.println(i));
	}
}
