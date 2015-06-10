package FigureArea;
import java.util.*;


public class Max{
	public static void max(Collection<Figure> cl){
		Iterator<Figure> ir = cl.iterator();
		Double max = ir.next().getAreaValue();
		Figure element = ir.next();
		for(Figure figure: cl){
			if(figure.getAreaValue() > max) max = figure.getAreaValue();
			
		}
		System.out.println("Max area " + element.printName() + " = " + max);
		
	}
}