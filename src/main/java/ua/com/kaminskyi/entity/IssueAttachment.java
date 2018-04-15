package ua.com.kaminskyi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "issue_attachment")
@Getter @Setter @NoArgsConstructor
public class IssueAttachment extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "issue_id")
    private Issue issue;

    @ManyToOne
    @JoinColumn(name ="users_id")
    private User users;

    private LocalDateTime created;

    private String attachmentPath;

}
