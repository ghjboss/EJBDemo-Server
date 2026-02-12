package com.redhat.demo;

import jakarta.ejb.Remote;

@Remote
public interface PodCheck {
    String getIdentity();
}
