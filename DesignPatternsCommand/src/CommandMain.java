
public class CommandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		CdController cdContoller = new CdController();
		Volume volume = new Volume();
		
		VolumeManager volumeUp = new VolumeUp(volume);
		VolumeManager volumeDown = new VolumeDown(volume);
		
		cdContoller.setVolumeManager(volumeUp);
		cdContoller.pressVolumeUpButton();
		
		cdContoller.setVolumeManager(volumeDown);
		cdContoller.pressVolumeDownButton();
		
	
		

	}

}
