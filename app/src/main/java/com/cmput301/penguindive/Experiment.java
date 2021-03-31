package com.cmput301.penguindive;

import java.io.Serializable;
import java.util.List;

/**
 * This class represents a Experiment object
 */
public class Experiment implements Serializable {
    private String experimentId;
    private String title;
    private String description;
    private String region;
    private String totalTrail;
    private String ownerUserName;
    private String status;
    private List<String> experimenters;
    private Boolean locationState;

    public Experiment(String experimentId, String title, String description, String region, String totalTrail, String ownerUserName, String status, List<String> experimenters, Boolean locationState) {
        this.experimentId = experimentId;
        this.title = title;
        this.description = description;
        this.region = region;
        this.totalTrail = totalTrail;
        this.ownerUserName = ownerUserName;
        this.status = status;
        this.experimenters = experimenters;
        this.locationState = locationState;
    }

    // Getters and Setters
    public void setExperimentId(String experimentId) {this.experimentId = experimentId;}
    String getExperimentId(){return experimentId;}

    public void setTitle(String title){ this.title = title;}
    String getTitle(){return title;}

    public void setDescription(String description){ this.description = description;}
    String getDescription() {return description;}

    public void setRegion(String region){this.region = region;}
    String getRegion() {return region;}

    public void setTotalTrail(String totalTrail){this.totalTrail = totalTrail;}
    String getTotalTrail() {return totalTrail;}

    public void setOwnerUserName(String ownerUserName){this.ownerUserName = ownerUserName;}
    String getOwnerUserName() {return ownerUserName;}

    public void setStatus(String status) {this.status = status;}
    String getStatus() {return status;}

    public void setExperimenters(List<String> experimenters) {this.experimenters = experimenters;}
    List<String> getExperimenters() {return experimenters;}

    public void setLocationState(boolean locationState) {
        this.locationState = locationState;
    }
    Boolean getLocationState() {
        return locationState;
    }

}
