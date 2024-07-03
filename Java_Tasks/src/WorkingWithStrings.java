public class WorkingWithStrings {
    public static void main(String[] args) {
        String hello = "Hello, World!!";
        System.out.println(hello);
        System.out.println("String length: " + hello.length());
        System.out.println(hello.toLowerCase());
        System.out.println(hello.toUpperCase());
        System.out.println(hello.replace("World","CODERS.Bay"));
        System.out.println(hello.stripLeading());
        System.out.println((hello+"\n").repeat(15));
        System.out.println("-------------------------------------");

    }
}
