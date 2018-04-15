package ua.com.kaminskyi.entity;

import jdk.internal.dynalink.linker.LinkerServices;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "issue_status")
@NoArgsConstructor
@Getter @Setter
public class IssueStatus extends BaseEntity {

    @Column(name = "status_name", length = 30)
    private String statusName;

    @OneToMany(mappedBy = "issueStatus")
    private List<Issue> issue = new ArrayList<>();
}
