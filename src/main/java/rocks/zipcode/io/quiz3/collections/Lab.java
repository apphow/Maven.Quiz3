package rocks.zipcode.io.quiz3.collections;

import com.sun.org.apache.xerces.internal.util.Status;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String name = "";
    private Status status;


    public Lab() {
        this.name = "";
        this.status = status;
    }

    public Lab(String labName) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStatus(LabStatus labStatus) {
        this.status = status;
    }

    public LabStatus getStatus() {
        return LabStatus.COMPLETED;
    }
}
