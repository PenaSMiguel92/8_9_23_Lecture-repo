public class Penguin {

    String name;
    

    public Penguin(String name) {
        this.name = name;
    }

    public void fly() {
        throw new CantFlyException("I will throw an exception from the fly method!");
    }

    public void throwPenguin() throws CantFlyException {
        System.out.println("I am about to throw a penguin");
        throw new CantFlyException("Still can't fly!!!");
    }

    public String swim() {
        System.out.println("Penguin is swimming....");
        return "Yippy";
    }
}
