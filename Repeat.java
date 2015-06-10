package FigureArea;
import java.util.*;


public class Repeat{
	public static void repeat (Collection<Figure> al){
		HashMap<Figure, Integer> hm = new HashMap<Figure, Integer>();
		Integer am;
		for(Figure figure: al ){
			am = hm.get(figure);
			hm.put(figure, am == null ? 1 : am + 1);
		}
		for (Object key : hm.keySet().toArray()) {
			
			if (hm.get(key) == 1) {
				
				hm.remove(key);
			}
		}
		Set<Map.Entry<Figure,Integer>> set = hm.entrySet();
		for (Map.Entry<Figure,Integer> me : set){
			System.out.print( "Square with area " + me.getKey().getAreaValue() + " recurs ");
			System.out.println(me.getValue() + " times");	
		}
		
	}
		
		
			
}