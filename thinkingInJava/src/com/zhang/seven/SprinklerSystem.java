package com.zhang.seven;
/**
 * 类对象的组合
 * @author admin
 *
 */
public class SprinklerSystem {
	private String value1,value2,value3,value4;
	private WaterSource source=new WaterSource();
	private int i;
	private float f;
	public String ss;
	//toString()方法很特殊，当编译器需要一个String而你却只有一个对象时，该方法会被调用
	public String toString(){
		return "value1="+value1+" "+
			   "value2="+value2+" "+
			   "value3="+value3+" "+
			   "value4="+value4+"\n"+
			   "i="+i+" "+
			   "f="+f+" "+"source="+source;
	}
	public static void main(String[] args) {
		SprinklerSystem sprinklers=new SprinklerSystem();
		System.out.println(sprinklers);
	}

}

class WaterSource{
	private String s;
	 WaterSource() {
		System.out.println("WaterSource()");
		s="Constructed";
	}
	 public String toString(){return s;}
}

