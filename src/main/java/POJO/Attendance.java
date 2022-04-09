package POJO;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity(name = "attendance")
public class Attendance implements Serializable
{
    @Id
    private AttendanceID idattendance;
    private String attend;

    public Attendance() {
    }

    public AttendanceID getIdstudent() {
        return idattendance;
    }

    public void setIdattendance(AttendanceID idattendance) {
        this.idattendance = idattendance;
    }

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }
}
