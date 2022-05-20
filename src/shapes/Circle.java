package shapes;

    // #2 - Circle Class
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double rad = this.radius;
        return Math.PI * Math.pow(rad, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}
