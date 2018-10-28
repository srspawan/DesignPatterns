package com.hs.behavioral.proxy;

public class ProxyTest {
	public static void main(String a[]) {
		Internet connection = new InternetProxy();
		try {
			connection.connectTo("google.com");
			connection.connectTo("youtube.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
