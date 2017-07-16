package co.texas;

public class User {
   Car car;
   String carModel;
public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
}



@Override
public String toString() {
	return "User [car=" + car + "]";
}
public void getCarModel(){
	System.out.println("Car: "+ this.car.getName() +" Cost: "+ this.car.getPerDayCost());
}

}
