package com.step1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Informations {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress=	InetAddress.getLocalHost();
            System.out.println("HostAddress: "+inetAddress.getHostAddress());
            System.out.println("HostName: "+inetAddress.getHostName());

            System.out.println("------server------");
            InetAddress address2= InetAddress.getByName("www.enset-media.ac.ma");
            System.out.println("HostName: "+address2.getHostName());
            System.out.println("HostAddress2: "+ address2.getHostAddress());

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
