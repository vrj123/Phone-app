public class Main {
    public static void main(String[] args) {

        Landline l1=new Landline("453");
        Landline l2=new Landline("123");
        l1.callNumber("123");
        l2.receiveCall("123");
        System.out.println(l2.answerCall());
    }
}