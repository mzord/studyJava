package entities;

public class Sphere {

    public double radius = 10;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public Sphere() {

    }

    public double volume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    public double circun() {
        return 2 * Math.PI * radius;
    }

    public static double pi() {
        return Math.PI;
    }
}
