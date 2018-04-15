package ua.com.kaminskyi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor
public class Users extends BaseEntity {

    private String userName;

    private String userPassword;

    private int userProfileID;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private UserStatus userStatus;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private UserRole userRole;

    private int userGroupID;

    @OneToMany(mappedBy = "users")
    private List<IssueComment> issueComment = new ArrayList<>();

    @OneToMany(mappedBy = "users")
    private List<Issue> users = new ArrayList<>();

    @OneToMany(mappedBy = "userAssigne")
    private List<Issue> userAssigne = new ArrayList<>();
}
