package FigureArea;
import java.util.*;

public class Sum{
	
	
	public static void sum(Collection< ? extends Figure> al){
		
		
		Double sum = 0d;
		
		Iterator < ? extends Figure> itr = al.iterator();
		Figure  element = itr.next();
		while(itr.hasNext()){
			element = itr.next();
			sum += element.getAreaValue();
			
		}
		System.out.println("Sum areas " + element.printName() + "  = " + sum);
		
		
	}
}