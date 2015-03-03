
public class CruiseShip extends Ship 
{

	public int maxpassengers;
	
	/**
	 * 
	 * @param name name of ship
	 * @param date date created
	 * @param max max number of passengers
	 */
	public CruiseShip(String name, String date, int max)
	{
		
		super(name, date);
		this.maxpassengers = max;
		
	}
	
	/**
	 * 
	 * @return max amount of passengers
	 */
	public int getMax()
	{
		return this.maxpassengers;
	}
	
	/**
	 * 
	 * @param max sets max amount of passengers
	 */
	public void setMax(int max)
	{
		this.maxpassengers = max;
	}
	
	/**
	 * toString override method
	 */
	public String toString()
	{
		return ("The ship's name is: "+this.getShipName()+".\n" + "The max amount of passengers is: "+this.getMax()+".\n");
	}
}
