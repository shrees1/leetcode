import java.io.*;

public class Notification {
    private String info;
    private String warning;
    private String critical;
    private String blocker;

    public Notification(String info, String warning, String critical, String blocker) {
        this.info = info;
        this.warning = warning;
        this.critical = critical;
        this.blocker = blocker;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getBlocker() {
        return blocker;
    }

    public void setBlocker(String blocker) {
        this.blocker = blocker;
    }


}

