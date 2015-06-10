package FigureArea;
import java.util.*;

public class MiMa{
 public static void min(Collection<Figure> al){
		
		Iterator <Figure> itr = al.iterator();
		Double min = itr.next().getAreaValue();
		Figure  element = itr.next();
		while(itr.hasNext()){
			element = itr.next();
			if(min > element.getAreaValue()) min = element.getAreaValue();
			
		}
		System.out.println("Min areas " + element.printName() + " = " + min);
					
 }
}