package POJO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="subject")
public class Subject implements Serializable {
    @Id
    private String idsubject;
    private String subjectName;
    private Date startday;
    private Date endday;
    private String schedule;
    private String roomname;

    public String getIdsubject() {
        return idsubject;
    }

    public void setIdsubject(String idsubject) {
        this.idsubject = idsubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Date getStartday() {
        return startday;
    }

    public void setStartday(Date startday) {
        this.startday = startday;
    }

    public Date getEndday() {
        return endday;
    }

    public void setEndday(Date endday) {
        this.endday = endday;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "idsubject='" + idsubject + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", startday=" + startday +
                ", endday=" + endday +
                ", schedule='" + schedule + '\'' +
                ", roomname='" + roomname + '\'' +
                '}';
    }
}
