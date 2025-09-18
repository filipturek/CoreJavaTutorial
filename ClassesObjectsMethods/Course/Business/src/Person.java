import business.Company;

public class Person {

    private String middleName = "Christopher";

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("My groovy message");
        p1.saySomething("Here's something else to say");
        var middleInitial = p1.getMiddleInitial();
        System.out.println(middleInitial);
    }
}
