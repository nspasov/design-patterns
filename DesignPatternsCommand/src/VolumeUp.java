
public class VolumeUp implements VolumeManager {

	public Volume volume;
	
	public VolumeUp(Volume volume)
	{
		this.volume = volume;
	}
	
	public void manageVolume()
	{		
		this.volume.changeVolume(true);	
	}
	
}
