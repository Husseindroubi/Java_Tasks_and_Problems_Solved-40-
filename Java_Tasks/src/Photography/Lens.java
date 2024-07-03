package Photography;

class Lens {

    // Create Lens which has a minimum and maximum focal length.
    private double minFocal;
    private double maxFocal;

    private static int counterLens = 0;

    public Lens(double minFocal, double maxFocal) {
        if (minFocal <= 0 || minFocal >= maxFocal) {
            throw new IllegalArgumentException("Minimum focal length must be a positive number which is less than maximum focal length ");
        }
        this.minFocal = minFocal;
        this.maxFocal = maxFocal;
        counterLens++;
    }

// Getters & Setters for Lens :

    public double getMinFocal() {
        return minFocal;
    }

    public void setMinFocal(double minFocal) {
        if (minFocal <= 0 || minFocal >= maxFocal) {
            throw new IllegalArgumentException("Minimum focal length must be a positive number which is less than maximum focal length ");
        }
        this.minFocal = minFocal;
    }

    public double getMaxFocal() {
        return maxFocal;
    }

    public void setMaxFocal(double maxFocal) {
        if (minFocal <= 0 || minFocal >= maxFocal) {
            throw new IllegalArgumentException("Minimum focal length must be a positive number which is less than maximum focal length ");
        }
        this.maxFocal = maxFocal;
    }

    public static int getCounterLens() {
        return counterLens;
    }

    public static void setCounterLens(int counterLens) {
        Lens.counterLens = counterLens;
    }

    //    Overwrite the to-string methods of both classes.
    @Override
    public String toString() {
        return "Lens{" +
                "minFocal=" + minFocal +
                ", maxFocal=" + maxFocal +
                '}';
    }

    // When setting the focal length of a lens or constructingUse getter & setter for all variables.
    // a lens, add a check that the maximum focal length must always be greater than the specified minimum focal length.


    // Implement static counter variables for the lens that count
    // how many instances of a class have been created.
}
