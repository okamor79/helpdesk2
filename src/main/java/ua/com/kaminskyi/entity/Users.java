package ua.com.kaminskyi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor
public class Users extends BaseEntity {

    private String userName;

    private String userPassword;

    private int userProfileID;

    private int userStatusID;

    private int userRoleID;

    private int userGroupID;

    @OneToMany(mappedBy = "users")
    private List<IssueComment> issueComment = new ArrayList<>();

    @OneToMany(mappedBy = "users")
    private List<Issue> users = new ArrayList<>();

    @OneToMany(mappedBy = "userAssigne")
    private List<Issue> userAssigne = new ArrayList<>();
}
