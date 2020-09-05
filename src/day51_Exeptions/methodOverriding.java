package day51_Exeptions;

class A{
    protected void method(){

    }
}

public class methodOverriding extends A{


@Override   // ONLY instance (not private or final) method can override(MUST happen in sub class)
    public void method(){

    }

    public String toString(){
       return "example";
    }



}
