import java.util.Random;
public class Perro2{
        //Atributos
        private int animo;
        private int umbral;
        private Random rand = new Random();
        //Constructor
        Persona p = new Persona();
        public Perro2(){
            animo = (1/p.getConfiabilidad()) * (rand.nextInt() * 10 - 5) + (rand.nextInt(0,10)-5);
            if (p.getDarGalleta() == true){
                animo = (1/p.getConfiabilidad()) * (rand.nextInt(2));
            }
            umbral = (rand.nextInt(0,20)-20);
        }
        //Getters y setters
        public int getAnimo(){
            return animo;
        }
        public void setAnimo(int animo){
            this.animo = animo;
        }
        public int getUmbral(){
            return umbral;
        }
        public void setUmbral(int umbral){
            this.umbral = umbral;
        }
        public int getMoverLaCola(){
            return animo;        
        }
        public void setMoverLaCola(int animo){
            this.animo = animo;
        }
        public int getMorder(){
            return animo;        
        }
        public void setMorder(int animo){
            this.animo = animo;
        }
        public int getLadrar(){
            return animo;        
        }
        public void setLadrar(int animo){
            this.animo = animo;
        }
    }
