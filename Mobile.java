package com.xworkz.oops;

public class Mobile {
	String deviceName;
	String simCard;
	int storageCapacity;
	int RAM;
	String version;
	int weight;

	public void capturePhoto() {
		System.out.println("photo is captured");
	}

	public void call() {
		System.out.println("Making call to someone");
	}

	public void playMusic() {
		System.out.println("listen music");
	}

	public void sms() {
		System.out.println("sending sms to one of my contact");
	}

	public void app() {
		System.out.println("Installing the necessary apps");
	}

	public void share() {
		System.out.println("Sharing the photos");
	}
}
