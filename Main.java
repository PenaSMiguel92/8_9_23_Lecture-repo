class Main {
    public static void main(String[] args) {
        Penguin featherknight = new Penguin("Feather Knight");

        try{
            featherknight.fly();
        } catch (CantFlyException cfe) {
            System.out.println("I have caught my penguin");
            try{
                featherknight.throwPenguin();
            } catch (CantFlyException cfe2) {
                System.out.println(featherknight.swim());
            }
        } catch (Exception ex) {
            System.out.println("I am some other exception");
        } finally {
            System.out.println("I always run no matter what, :D");
        }
    }
}