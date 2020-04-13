package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		
		//ListIterator<Double> itr = list.listIterator(1);
		ListIterator<Double> itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		
		

	}

}
