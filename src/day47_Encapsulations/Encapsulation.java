package day47_Encapsulations;

public class Encapsulation {

    private long ssn = 290238987;
    private String userName;

    public long getSsn(){  // using to read only
        return ssn;
    }

    public void setSsn (long ssn){
         this.ssn = ssn;
    }




}
