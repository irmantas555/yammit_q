package lt.irmantasm.model.address.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Table(name = "addresses")
public class Address extends PanacheEntity {
    @ManyToOne()
    @JoinColumn(name = "country_id")
    public Country country;
    @ManyToOne()
    @JoinColumn(name = "municipality_id")
    private Municipality municipality;
    @ManyToOne()
    @JoinColumn(name = "settlement_id")
    private Settlement settlement;
    private String street;
    private String houseNo;
    private String roomNo;
    private String postalCode;

    public Address() {
    }

    public Address(Country country, Municipality municipality, Settlement settlement, String street, String houseNo, String roomNo, String postalCode) {
        this.country = country;
        this.municipality = municipality;
        this.settlement = settlement;
        this.street = street;
        this.houseNo = houseNo;
        this.roomNo = roomNo;
        this.postalCode = postalCode;
    }

    public Country getOuntry() {
        return country;
    }

    public void setOuntry(Country ountry) {
        this.country = ountry;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
