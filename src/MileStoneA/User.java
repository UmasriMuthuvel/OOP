package MileStoneA;

public abstract class User {

    private int userId;
    private  String name;
    private String contactInfo;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    //constructor
    //default
//    public User(){
//        this.userId = generateUniqueId();
//        this.name = name;
//        this.contactInfo = contactInfo;
//    }

    //parameterized
//    public User(String name, String contactInfo) {
//        this.userId = generateUniqueId();
//        this.name = name;
//        this.contactInfo = contactInfo;
//    }

    private int generateUniqueId() {

        return 0;
    }

    //copy constructor
//    public User(User u){
//        this.userId = u.userId;
//        this.name = u.name;
//        this.contactInfo = u.contactInfo;
//    }

    abstract void displayDashboard();
    abstract boolean canBorrowBooks();

}
