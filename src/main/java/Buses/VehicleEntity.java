package Buses;

import javax.persistence.*;

/**
 * Created by dann on 25.05.17.
 */
@Entity
@Table(name = "Vehicle", schema = "Vehicles", catalog = "")
public class VehicleEntity {
    private int vehicleId;
    private String vehicleType;
    private RoutesEntity routesByRouteId;

    @Id
    @Column(name = "vehicle_id")
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Basic
    @Column(name = "vehicle_type")
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleEntity that = (VehicleEntity) o;

        if (vehicleId != that.vehicleId) return false;
        if (vehicleType != null ? !vehicleType.equals(that.vehicleType) : that.vehicleType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleId;
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "route_id", referencedColumnName = "route_id")
    public RoutesEntity getRoutesByRouteId() {
        return routesByRouteId;
    }

    public void setRoutesByRouteId(RoutesEntity routesByRouteId) {
        this.routesByRouteId = routesByRouteId;
    }
}
