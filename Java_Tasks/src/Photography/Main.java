package Photography;

public class Main {
    public static void main(String[] args) {
        //    Create several cameras in the main class and change the lens on at least one of them.

        Lens lens1 = new Lens(24, 105);
        Camera cam1 = new Camera("Canon EOS R5", 45, 3.2, true, lens1);
        System.out.println(Camera.getCounter()+". Camera: " + cam1);
        System.out.println("--------------------------------------------------------------------------------");

        Lens lens2 = new Lens(28, 70);
        Camera cam2 = new Camera("Sony Alpha a7R IV", 61, 3, true, lens2);
        System.out.println(Camera.getCounter()+". Camera: " + cam2);
        System.out.println("--------------------------------------------------------------------------------");

        Lens lens3 = new Lens(24, 70);
        Camera cam3 = new Camera("Nikon Z7 II", 45.7, 3.2, true, lens3);
        System.out.println(Camera.getCounter()+". Camera: " + cam3);
        System.out.println("--------------------------------------------------------------------------------");

        Lens lens4 = new Lens(23, 79);
        Camera cam4 = new Camera("Fujifilm GFX100S", 102, 3.2, true, lens4);
        System.out.println(Camera.getCounter()+". Camera: " + cam4);
        System.out.println("--------------------------------------------------------------------------------");


    }
}
