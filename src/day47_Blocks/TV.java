package day47_Blocks;

public class TV {
	int channel=1;
	int volumeLevel=1;
	boolean on = false;
	String brand = "undefined";
	
	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}
	
	public TV(String brand) {
	  this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
		
	}
	public void channelUp() {
	  if(isOn()&&(channel>1&&channel<120))
		channel++;
	}
	public void channelDown() {
	  if(isOn()&&(channel>1&&channel<120))
		channel--;
	}
	public void volumeUp() {
	  	if(	isOn()&&(volumeLevel>1&&volumeLevel<7)) 
		volumeLevel++;
	}
	public void volumeDown() {
	  		if(	isOn()&&volumeLevel>1) 
		volumeLevel--;
	}
	public boolean isOn() {
		return this.on;
	}
	public void turnOn() {
		if(on==true) {
			System.out.println("TV is already ON");
		}else
			on=true;
	}
	public void turnOff() {
		if(on==false) {
			System.out.println("TV is already OFF");
		}else
			on=false;
	}



	public int getChannel() {
		return isOn() ? channel: 1;
	}
	public void setChannel(int channel) {
		if(channel>0&& channel<120) {
	  	this.channel = channel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
			
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(	isOn()&&volumeLevel>1&&volumeLevel<7) {
		    this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
}