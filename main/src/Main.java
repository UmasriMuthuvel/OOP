
/*package whatever //do not write package name here */


class Base{
    int x;
    Base() {x=10;}
    Base(int i) {x=i;}


}
class Derived extends Base{
    int y;
    Derived() {super(); y=80;}
    Derived(int i,int j){
        super(i);
        y=j;
    }
}
class Test{
    public static void main(String[] args){
        Derived d=new Derived();
        System.out.println(d.x);
        System.out.println(d.y);
    }
}





