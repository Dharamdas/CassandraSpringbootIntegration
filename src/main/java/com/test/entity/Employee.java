package com.test.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("employee")
public class Employee {

    /**
     * Default Constructor
     * **/

    public Employee() {
        super();
    }

    /**
     * Parameterized Constructor
     * @param id
     * @param name
     * @param age
     * @param salary
     */
    public Employee(long id, String name, int age, float salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @PrimaryKey("id")
    private long id;
    @Column("name")
    private String name;
    @Column("age")
    private int age;
    @Column("salary")
    private float salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age
                + ", salary=" + salary + "]";
    }
}
