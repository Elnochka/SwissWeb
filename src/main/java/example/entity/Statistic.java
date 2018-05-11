package example.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@XmlRootElement
public class Statistic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String longest;

    @Column
    private String shortest;

    @Column
    private Integer length;

    @Column
    private Double average;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Statistic() {
    }

    public String getLongest() {
        return longest;
    }

    public void setLongest(String longest) {
        this.longest = longest;
    }

    public String getShortest() {
        return shortest;
    }

    public void setShortest(String shortest) {
        this.shortest = shortest;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Statistic(String longest, String shortest, Integer length, Double average) {
        this.longest = longest;
        this.shortest = shortest;
        this.length = length;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "id=" + id +
                ", longest='" + longest + '\'' +
                ", shortest='" + shortest + '\'' +
                ", length=" + length +
                ", average=" + average +
                '}';
    }
}
