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
@Table(name = "issue_type")
@NoArgsConstructor
@Getter @Setter
public class IssueType extends BaseEntity {

    @Column(name = "type_name", length = 30)
    private String typeName;

    @OneToMany(mappedBy = "issueType")
    private List<Issue> issue = new ArrayList<>();
}
