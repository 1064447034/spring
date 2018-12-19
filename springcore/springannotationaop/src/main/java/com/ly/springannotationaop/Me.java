package com.ly.springannotationaop;

public class Me implements Sleepable {
	@Override
	public void sleep() {
		System.out.println("\n睡觉！不休息哪里有力气学习！\n");
	}
}
