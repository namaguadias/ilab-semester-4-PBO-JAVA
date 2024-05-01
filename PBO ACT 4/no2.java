public class Lingkaran extends Bangun {

    private double radius;

   

    public void setRadius(double radius) {

        this.radius = radius;

        setLuas(Math.PI * radius * radius);

    }

   

    public double getRadius() {

        return radius;

    }

}