package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private String role;
    private String login;
    private String password;
    private Timestamp created_at;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList;
    private List<Review> reviewList;
}
