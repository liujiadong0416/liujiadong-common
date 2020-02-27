package com.liujiadong.commoon.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	
	public static int random(int min,int max){
		Random r = new Random();
		int i=r.nextInt(max-min+1);
		i=i+min;
		return i;
	}
	
	public static int[] subRandom(int min,int max,int subs){
		int[] x=new int[subs];
		HashSet<Integer> hashSet = new HashSet<Integer>();
		while (hashSet.size()!=subs) {
			int i = random(min,max);
			hashSet.add(i);
		}
		int j=0;
		for (Integer integer : hashSet) {
			x[j]=integer;
			j++;
		}
		return x;
	}
	
	public static char randomCharacter(){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		char charAt = str.charAt(random(0, str.length()-1));
		return charAt;
	}
	
	public static String  randomString(int length){
		String str="";
		for (int i = 0; i <length; i++) {
			str+=randomCharacter();
		}
		return str;
	}
}
