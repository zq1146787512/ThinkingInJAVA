package com.zhang.ten.InnerControllerFrame;


public class GreenHouseController {
	public static void main(String[] args) {
		GreenHouseControls gc=new GreenHouseControls();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList ={
				gc.new LightOn(0),
				gc.new LightOn(200),
				gc.new LightOn(400),
				gc.new LightOff(1000)
		};
		gc.addEvent(gc.new Restart(800, eventList));
		if(args.length>=1){
			gc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
			
		}
		gc.run();
		
	}

}
