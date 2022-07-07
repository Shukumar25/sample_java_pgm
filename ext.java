class vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Pip, Pip!!");
    }
}
class car extends vehicle {
    private String modelName = "Mustang";
    public static void main(String args[]) {
        car mycar = new car();
        mycar.honk();
        System.out.print(mycar.brand + " " + mycar.modelName);
    }
}
