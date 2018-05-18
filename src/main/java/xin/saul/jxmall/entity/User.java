package xin.saul.jxmall.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    @JoinColumn(name="userId",insertable = false,updatable = false)
    private Account account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
