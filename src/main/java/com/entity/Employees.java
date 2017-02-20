package com.entity;

import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.ws.rs.DefaultValue;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
@Entity
@Table(name="employees")
public class Employees {

    private int employeeNumber;
    private String lastName;
    private String extension;
    private String email;
    private Offices officecode;
    private int reportsTo;
    private String jobTitle;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder ( "Employees{" );
        sb.append ( "employeeNumber=" ).append ( employeeNumber );
        sb.append ( ", lastName='" ).append ( lastName ).append ( '\'' );
        sb.append ( ", extension='" ).append ( extension ).append ( '\'' );
        sb.append ( ", email='" ).append ( email ).append ( '\'' );
        sb.append ( ", officecode='" ).append ( officecode ).append ( '\'' );
        sb.append ( ", reportsTo=" ).append ( reportsTo );
        sb.append ( ", jobTitle='" ).append ( jobTitle ).append ( '\'' );
        sb.append ( '}' );
        return sb.toString ( );
    }

    @Id
    @Column(name="employeeNumber", nullable = false)
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Column(name = "lastname",nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "extension",nullable = false)
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Column(name="email",nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "officeCode")
    public Offices getOfficecode() {
        return officecode;
    }

    public void setOfficecode(Offices officecode) {
        this.officecode = officecode;
    }

    @Column(name="reportsTo")
    public int getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }

    @Column(name="jobTitle",nullable = false)
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
