package ink.twoa.webserver.model.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "messages")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "message")
    private String message;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_of_message")
    private Date dateOfMsg;

    public MessageEntity() {
    }

    public MessageEntity(Long id, String message, Date dateOfMsg) {
        this.id = id;
        this.message = message;
        this.dateOfMsg = dateOfMsg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateOfMsg() {
        return dateOfMsg;
    }

    public void setDateOfMsg(Date dateOfMsg) {
        this.dateOfMsg = dateOfMsg;
    }
}
