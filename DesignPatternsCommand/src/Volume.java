
public class Volume {

	public Boolean isChanging;
	public Boolean isIncreasing;
	public Boolean isDecreasing;
	
	public void volumeUp()
	{
		this.isIncreasing = true;
		System.out.println("+1");
		this.isIncreasing = false;
	}
	
	public void volumeDown()
	{
		this.isDecreasing = true;
		System.out.println("-1");
		this.isDecreasing = false;
	}
	
	public void changeVolume(boolean increaseVolume)
	{
		this.isChanging = true;
		System.out.print("Volume: ");
		
		if(increaseVolume == true)
		{
			this.volumeUp();			
		}
		
		if(increaseVolume == false)
		{
			this.volumeDown();			
		}		
		
		this.isChanging = false;
		
	}
	

	
}
