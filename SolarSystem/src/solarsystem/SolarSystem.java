/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author plavinia
 */
public class SolarSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\Users\\plavinia\\Desktop\\solarSystem.txt");

        try {
            int nrObjects = 0;
            Scanner sc = new Scanner(file);
            if (sc.hasNextLine()) {
                nrObjects = Integer.parseInt(sc.nextLine());
            }

            List<Object>solarSystem=new ArrayList<>();
            while (sc.hasNextLine()) {
                Object objProp[];
                SolarObject so = null;
                String line = sc.nextLine();
                objProp = line.split(" ");

                if (objProp[0] instanceof String) {
                    System.out.println(objProp[0]);
                    if (objProp[0].equals("star")) {
                        so = new Star();
                    }
                    if (objProp[0].equals("satellite")) {
                        so = new Satellite();
                    }
                }

                so.setX0(Double.parseDouble(objProp[1].toString()));
                so.setY0(Double.parseDouble(objProp[2].toString()));
                so.setDegree(Double.parseDouble(objProp[3].toString()));
                solarSystem.add(so);
            }
                        
            if(!solarSystem.isEmpty() && solarSystem!=null){
               for(Object o:solarSystem){
                   if(o instanceof Star){
                      Star s=(Star)o;
                       double distance=s.calcDist(s);
                       System.out.println("distance at T1 for "+s.getType()+" " +distance);
                   }
                        if(o instanceof Planet){
                      Planet p=(Planet)o;
                       double distance=p.calcDist(p);
                       System.out.println("distance at T1 for "+p.getType()+" "+distance);
                   }
                    if(o instanceof Satellite){
                      Satellite s=(Satellite)o;
                       double distance=s.calcDist(s);
                       System.out.println("distance at T1 for "+s.getType()+" " +distance);
                   }
               }
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        }

     

    }

}
