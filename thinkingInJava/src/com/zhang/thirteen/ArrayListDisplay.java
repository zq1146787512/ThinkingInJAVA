package com.zhang.thirteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ArrayListDisplay {
	public static void main(String[] args){
		System.out.println(args.length);
		if(args.length<2){
			System.out.println("Usage:\njava TestRegularExpression"+"charaterSequence regularExpression+");
			System.exit(0);
		}
		System.out.println("Input:\""+args[0]+"\"");
		for(String s:args){
			System.out.println("regular expression: \""+s+"\"");
			Pattern pattern = Pattern.compile(s);
			Matcher m = pattern.matcher(args[0]);
			while(m.find()){
				System.out.println("sdsdfsd"+m.group()+"at positions "+m.start()+"-");
			}
		}
	}

}

