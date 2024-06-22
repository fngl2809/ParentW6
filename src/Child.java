public class Child extends Parent{
    String name;
    void doIt(){
       System.out.println("Do It from child");
       System.out.println(this.name); //nama dari child
       System.out.println(super.name); //nama dari parent
    }
}
