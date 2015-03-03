
public class Ship 
{

	public String name;
	public String date;
	
	/**
	 * 
	 * @param shipname sets ship name
	 * @param shipdate sets ship date created
	 */
	public Ship(String shipname, String shipdate)
	{
		this.setShipName(shipname);
		this.setShipDate(shipdate);
	}
	
	/**
	 * 
	 * @return ship's name
	 */
	public String getShipName()
	{
		return this.name;
	}
	
	/**
	 * 
	 * @return date created
	 */
	public String getShipDate()
	{
		return this.date;
	}
	
	/**
	 * 
	 * @param newname sets name of ship
	 */
	public void setShipName(String newname)
	{
		this.name = newname;
	}
	
	/**
	 * 
	 * @param newdate sets new date created
	 */
	public void setShipDate(String newdate)
	{
		this.date = newdate;
	}
	
	/**
	 * base toString method
	 */
	public String toString()
	{
		return ("The ship's name is: "+this.getShipName()+".\n" + "The ship was built in: "+this.getShipDate()+".\n"); 
	}
}
