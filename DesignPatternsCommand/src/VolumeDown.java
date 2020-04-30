
public class VolumeDown implements VolumeManager {
	
	public Volume volume;
	
	public VolumeDown(Volume volume)
	{
		this.volume = volume;
	}
	
	public void manageVolume()
	{
		this.volume.changeVolume(false);
	}

}
