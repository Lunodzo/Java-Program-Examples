public class NewClass{
    public static void main(String[] args) {
        System.out.printf("This is the main class");
        MyClass t1Class = new MyClass();

        System.out.printf("The value from another class is " +t1Class.num);
    }
}