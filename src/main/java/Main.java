import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    static int minSpeed=0;
    static int maxSpeed=250;
    public static void main(String[] args) {

        System.out.println("Ввод участников гонки:");

        Race race=new Race();
        for(int i=0;i<3;i++){
            race.addCar(createCarFromKB(i+1));
        }
        Car raceLeader=race.getLeader();
        System.out.println("Самая быстрая машина:"+raceLeader.name);
    }
    public static Car createCarFromKB(int carNumber){

        System.out.println("Введите название "+carNumber+"-го автомобиля");
        if(carNumber>1){
            scan.nextLine();
        }
        String name = scan.nextLine();
        int speed=inputCurrentSpeed("Введите его скорость(от 0 до 250)");
        return new Car(name,speed);
    }
    public static int inputCurrentSpeed(String mes){
        System.out.println(mes);
        int speed;
        while (true) {
            if (scan.hasNextInt()) {
                speed = scan.nextInt();
                if (speed < minSpeed || speed > maxSpeed) {
                    System.out.println("Некорректная скорость. Повторите ввод");
                }
                else {
                    return speed;
                }
            } else {
                System.out.println("Ошибочный ввод. Было введено не число. Повторите ввод");
            }
        }
    }

}