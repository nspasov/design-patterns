public class CdController {

	public VolumeManager volumeManager;
	

	public void setVolumeManager(VolumeManager volumeManager) 
	{
		this.volumeManager = volumeManager;
	}
	
	
	public void pressVolumeUpButton()
	{
		System.out.println("Pressing volume up button");
		this.volumeManager.manageVolume();
	}
	
	public void pressVolumeDownButton()
	{
		System.out.println("Pressing volume down button");
		this.volumeManager.manageVolume();
	}
	
	
}
