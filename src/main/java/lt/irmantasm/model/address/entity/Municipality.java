package lt.irmantasm.model.address.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Table(name = "municipalities")
public class Municipality extends PanacheEntity {
    @ManyToOne()
    @JoinColumn(name = "country_id")
    private Country country;
    private String code;
    private String title;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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

    public Municipality() {

    }

    public Municipality(Country country, String code, String title) {
        this.country = country;
        this.code = code;
        this.title = title;
    }
}
