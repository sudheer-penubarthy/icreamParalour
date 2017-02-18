package com.samples.pojo;

/**
 * Class for icreamParalour project
 * Created by sudheer on 18/2/17.
 */
public class Department {
    private String dept_no;
    private String dept_name;

    public Department(String dept_no, String dept_name) {
        this.dept_no = dept_no;
        this.dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "Department{" +
               "dept_no='" + dept_no + '\'' +
               ", dept_name='" + dept_name + '\'' +
               '}';
    }

    public Department() {
    }

    public String getDept_no() {

        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
