import java.util.List;
import java.util.ArrayList;


public class Tester 
{

	public static void main(String[] args)
	{
		
	List<Ship> ships = new ArrayList<Ship>();
	
	ships.add(new Ship("Titanic", "1999"));
	ships.add(new CruiseShip("Wonder", "2003", 900));
	ships.add(new CargoShip("Thomas", "2004", 4000));
		
	for(Ship ship : ships)
	{

		System.out.println(ship);
		
	}
	
}
	
}
