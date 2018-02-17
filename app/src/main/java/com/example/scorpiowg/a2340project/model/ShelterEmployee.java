package com.example.scorpiowg.a2340project.model;

/**
 * Created by wangjingbo on 2/17/18.
 */

public class ShelterEmployee extends User {
    private String shelterId;

    public ShelterEmployee(String name, String userId, String password, String accountState, String shelterId) {
        super(name, userId, password, accountState, "shelterEmployee");
        this.shelterId = shelterId;
    }

    public String getShelterId() {
        return shelterId;
    }
}
