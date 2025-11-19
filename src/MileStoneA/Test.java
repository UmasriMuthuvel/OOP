package MileStoneA;

public class Test {
    public static void main(String[] args) {

        //default
//        User u=new User();
//        u.setContactInfo("333");
//        System.out.println(u.getName());
//        System.out.println(u.getUserId());
//        System.out.println(u.getContactInfo());

        //parameterized

//        User u1=new User("umasri","9999999999999");
//        System.out.println(u1.getUserId());
//        System.out.println(u1.getName());
//        System.out.println(u1.getContactInfo());

        //copy constructor
//        User u2=new User(u1);
//        System.out.println(u2.getUserId());
//        System.out.println(u2.getName());
//        System.out.println(u2.getContactInfo());

        User u;
      u=new Librarian();
        u.displayDashboard();

        u=new Librarian();
        u.canBorrowBooks();
        System.out.println("DEBUG");



















    }
}
