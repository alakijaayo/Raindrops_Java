public class Raindrops {

    public static String numbers(int choice) {
        String output = "";

        if (choice % 3 == 0) {
            output += "Pling";
        }
        if (choice % 5 == 0) {
            output += "Plang";
        }
        if (choice % 7 == 0) {
            output += "Plong";
        }
        if (output.length() == 0) {
            output += choice;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(numbers(3));
        System.out.println(numbers(8));
        System.out.println(numbers(300));
    }

}
