public class HelloEveryone {

    public static void main(String[] args) {
        int number = 13;
        String greeting = "Hello Everyone from Java!";
        System.out.println(greeting);
        System.out.println("greeting = " + greeting.toUpperCase());
        System.out.println("number = " + number);
        if(number >= 13) {
            greeting = "Goodbye Everyone from Java";
            System.out.println("greeting = " + greeting.toUpperCase());
        } else {
            System.out.println("No cambia el valor");
        }
    }

}
