package com.roombooking.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Integer clientId;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this
            == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return clientId.equals(client.clientId)
               && surname.equals(client.surname)
               && email.equals(client.email)
               && password.equals(client.password)
               && role
                  == client.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, role);
    }

    @Override
    public String toString() {
        return "Client{"
               + "clientId="
               + clientId
               + ", surname='"
               + surname
               + '\''
               + ", role="
               + role
               + '}';
    }
}
