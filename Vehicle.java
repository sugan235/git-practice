interface Vehicle{
   public void start();
}

class Car implements Vehicle{
    public void start{
        System.out.println("Car has been started");
}
}
class TestCar{
    public static void main(String[]args){
        Vehicle v=new Vehicle();
        v.start();
    }
}
