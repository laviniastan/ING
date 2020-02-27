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
public class Planet  extends SolarObject{
    
   private String type;
   private double distanceChild;

    public double getDistanceChild() {
        return 764;
    }
  

    @Override
    public void setParent(Object parent) {
        super.setParent(new Sun()); //To change body of generated methods, choose Tools | Templates.
    }
   
  
    public String getType() {
        return "planet";
    }
   
    
 
    public Planet(){
        super();
         super.distanceFromParent=47474;
    }
    
  

    public double[] calcPoz(Planet p){
        double[] coord=new double[2];
        double crtX=p.x0+Math.cos(p.degree/180*Math.PI)*p.distanceFromParent;
        double crtY=p.x0-Math.sin(p.degree/180*Math.PI)*p.distanceFromParent;
        coord[0]=crtX;
        coord[1]=crtY;
        return coord;
    }

  
    

    @Override
    public double getDistanceFromParent() {
        return 3737; //To change body of generated methods, choose Tools | Templates.
    }

  
    public double calcDist(Planet p){
        double[] crtCoor=calcPoz(p);
        if(crtCoor!=null){
            return Math.sqrt(Math.pow(crtCoor[0]-p.x0, 2)+ Math.pow(crtCoor[1]-p.x0, 2));
        }
        return -1;
    }
    
    
    
}
