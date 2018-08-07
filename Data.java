

public class Data 
{
	public String cityName;
	public int x;
	public int y;
	
	public Data()
	{
		
	}
	
	public Data(String cityName, int x, int y)
	{
		this.cityName = cityName;
		this.x = x;
		this.y = y;
	}
	
	public  String getCity()
	{
		return cityName;
	}
	
	public void setCity(String cityName)
	{
		this.cityName = cityName;
	}

	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
}
