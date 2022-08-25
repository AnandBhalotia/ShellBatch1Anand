package com.test.anand;

public class Marks {
	public String grade(int a) {
		if(a<=35) {
			return "Fail";
		}
		else if(a>35 && a<=50) {
			return "3rd Class";
		}
		else if(a>50 && a<=75) {
			return "2nd Class";
		}
		else if(a>75 && a<=100) {
			return "1st Class";
		}
		return null;
	}
}
