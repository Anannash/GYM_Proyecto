/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym_app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ANDY
 */
public class GYM_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable run = () ->{
            Splash splash = new Splash();
            splash.setVisible(true);
            
            try {
                //timepo que tarda la pantalla de carga
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GYM_app.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            splash.dispose();
            
            login incio= new login();
            incio.setVisible(true);
            
            
        };
        
        Thread hiloSplash = new Thread(run);
        hiloSplash.start();
        
        
    }
    
     public String leer (String dato){
            String rutaProyecto = System.getProperty("user.dir");
         String archivo= rutaProyecto+"\\src\\Doc\\"+dato+".txt"; 
         GYM_app g = new GYM_app();
         String datos_e="";  
         try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            
            // Leer cada línea del archivo
            while ((linea = br.readLine()) != null) {
                // Procesar la línea (en este ejemplo, simplemente imprimirla)
                System.out.println(linea);
                
                    datos_e=datos_e+linea+"\n";            
            }
       
            // Cerrar el BufferedReader y el FileReader
            br.close();
            fr.close();       
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
         return datos_e;
}
     
     public String leer_horario (String datoh,String horario){
            String rutaProyecto = System.getProperty("user.dir");
         String archivo= rutaProyecto+"\\src\\Doc\\"+datoh+".txt"; 
         GYM_app g = new GYM_app();
         String datos_h="";  
         try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String lineas;
            
            int n=0;
           
               while ((lineas = br.readLine()) != null) {
                // Procesar la línea (en este ejemplo, simplemente imprimirla)
                System.out.println(lineas);
                       if(lineas.contains(":00")){
                           if(datos_h.contains(lineas)){
                                              System.out.println("ya impreso");
                                          }else{
                                              datos_h = datos_h+lineas+"  ->  ";
                                              
                                           for(int i=n;i<horario.length();i++){
                                        if(horario.contains(",")){
                                          String a[] =new String[horario.length()];
                                          a[i] = ""+horario.charAt(i);
                                          
                                               if(a[i].equals(",")){
                                                    n=i+1; 
                                                   datos_h=datos_h+"\n";                
                                                   
                                                    i=horario.length();
                                                 }else{
                                                  
                                                      datos_h =  datos_h + horario.charAt(i)+"";
                                                  }                     
                                        }else{
                                                    datos_h=horario;
                                         }
                                }}}}
            br.close();
            fr.close();       
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
         return datos_h;
} 
    
}
