import java.util.Random;
public class Persona{
        //Atributos
        private int confiabilidad;
        private boolean galleta;
        private Random rand = new Random();
        //Constructor
        public Persona(){
            confiabilidad = (rand.nextInt(0,10)); 
            galleta = (rand.nextBoolean());
        }
        //Getters y setters
        public int getConfiabilidad(){
            return confiabilidad;
        }
        public void setConfiabilidad(int confiabilidad){
            this.confiabilidad = confiabilidad;
        }
        public boolean getGalleta(){
            return galleta;
        }
        public void setGalleta(boolean galleta){
            this.galleta = galleta;
        }
        public int getInteractura(){
            return confiabilidad;
        }
        public void setInteractuar(int confiabilidad){
            this.confiabilidad = confiabilidad;
        }
        public boolean getDarGalleta(){
            return galleta;
        }
        public void setDarGalleta(boolean galleta){
            this.galleta = galleta;
        }
    }