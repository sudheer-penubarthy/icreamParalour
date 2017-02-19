package com.samples.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Class for icreamParalour project
 * Created by sudheer on 18/2/17.
 */
public class Employees {
    private int emp_no;
    private Date birth_date;
    private String first_name, last_name;
    private Date hire_date;
    private String gender;
    private Set<Salaries> salaries = new HashSet <> (  );

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employees{" +
               "emp_no=" + emp_no +
               ", birth_date=" + birth_date +
               ", first_name='" + first_name + '\'' +
               ", last_name='" + last_name + '\'' +
               ", hire_date=" + hire_date +
               ", gender='" + gender + '\'' +
               '}';
    }
}
