package in.bushansirgur.jdbcapidemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_users")
public class User {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //@Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@Column(name = "name")
    @Column(nullable = false)
    private String name;
    //@Column(name = "email")
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
