package com.zhang.ten.InnerControllerFrame;

import java.util.ArrayList;
import java.util.List;



//一个放置Event的list 用来控制list中的每个对象的执行和删除；
public class Controller {
	private List<Event> eventList=new ArrayList<>();
	public void addEvent(Event c){ eventList.add(c); }
	public void run(){//运行的方法
		while(eventList.size()>0){
			for(Event e:new ArrayList<Event>(eventList)){
				if(e.ready()){
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}

}
