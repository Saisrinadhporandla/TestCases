package base;

import java.util.stream.Stream;

public class To_Upper_map {
	public static void main(String[] args) {
		Stream.of("sai","srinadh","amma").filter(i->i.startsWith("a")).map(i->i.toUpperCase()).forEach(i->System.out.println(i) );
		Stream.of("sai","srinadh","amma").filter(i->i.startsWith("s")).sorted().map(i->i.toUpperCase()).forEach(i->System.out.println(i) );
	}

}
