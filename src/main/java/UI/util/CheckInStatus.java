package UI.util;

public class CheckInStatus
{
    public static int ABSENT=0;
    public static int NOT_CHECKIN=1;
    private int status;
    public CheckInStatus()
    {
        status=-1;
    }

    public CheckInStatus(int state)
    {
        status=state;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
