public class Raindrops {

    public String numbers(int choice) {
        String output = "";

        if (choice % 3 == 0) output += "Pling";
        if (choice % 5 == 0) output += "Plang";
        if (choice % 7 == 0) output += "Plong";
        if (output.length() == 0) output += choice;

        return output;
    }

    public static void main(String[] args) {
      Raindrops test = new Raindrops();

      String pling = test.numbers(3);
        System.out.println(pling);

      String plang = test.numbers(10);
        System.out.println(plang);

      String plong = test.numbers(14);
        System.out.println(plong);

      String showMeNumber = test.numbers(8);
        System.out.println(showMeNumber);


    }

}
