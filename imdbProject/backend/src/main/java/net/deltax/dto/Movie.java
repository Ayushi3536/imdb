package net.deltax.dto;

import java.io.Serializable;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
@Entity
public class Movie implements Serializable {
    private  static  final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String id;
    private String Name;
    private  String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    private String plot;
    @Transient
    private  MultipartFile file;
}
