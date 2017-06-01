package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Entity for model.product.
 * The product must have a name.
 * Description and customer is not necessary for product existence
 *
 * @author Rafal Staszel
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int nr;
    @NotEmpty
    private String system;
    private String sytemDiscription;
    private String systemOwner;


    public Product(int nr, String system, String sytemDiscription, String systemOwner) {
        this.nr = nr;
        this.system = system;
        this.sytemDiscription = sytemDiscription;
        this.systemOwner = systemOwner;
    }

    public Product(String system, String sytemDiscription, String systemOwner) {
        this.system = system;
        this.sytemDiscription = sytemDiscription;
        this.systemOwner = systemOwner;
    }

    public Product() {
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getSytemDiscription() {
        return sytemDiscription;
    }

    public void setSytemDiscription(String sytemDiscription) {
        this.sytemDiscription = sytemDiscription;
    }

    public String getSystemOwner() {
        return systemOwner;
    }

    public void setSystemOwner(String systemOwner) {
        this.systemOwner = systemOwner;
    }
}
