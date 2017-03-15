package com.zhang.ten.InnerControllerFrame;

import java.util.ArrayList;
import java.util.List;



//һ������Event��list ��������list�е�ÿ�������ִ�к�ɾ����
public class Controller {
	private List<Event> eventList=new ArrayList<>();
	public void addEvent(Event c){ eventList.add(c); }
	public void run(){//���еķ���
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
