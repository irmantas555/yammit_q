package lt.irmantasm.model.address.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Table(name = "settlements")
public class Settlement extends PanacheEntity {

    @ManyToOne()
    @JoinColumn(name = "country_id")
    private Country country;
    @ManyToOne()
    @JoinColumn(name = "municipality_id")
    private Municipality municipality;
    private String code;
    private String title;

    public Settlement(Country country, Municipality municipality, String code, String title) {
        this.country = country;
        this.municipality = municipality;
        this.code = code;
        this.title = title;
    }

    public Settlement() {
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
