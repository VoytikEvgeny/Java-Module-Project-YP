import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Ввод участников гонки:");

        ArrayList<Car> raceMembers=new ArrayList<>();
        for(int i=0;i<3;i++){
            raceMembers.add(createCarFromKB(i+1));
        }
        Race race=new Race(raceMembers);
        race.calculateLeader();
        Car raceLeader=race.getLeader();
        System.out.println("Самая быстрая машина:"+raceLeader.name);
    }
    public static Car createCarFromKB(int carNumber){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите название "+carNumber+"-го автомобиля");
        String name=scan.nextLine();
        int speed=inputCurrentSpeed();
        return new Car(name,speed);
    }
    public static int inputCurrentSpeed(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите его скорость(от 0 до 250)");
        if(scan.hasNextInt()) {
            int speed;
            speed = scan.nextInt();
            if (speed < 0 || speed > 250) {
                return inputCurrentSpeed("Некорректная скорость. Повторите ввод");
            }
            return speed;
        }
        else {
            return inputCurrentSpeed("Ошибочный ввод. Было введено не число. Повторите ввод");
        }
    }
    public static int inputCurrentSpeed(String mes){
        Scanner scan=new Scanner(System.in);
        System.out.println(mes);
        if(scan.hasNextInt()) {
            int speed;
            speed = scan.nextInt();
            if(speed<0||speed>250){
                return inputCurrentSpeed("Некорректная скорость. Повторите ввод");
            }
            return speed;
        }
        else {
            return inputCurrentSpeed("Ошибочный ввод. Было введено не число. Повторите ввод");
        }
    }

}