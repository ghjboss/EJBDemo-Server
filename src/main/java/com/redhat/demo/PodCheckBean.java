package com.redhat.demo;

import jakarta.ejb.Stateless;
import java.net.InetAddress;

@Stateless
public class PodCheckBean implements PodCheck {
    @Override
    public String getIdentity() {
        String nodeName = System.getProperty("jboss.node.name");
        String envIp = System.getenv("MY_POD_IP");
        String localIp;
        try {
            localIp = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            localIp = "Unknown";
        }
        return String.format("Node: %s | Env-IP: %s | Local-IP: %s", nodeName, envIp, localIp);
    }
}
