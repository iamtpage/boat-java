
public class CargoShip extends Ship 
{

	public int capacity;
	/**
	 * 
	 * @param name name of ship
	 * @param date date ship created
	 * @param cap capacity in tonnes
	 */
	public CargoShip(String name, String date, int cap)
	{
		super(name, date);
		this.capacity = cap;
	}
	
	/**
	 * 
	 * @return capacity of ship in tonnes
	 */
	public int getCap()
	{
		return this.capacity;
	}
	
	/**
	 * 
	 * @param cap sets the ship capacity
	 */
	public void setCap(int cap)
	{
		this.capacity = cap;
	}
	
	/**
	 *  toString() method
	 */
	public String toString()
	{
		return ("The ship name is: "+this.getShipName()+".\n" +"The ship has a capacity of: "+this.getCap()+".\n");
	}
}
