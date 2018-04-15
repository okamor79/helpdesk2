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
@Table(name = "issue_priority")
@NoArgsConstructor
@Getter @Setter
public class IssuePriority extends BaseEntity {

    @Column(name = "priority_name", length = 30)
    private String priorityName;

    @OneToMany(mappedBy = "issuePriority")
    private List<Issue> issue = new ArrayList<>();
}
