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
public class Star extends SolarObject {
    
    private String type;
    private double distaceChild;
    
    public Star(){
        super();
        super.distanceFromParent=39393;
    }

    public double getDistaceChild() {
        return 74648;
    }

    public String getType() {
        return "star";
    }
    
      public double[] calcPoz(Star s){
        double[] coord=new double[2];
        double crtX=s.x0+Math.cos(s.degree/180*Math.PI)*s.distanceFromParent;
        double crtY=s.x0-Math.sin(s.degree/180*Math.PI)*s.distanceFromParent;
        coord[0]=crtX;
        coord[1]=crtY;
        return coord;
    }

   public double calcDist(Star p){
        double[] crtCoor=calcPoz(p);
        if(crtCoor!=null){
            return Math.sqrt(Math.pow(crtCoor[0]-p.x0, 2)+ Math.pow(crtCoor[1]-p.y0, 2));
        }
        return -1;
    }

    @Override
    public void setParent(Object parent) {
        super.setParent(new Sun()); //To change body of generated methods, choose Tools | Templates.
    }
   
  
 

    @Override
    public double getX0() {
        return 1635; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getY0() {
        return 74646; //To change body of generated methods, choose Tools | Templates.
    }



    
    
    
    
    
    
    
    
    
    
}
