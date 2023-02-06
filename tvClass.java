
public class TvClass {
	public static void main(String[] args){
		TV tv1 = new TV();
		tv1.setChannel(1);
		tv1.setVolumeLvl(7);
		tv1.channelDown();
		tv1.volumeLvlUp();
		
		System.out.print("channel is " +  tv1.Channel + "\nvolume lvl is  " + tv1.Volume);
	}
	

}
class TV{
	int Channel = 1;
	int Volume = 1;
	boolean on = false;
	
	public void turnOff(){
		on = false;
	}
	public void turnOn(){
		on = true;
		}
	
	public void setVolumeLvl(int newVolume){
		if(1 <= newVolume && newVolume <= 7 && on == true){
			this.Volume = newVolume;
		}
		else
	}
	
	public void setChannel(int newChannel){
		if(1>=  newChannel && newChannel <= 120 && on ==  true){
			this.Channel = newChannel;
		}
	}
	
	int channelUp(){
		if(this.Channel < 120 && on == true){
			return this.Channel++; 
		}
	}
	
	int channelDown(){
		if(this.Channel > 1 && on == true){
			return this.Channel--;
		}
	}
	
	int volumeLvlUp(){
		if(this.Volume < 7 && on == true){
			return this.Volume++;
		}
	}
	
	int volumeLvlDown(){
		if(this.Volume > 1 && on == true){
			return this.Volume--;
		}
		else{return 0;}
	}
}