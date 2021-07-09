package com.Defanging_an_IP_Address;

public class Main {

	public static void main(String[] args) {
		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));
	}
	public static String defangIPaddr(String address) {
        String result = address.replace(".","[.]");
        return result;
    }

}
