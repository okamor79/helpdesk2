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
@Table(name = "user_status")
@Getter @Setter @NoArgsConstructor
public class UserStatus extends BaseEntity {

    @Column(name = "status_name")
    private String statusName;

    @OneToMany(mappedBy = "userStatus")
    private List<User> users = new ArrayList<>();
}
