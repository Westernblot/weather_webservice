package com.wes.test;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class main {

	public static void main(String[] args) {
		WeatherWS factory = new WeatherWS();
		WeatherWSSoap soap = factory.getWeatherWSSoap();
		ArrayOfString arrayOfString = soap.getWeather("武汉", null);
		List<String> strings = arrayOfString.getString();
		
		System.out.println(strings);
		
		for (String str : strings) {
			System.out.println("--"+str+"\n");
		}
		
	}
}
