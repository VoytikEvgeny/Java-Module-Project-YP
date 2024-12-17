
public class Race {
    Car leader=new Car();

    public void addCar(Car carFromKB) {
        if(leader.speed<carFromKB.speed){
            leader=carFromKB;
        }
    }

    public Car getLeader(){
        return leader;
    }
}
