package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;


    public Student() {
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;

    }

    public Lab getLab(String labName) {

        for (Lab each : labs) {
            if (labName == each.getName()) return each;
        }
        return null;
    }

     public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
         if ((lab == null)) {
             throw new UnsupportedOperationException();
         }
         lab.setStatus(labStatus);


      }

    public void forkLab(Lab lab) {
        for(Lab each : labs) {
            if(each == lab) {
                each.setStatus(LabStatus.COMPLETED);
                break;
            }
        }

    }

    }

