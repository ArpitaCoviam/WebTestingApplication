package com.Interview.WebTestapplication.candidate.Entity;

import javax.persistence.*;


@Entity
@Table(name = "POC")
public class POC {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Designation")
    private String designation;

    @Column(name="service")
    private String service;

    @Column(name = "ReportingManager")
    private String reportingManager;



    public POC(String fullName, String designation, String service, String reportingManager) {
        this.fullName = fullName;
        this.designation = designation;
        this.service = service;
        this.reportingManager = reportingManager;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    protected POC() {

    }

    @Override
    public String toString() {
        return "POC{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", designation='" + designation + '\'' +
                ", service='" + service + '\'' +
                ", reportingManager='" + reportingManager + '\'' +
                '}';
    }

}
