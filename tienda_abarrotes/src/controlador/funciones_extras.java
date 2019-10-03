package controlador;

import vista.Loading;
import vista.Login;


public class funciones_extras {
    
Loading loading=new Loading();  
Login login=new Login();

    public void barra_progreso(){

        loading.setVisible(true);


        try{

        for(int i=0; i<=100; i++){
        Thread.sleep(40);
        loading.porcentaje.setText(Integer.toString(i)+"%");
        loading.barra.setValue(i);
                if(i==100){
                loading.setVisible(false);
                login.setVisible(true);
                }
            }
        }
        catch(InterruptedException e){
            System.out.println("Error"+e);
        }
 }
}
