package com.samples.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
public class Salaries implements Serializable{
    private Employees employees;
    private int salary;
    private Date from_date;
    private Date to_date;

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }
}
