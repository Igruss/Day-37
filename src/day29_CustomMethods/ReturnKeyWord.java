package day29_CustomMethods;
//  6. calculate the grade of the student based on the score
public class ReturnKeyWord {

    public static void main(String[] args) {
        grade(84);
        System.out.println("Task Completed");
    }

      public static void grade (int score){

          if(score <0 || score > 100){
              System.out.println("Invalid score");
              return;
          }

          char grade = (score >=90)? 'A' : (score >= 80)? 'B':(score >=70)? 'C' :(score >=60)
                  ? 'D' : 'F';
          System.out.println("Grade is: "+grade);
      }

      public static void eligibleToBuy(int age){
        if(age < 21){
            System.out.println("You are not eligible");
            return;
        }

          System.out.println("You are eligible to buy");
      }

}
