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
public class Satellite extends SolarObject  {
    
        private String type;

    public String getType() {
        return "satellite";
    }

        public Satellite(){
        super();
        super.distanceFromParent=333;
    }

    
    @Override
    public void setParent(Object parent) {
        super.setParent(new Planet()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDistanceFromParent() {
        return  super.getDistanceFromParent(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
      public double[] calcPoz(Satellite s){
        double[] coord=new double[2];
        double crtX=s.x0+Math.cos(s.degree/180*Math.PI)*s.distanceFromParent;
        double crtY=s.x0-Math.sin(s.degree/180*Math.PI)*s.distanceFromParent;
        coord[0]=crtX;
        coord[1]=crtY;
        return coord;
    }

   public double calcDist(Satellite p){
        double[] crtCoor=calcPoz(p);
        if(crtCoor!=null){
            return Math.sqrt(Math.pow(crtCoor[0]-p.x0, 2)+ Math.pow(crtCoor[1]-p.y0, 2));
        }
        return -1;
    }
    
    
}
