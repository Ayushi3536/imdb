package net.deltax.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
@Entity
public class Producer implements Serializable {
    private  static  final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String id;

    private String name;
    private  String DOB;
    private  String Sex;
    private String Bio;

    @Override
    public String toString() {
        return "Producer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Bio='" + Bio + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }
}
