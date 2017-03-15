package com.zhang.ten.InnerControllerFrame;


public class GreenHouseControls extends Controller{
	private boolean light=false;
	public class LightOn extends Event{
		public LightOn(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			light=true;	
		}
		public String toString(){
			return "Light is On";
		}
		
	}
	public class LightOff extends Event{
		public LightOff(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			light=false;
		}
		public String toString(){
			return "Light is off";
		}
		
	}
	public class Bell extends Event{
		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}
		public String toString(){
			return "Bing!!!";
		}
		
	}
	public class Restart extends Event{
		private Event[] evenList;
		public Restart(long delayTime,Event[] eventlist) {
			super(delayTime);
			evenList=eventlist;
			for(Event e:eventlist){
				addEvent(e);
			}
		}

		@Override
		public void action() {
			for(Event e:evenList){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
			
		}
		public String toString(){
			return "restarting system!";
		}
		
	}
	public static class Terminate extends Event{

		public Terminate(long delayTime) {
			super(delayTime);
			
		}

		@Override
		public void action() {
			System.exit(0);
			
		}
		public String toString(){
			return "Terminating";
		}
		
	}
}
