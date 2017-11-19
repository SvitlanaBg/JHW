package lesson18;

public class Box6 {
    private double width;
    private double height;
    private double depth;

    // constructor used when all dimensions specified
    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    public Box6() {
        width = -1;  // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1;  // box
    }

    // constructor used when cube is created
    Box6(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
