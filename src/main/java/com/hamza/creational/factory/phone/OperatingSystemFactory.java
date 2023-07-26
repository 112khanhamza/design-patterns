package com.hamza.creational.factory.phone;

public class OperatingSystemFactory {

    public OS getInstance(String str) {
        if (str.equals("Open")) {
            new Android();
        } else if (str.equals("Closed")) {
            return new IOS();
        }
        return new Windows();
    }
}
