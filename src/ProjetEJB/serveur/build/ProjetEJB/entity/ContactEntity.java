package ProjetEJB.serveur.build.ProjetEJB.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "mySQLdb.CONTACT"
)
public class ContactEntity {
    private String firstName;
    private String lastName;
    private String email;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;

    public ContactEntity() {
    }

    @Id
    public long getId() {
        return this.id;
    }

    public void setId(long l) {
        this.id = l;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public void setFirstName(String prenom) {
        this.firstName = prenom;
    }

    public void setLastName(String nom) {
        this.lastName = nom;
    }
}

