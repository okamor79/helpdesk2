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
@Table(name = "issue_project")
@Getter @Setter @NoArgsConstructor
public class IssueProject extends BaseEntity {

    @Column(name = "prj_name")
    private String nameProject;

    @Column(name = "prj_desc",columnDefinition = "text")
    private String descProject;

    @Column(name = "prj_code", length = 4, unique = true)
    private String codeProject;

    @OneToMany(mappedBy = "issueCodeProject")
    private List<Issue> issue = new ArrayList<>();


}
