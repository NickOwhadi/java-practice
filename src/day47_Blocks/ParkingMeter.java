package day47_Blocks;

public class ParkingMeter {
	int timeleft=0;
	int maxTime;
	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	
	public boolean add(int i) {
		int changed=timeleft;
		if(timeleft<maxTime&&i==25) {
			
			timeleft=timeleft+30;
		}else {
			timeleft=timeleft;
		}
		if(timeleft>changed) {
			return true;
		}else
	return false;
	}
	
	public void tick() {
		if(timeleft>0) {
			timeleft--;
		}
	}
	public boolean isExpired() {
		if(timeleft==0) {
			return true;
		}else
			return false;
	}	
}
