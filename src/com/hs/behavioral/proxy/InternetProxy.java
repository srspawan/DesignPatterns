package com.hs.behavioral.proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {
	 
    private Internet internet = new RealInternet();
    private static List<String> restrictedSites;
     
    static {
        restrictedSites = new ArrayList<String>();
        restrictedSites.add("hotstar.com");
        restrictedSites.add("facebook.com");
        restrictedSites.add("youtube.com");
        restrictedSites.add("linkedin.com");
    }
     
    @Override
    public void connectTo(String host) throws Exception {
        if(!restrictedSites.contains(host.toLowerCase())){
            internet.connectTo(host);
        }
        throw new Exception("Company restricted this site view");
    }
}
