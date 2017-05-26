package Buses;

import javax.persistence.*;

/**
 * Created by dann on 25.05.17.
 */
@Entity
@Table(name = "Drivers", schema = "Vehicles", catalog = "")
public class DriversEntity {
    private int driverId;
    private String name;
    private String sirname;
    private Byte age;

    @Id
    @Column(name = "driver_id")
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sirname")
    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    @Basic
    @Column(name = "age")
    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriversEntity that = (DriversEntity) o;

        if (driverId != that.driverId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sirname != null ? !sirname.equals(that.sirname) : that.sirname != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sirname != null ? sirname.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
