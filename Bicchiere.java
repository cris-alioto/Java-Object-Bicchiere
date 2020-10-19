
package bicchiere;

public class Bicchiere {
    private String tipo;
    private String materiale;
    private String colore;
    private String liquido;
    private double livello;
    private double capienza;
    private double resistenza;
    private int durezza;
    private boolean rotto; 

    //Constructor
    public Bicchiere(String tipo, String materiale, String colore, String liquido, double livello, double capienza, double resistenza, int durezza) {
        this.tipo = tipo;
        this.materiale = materiale;
        this.colore = colore;
        this.liquido = liquido;
        this.livello = livello;
        this.capienza = capienza;
        this.resistenza = resistenza;
        this.durezza = durezza;
        rotto = false;
    }
    
    //toString
    @Override    
    public String toString() {
        if(rotto==true) return tipo + " di " + materiale + " e' rotto";
        if(livello==0) return tipo + " di " + materiale + " e' vuoto";
        return tipo + " di "+ materiale + " contiene " + livello + " cc di " + liquido;
    }

    //Getters
    public String getColore() { return colore; }
    public double getCapienza() { return capienza; }
    public double getResistenza() { return resistenza; }
    public int getDurezza() { return durezza; }
    
    //
    public double riempi(String tipo, double quantità){
        if(!rotto){
            if(liquido==null || liquido.equals(tipo)) liquido = tipo;
            else liquido = "mix";
            livello+=quantità;
            double resto = livello - capienza;
            if(resto>0){
                livello = capienza;
                return resto;
            }
        }
        return 0;
    }
    
    public double svuota(double quantità){
        if(!rotto){
            livello -= quantità;
            double resto = livello; 
            if(livello<0){
                livello = 0;
                liquido = null;
                return quantità + resto;
            }
            return quantità; 
        }
        return 0;
    }
    
    public double lancia(double forza){
        double dispersione = livello; 
        if(forza>resistenza){
            rotto = true;
            capienza = 0;
            livello = 0;
            liquido = null;
            return dispersione;
        }
        return 0;
    }
    
}
