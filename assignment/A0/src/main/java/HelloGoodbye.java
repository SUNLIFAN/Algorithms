public class HelloGoodbye {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Something went wrong!");
            System.exit(1);
        }

        String firstPerson = args[0];

        String secondPerson = args[1];

        System.out.println("Hello " + firstPerson + " and " + secondPerson + ".");

        System.out.println("Goodbye " + firstPerson + " and " + secondPerson + ".");
    }
}
