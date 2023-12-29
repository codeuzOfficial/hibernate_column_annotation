package dasturlash.uz;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "profile")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", length = 20, nullable = false)
    private String name;
    @Column(name = "surname", length = 20, nullable = false)
    private String surname;
    @Column(name = "age", columnDefinition = " int check (age > 18) ")
    private Integer age;
    @Column(name = "about", columnDefinition = "text")
    private String about;
    @Column(name = "login", unique = true)
    private String login;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
