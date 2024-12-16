import java.util.ArrayList;

public class Race {
    ArrayList<Car> members;
    Car leader=new Car();
    Race(ArrayList<Car> carList){
        members=carList;
    }
    public void calculateLeader(){
        if(!members.isEmpty()){
            for (Car car: members
                 ) {
                if(leader.speed<car.speed){
                    leader=car;
                }
            }
        }
    }
    public Car getLeader(){
        return leader;
    }
}
