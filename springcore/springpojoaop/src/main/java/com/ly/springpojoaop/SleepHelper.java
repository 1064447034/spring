package com.ly.springpojoaop;

public class SleepHelper {
	public void beforeSleep() {
		System.out.println("睡觉前要脱衣服!");
	}

	public void afterSleep() {
		System.out.println("睡醒了要穿衣服！");
	}

}
