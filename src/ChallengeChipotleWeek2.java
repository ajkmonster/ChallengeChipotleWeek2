import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
    public static void randomGeneratorRice(){
        Random random = new Random();
        int index = random.nextInt(rice.size());
        RandRice =rice.get(index);
        if (rice.get(index).equalsIgnoreCase("none")) {
            System.out.print("no rice");
        } else {
            System.out.print(rice.get(index));
        }
    }
    public static void randomGeneratorBeans(ArrayList<String> input){
        Random random = new Random();
        int index = random.nextInt(input.size());
        RandBeans =beans.get(index);
        if (input.get(index).equalsIgnoreCase("none")) {
            System.out.print("no beans");
        } else {
            System.out.print(input.get(index));
        }
    }
    public static void randomGeneratorMeat(){
        Random random = new Random();
        int index = random.nextInt(rice.size());
        meat.get(index);
        System.out.print(meat.get(index));
    }
    public static void randomGeneratorSalsa(){
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
    public static void randomGeneratorVeggies (ArrayList<String> input){
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
    public static void prices(){
        Double price=5.50;

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

    public static void InitializeArrays(){
        Collections.addAll(rice, "white","brown","none");
        Collections.addAll(meat,"chicken","steak","carnitas","chorizo","sofritas","veggies");
        Collections.addAll(beans, "pinto","black","none");
        Collections.addAll(salsa, "mild salsa","medium salsa","hot salsa","none","all");
        Collections.addAll(veggies,"lettuce","fajita veggies","none","all");
    }
}
