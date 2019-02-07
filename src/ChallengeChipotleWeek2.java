import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ChallengeChipotleWeek2 {
    private static ArrayList<String> rice = new ArrayList<>();
    private static ArrayList<String> meat = new ArrayList<>();
    private static ArrayList<String> beans = new ArrayList<>();
    private static ArrayList<String> salsa = new ArrayList<>();
    private static ArrayList<String> veggies = new ArrayList<>();
private static String RandRice;
private static String RandBeans;
private static String RandSalsa;
private static String RandVeggies;
    public static void main(String[] args){
        InitializeArrays();
        for (int i=1;i<=25;i++){
            System.out.print("Burrito "+i+": ");
            randomGeneratorRice();
            System.out.print(",");
            randomGeneratorMeat();
            System.out.print(",");
            randomGeneratorBeans(beans);
            System.out.print(",");
            randomGeneratorSalsa();
            System.out.print(",");
            randomGeneratorVeggies(veggies);
            System.out.print(". ");
            prices();
            System.out.println("\n");
        }
    }
    //used to get random index for rice
    private static void randomGeneratorRice(){
        Random random = new Random();
        int index = random.nextInt(rice.size());
        RandRice =rice.get(index);
        if (rice.get(index).equalsIgnoreCase("none")) {
            System.out.print("no rice");
        } else {
            System.out.print(rice.get(index));
        }
    }
    //used to get random index for beans if none then print no beans
    private static void randomGeneratorBeans(ArrayList<String> input){
        Random random = new Random();
        int index = random.nextInt(input.size());
        RandBeans =beans.get(index);
        if (input.get(index).equalsIgnoreCase("none")) {
            System.out.print("no beans");
        } else {
            System.out.print(input.get(index));
        }
    }
    //used to get random index for meat
    private static void randomGeneratorMeat(){
        Random random = new Random();
        int index = random.nextInt(rice.size());
        System.out.print(meat.get(index));
    }
    //used to get random salsa index
    //output that index or if none print no salsa or if all then print all salsa types
    private static void randomGeneratorSalsa(){
        Random random = new Random();
        int index = random.nextInt(salsa.size());
        RandSalsa = salsa.get(index);
        if (salsa.get(index).equalsIgnoreCase("all")) {
            System.out.print("mild salsa,medium salsa,hot salsa");
        } else if (salsa.get(index).equalsIgnoreCase("none")) {
            System.out.print("no salsa");
        } else {
            System.out.print(salsa.get(index));
        }
    }
    // used to randomly get an index from veggies array list and print that or
    // if all then all the veggies, else no veggies
    private static void randomGeneratorVeggies (ArrayList<String> input){
        Random random = new Random();
        int index = random.nextInt(input.size());
        RandVeggies=veggies.get(index);
        if (input.get(index).equalsIgnoreCase("all")) {
            System.out.print("lettuce,fajita veggies");
        } else if (input.get(index).equalsIgnoreCase("none")) {
            System.out.print("no veggies");
        } else {
            System.out.print(input.get(index));
        }
    }
    //method to calculate price based off if they had one of each category already
    private static void prices(){
        double price=5.50;

        if (RandRice.equalsIgnoreCase("none")) {
            price -= 0.5;
        } else if (RandRice.equalsIgnoreCase("all")) {
            price += 1.0;
        }
        if (RandBeans.equalsIgnoreCase("none")) {
            price -= 0.5;
        }
        if (RandSalsa.equalsIgnoreCase("none")){
            price -= 0.5;
        } else if (RandSalsa.equalsIgnoreCase("all")){
            price += 1.0;
        }
        if (RandVeggies.equalsIgnoreCase("none")){
            price -= 0.5;
        } else if (RandVeggies.equalsIgnoreCase("all")){
            price += 1.0;
        }
        System.out.print(" Price is $"+price);
    }
// method to add items to each array list
    private static void InitializeArrays(){
        Collections.addAll(rice, "white","brown","none");
        Collections.addAll(meat,"chicken","steak","carnitas","chorizo","sofritas","veggies");
        Collections.addAll(beans, "pinto","black","none");
        Collections.addAll(salsa, "mild salsa","medium salsa","hot salsa","none","all");
        Collections.addAll(veggies,"lettuce","fajita veggies","none","all");
    }
}
