public class TryJava{
    int x;
    public TryJava(){
        x=5;
        System.out.println("It is working");
    }
    
    public static void main(String[] args) {
        TryJava myObje = new TryJava();
        System.out.println(myObje.x);
    }
}