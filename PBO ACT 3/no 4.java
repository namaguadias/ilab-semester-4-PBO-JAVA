public class Line {

    private Point p1;

    private Point p2;

 

    public Line(Point p1, Point p2) {

        this.p1 = p1;

        this.p2 = p2;

    }

 

    public Point getP1() {

        return p1;

    }

 

    public Point getP2() {

        return p2;

    }

 

    public String toString() {

        return "[" + p1.toString() + ", " + p2.toString() + "]";

    }

 

    public double getSlope() {

        double deltaX = p2.getX() - p1.getX();

        double deltaY = p2.getY() - p1.getY();

        return deltaY / deltaX;

    }

}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */