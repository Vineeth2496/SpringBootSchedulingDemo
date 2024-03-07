package com.SpringBootSchedulingDemo;

import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
		long timea=TimeUnit.HOURS.toSeconds(4);
		System.out.println(timea);
		long timeb=TimeUnit.DAYS.toNanos(5);
		System.out.println(timeb);
		long timec=TimeUnit.MILLISECONDS.toSeconds(5000);
		System.out.println(timec);
	}
}
