/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 *
 * @author plavinia
 */
public abstract class SolarObject {
    double x0;
    double y0;
    double degree;
    double distanceFromParent;
    Object parent;

  //  abstract void motionFunction();
      
    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return y0;
    }

    public void setY0(double y0) {
        this.y0= y0;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public double getDistanceFromParent() {
        return distanceFromParent;
    }

    public void setDistanceFromParent(double distanceFromParent) {
        this.distanceFromParent = distanceFromParent;
    }
   
    
  
}
