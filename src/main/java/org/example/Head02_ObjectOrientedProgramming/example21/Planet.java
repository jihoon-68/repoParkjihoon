package org.example.Head02_ObjectOrientedProgramming.example21;

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);


    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double surfaceGravity(){
        final double G = 6.67300E-11;
        return G*mass/ (radius*radius);
    }

    @Override
    public String toString(){
        return name() + " (gravity=" + surfaceGravity() + ")";
    }
}
