package MileStoneA;

 public class Student extends User{
     @Override
     void displayDashboard(){
         System.out.println("Student display dashboard");
     }
     @Override
     boolean canBorrowBooks(){

          return true;
     }

}
