package day59_OOP_Review;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn;

    private final LocalDate Published = LocalDate.of(2020,9,30); // cannot be modified

    public int getSsn(){
        return ssn;
    }

    public void setSsn(int ssn){
       this.ssn = ssn;
    }

    public LocalDate getPublished(){ // getter can be readable in final method
        return Published;
    }
 /*   public void setPublished(LocalDate Published){ Final cannot be modified }
        this.Published = Published;
    }
*/




}
