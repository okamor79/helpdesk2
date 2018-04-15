package ua.com.kaminskyi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile")
@Getter @Setter @NoArgsConstructor
public class UserProfile extends BaseEntity {

    private String firstName;

    private String lastName;

    private int departID;

    private String phoneNumber;

    private String email;


}
