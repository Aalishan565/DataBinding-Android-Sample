package allu.databindingsample.model;

/**
 * Created by aalishan.ansari on 2/23/2018.
 */

public class User  {
    public  String firstName;
    public  String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
      //  notifyPropertyChanged(allu.databinding.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
       // notifyPropertyChanged(allu.databinding.BR.lastName);
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

}
