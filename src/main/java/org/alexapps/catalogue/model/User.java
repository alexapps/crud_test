package org.alexapps.catalogue.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ladan on 11/9/16.
 */


@Entity
@Table(name = "USER")
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Boolean isAdmin;
    private Timestamp createdDate;


    @Id @GeneratedValue
    @Column (name = "id")
    public Integer getId() {
        return id;
    }
    @Column (name = "name")
    public String getName() {
        return name;
    }
    @Column (name = "age")
    public Integer getAge() {
        return age;
    }
    @Column (name = "isAdmin")
    public Boolean getIsAdmin() {
        return isAdmin;
    }
    @Column (name = "createdDate")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setCreatedDate(Timestamp value) {

        this.createdDate = value;//new Timestamp(System.currentTimeMillis());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isAdmin=" + isAdmin +
                ", createddate=" + createdDate +
                '}';
    }
}
