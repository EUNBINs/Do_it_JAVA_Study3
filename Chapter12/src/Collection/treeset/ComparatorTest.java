package Collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2) * (-1);		//내림차순으로 반환하겠다.
	}
	
}
public class ComparatorTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>(new MyCompare());
		
		tree.add("aaa");
		tree.add("bbb");
		tree.add("ccc");
		
		System.out.println(tree);
	}

}
