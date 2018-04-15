package ua.com.kaminskyi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_role")
@Getter @Setter @NoArgsConstructor
public class UserRole extends BaseEntity {

    @Column(name = "role_name")
    private String roleName;

    @OneToMany(mappedBy = "userRole")
    private List<User> users = new ArrayList<>();
}
