
package fi.viikko2.task04;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius){
        super();
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area(){ 
        return Math.round(Math.PI*radius*radius*100)/100.0;
    }

    @Override
    public String toString(){ 
    return "Ympyrän säde: "+radius;
    }

    @Override
    public boolean equals(Object o){ 
        if(this == o)return true;
        if(!(o instanceof Circle))return false;
        Circle other = (Circle)o;
        return this.radius == other.radius;
    }
}