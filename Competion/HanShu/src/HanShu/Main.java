package HanShu;

import java.util.*;

public class Main {
//函数及方法
	public static void NsTime() {
		
	}
	
	
	public static void main(String[] args) {
		long beginTime=System.currentTimeMillis();//获取当前时间,毫秒时间
		int i=0;
		while(i<10000000) {
			++i;
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-beginTime+"ms");
		long nanoTime=(endTime-beginTime)*1000000;
		System.out.println(nanoTime+"ns");
		nanoTime=System.nanoTime();
		for(i=0;i<10000000;++i) {
		}
		long EndTime=System.nanoTime();
		System.out.println(EndTime-nanoTime+"ns");
	}
}
