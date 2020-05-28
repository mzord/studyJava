package entities;

public class Position {

    private double degrees;
    private double minutes;
    private double seconds;

    public Position(double degrees, double minutes, double seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Position(double degrees, double minutes) {
        this.degrees = degrees;
        this.minutes = minutes;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public double dms() {

        if (this.seconds > 0) {
            return this.degrees + this.minutes / 60 + this.seconds / 360;
        }

        else {
            return this.degrees + this.minutes / 60;
        }
    }

}
