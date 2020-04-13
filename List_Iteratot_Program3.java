package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iteratot_Program3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(11);
		list.add(400);
		list.add(500);
		list.add(35);
		list.add(41);
		list.add(600);
		
		
		
		ListIterator<Integer> itr = list.listIterator(1);
		
		
		while(itr.hasNext()) {
			
			int i = (int) itr.next();
			
			if(i % 2 == 1) {
				i++;
				itr.set(i);
			}
			
		}
		
		System.out.println(list);
			
	}

}
