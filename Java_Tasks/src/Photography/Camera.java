package Photography;

class Camera {

    // implementing Camera settings as the task says(brand + pixels + display + colored or Black & White + lens properties):
    private String brand;
    private double megaPixels;
    private double displaySize;
    private boolean flag;
    private Lens lens;

    // Implement static counter variables for the camera that count how many instances of a class have been created.
    private static int counterCamera = 0;

    public Camera(String brand, double megaPixels, double displaySize, boolean flag, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.flag = flag;
        this.lens = lens;
        counterCamera++;
    }

    // adding getters & setter for Camera parameters :
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public static int getCounter() {
        return counterCamera;
    }

    public static void setCounter(int counter) {
        Camera.counterCamera = counter;
    }

    //    Overwrite the to-string methods of both classes.
    public String toString() {
        return   "\n" +"\n" +
                "brand: " + brand +
                "\nmegaPixels: " + megaPixels +
                "\ndisplaySize: " + displaySize +
                "\nColored: " + flag +
                "\nLens: " + lens ;
    }
}






