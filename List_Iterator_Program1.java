package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator_Program1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(null);
		list.add(400);
		list.add(500);
		list.add(null);
		list.add(null);
		list.add(600);
		
		
		
		ListIterator<Integer> itr = list.listIterator(1);
		
		
		while(itr.hasNext()) {
			if(itr.next() == null) {
				itr.remove();
			}
			
			
		}
		
		System.out.println(list);
			
	}

}
