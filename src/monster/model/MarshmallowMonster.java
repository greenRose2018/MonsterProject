package monster.model;

public class MarshmallowMonster
{
	//Declaration section for the data members
	private String name;
	private String age;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//Unless we specify values all data members
		//are a zero, false, or null
	}
	
	public MarshmallowMonster(String name, String age, int eyeCount, int arms, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.age = age;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	public String getName()
	{
		return name;
	}
	public String getAge()
	{
		return age;
	}
	public int getEyeCount()
	{
		return eyeCount;
		
	}
	public int getArmCount()
	{
		return armCount;
		
	}
	public double getTentaclAmount()
	{	
		return tentacleAmount;
	
	}
	public boolean hasBloop()
	{
		return hasBloop;
		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setArmCount(int armCount)
	{ 
		this.armCount = armCount;
	}
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	public String toString()
	{
		String description = "Hi, I am a weird monster! My name is " + name +" , and I have " + eyeCount ;
		description += " eyes and I have " + armCount + " Arms, and I have " + tentacleAmount + " tentacles";
		description += " and I have a nose " + hasBloop;
		return description;
	}
}
