package com.telecom;

public class Airtel{
    private String nameOfSim;
    private Services services;


    public Airtel(String nameOfSim, Services services) {
        this.nameOfSim = nameOfSim;
        this.services = services;
    }

    public String getServicesStarted() {
        return services.service()+" on "+nameOfSim;
    }
}
