package ua.com.kaminskyi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "issue")
@Getter @Setter @NoArgsConstructor
public class Issue extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "project_id")
    private IssueProject issueCodeProject;

    private int issueNumber;

    private String issueTitle;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private IssueType issueType;

    @ManyToOne
    @JoinColumn(name = "priority_id")
    private IssuePriority issuePriority;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private IssueStatus issueStatus;

    private String issueDesc;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    private LocalDate issueCreated;

    private LocalDateTime issueModify;

    private LocalDate issueClosed;

    @ManyToOne
    @JoinColumn(name = "userA_id")
    private Users userAssigne;

    @OneToMany(mappedBy = "issue")
    private List<IssueComment> issueComment = new ArrayList<>();

    @OneToMany(mappedBy = "issue")
    private List<IssueAttachment> attachment = new ArrayList<>();

}
