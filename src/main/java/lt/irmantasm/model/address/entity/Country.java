package lt.irmantasm.model.address.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Table(name = "countries")
public class Country extends PanacheEntity {
    private String code;
    private String title;

    public Country(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public Country() {

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
