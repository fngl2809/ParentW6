public class App {
    public static void main(String[] args) throws Exception {
        Child child = new Child();
        child.name = "anak1";
        child.doIt();

        Parent parent = (Parent) child;
        parent.name = "ortu";
        parent.doIt();
    }
}
