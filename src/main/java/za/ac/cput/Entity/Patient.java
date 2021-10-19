/* Patient.java
 Class for the Patient
 Author: Bilqees Saban (219090866)
  Date: 11 June 2021
*/

package za.ac.cput.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient
{
    @Id
    private String patID;
    private String patFirstName;
    private String patLastName;
    private String patGender;
    private String patAddress;
    private String patAge;
    private String patContactNumber;
    private String patBloodType;
    private String patCovidStatus;

    public Patient()
    {

    }

    public String getPatID()
    {
        return patID;
    }

    public String getPatFirstName()
    {
        return patFirstName;
    }

    public String getPatLastName()
    {
        return patLastName;
    }

    public String getPatGender()
    {
        return patGender;
    }

    public String getPatAddress()
    {
        return patAddress;
    }

    public String getPatAge()
    {
        return patAge;
    }

    public String getPatContactNumber()
    {
        return patContactNumber;
    }

    public String getPatBloodType()
    {
        return patBloodType;
    }

    public String getPatCovidStatus()
    {
        return patCovidStatus;
    }

    private Patient (Builder builder)
    {
        this.patID = builder.patID;
        this.patFirstName = builder.patFirstName;
        this.patLastName = builder.patLastName;
        this.patGender = builder.patGender;
        this.patAddress = builder.patAddress;
        this.patAge = builder.patAge;
        this.patContactNumber = builder.patContactNumber;
        this.patBloodType = builder.patBloodType;
        this.patCovidStatus = builder.patCovidStatus;
    }

    @Override
    public String toString()
    {
        return "Builder" +
                "{" +
                "patID=" + patID +
                ", patFirstName='" + patFirstName + '\'' +
                ", patLastName='" + patLastName + '\'' +
                ", patGender='" + patGender + '\'' +
                ", patAddress='" + patAddress + '\'' +
                ", patAge=" + patAge +
                ", patContactNumber='" + patContactNumber + '\'' +
                ", patBloodType='" + patBloodType + '\'' +
                ", patCovidStatus='" + patCovidStatus + '\'' +
                '}';
    }

    public static class Builder
    {
        private String patID;
        private String patFirstName;
        private String patLastName;
        private String patGender;
        private String patAddress;
        private String patAge;
        private String patContactNumber;
        private String patBloodType;
        private String patCovidStatus;

        public Builder setPatID(String patID)
        {
            this.patID = patID;
            return this;
        }

        public Builder setPatFirstName(String patFirstName)
        {
            this.patFirstName = patFirstName;
            return this;
        }

        public Builder setPatLastName(String patLastName)
        {
            this.patLastName = patLastName;
            return this;
        }

        public Builder setPatGender (String patGender)
        {
            this.patGender = patGender;
            return this;
        }

        public Builder setPatAddress (String patAddress)
        {
            this.patAddress = patAddress;
            return this;
        }

        public Builder setPatAge (String patAge)
        {
            this.patAge = patAge;
            return this;
        }

        public Builder setPatContactNumber (String patContactNumber)
        {
            this.patContactNumber = patContactNumber;
            return this;
        }

        public Builder setPatBloodType (String patBloodType)
        {
            this.patBloodType = patBloodType;
            return this;
        }

        public Builder setPatCovidStatus (String patCovidStatus)
        {
            this.patCovidStatus = patCovidStatus;
            return this;
        }

        public Builder copy (Patient patient)
        {
            this.patID = patient.patID;
            this.patFirstName = patient.patFirstName;
            this.patLastName = patient.patLastName;
            this.patGender = patient.patGender;
            this.patAddress = patient.patAddress;
            this.patAge = patient.patAge;
            this.patContactNumber = patient.patContactNumber;
            this.patBloodType = patient.patBloodType;
            this.patCovidStatus = patient.patCovidStatus;

            return this;
        }

        public Patient build()
        {
            return new Patient (this);
        }

    }
}
