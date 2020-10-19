
package bicchiere;

public class Main {

    public static void main(String[] args) {
        Bicchiere b = new Bicchiere("Il calice","vetro","trasparente",null, 0, 40, 6.0, 7);
        double resto;
        //vuoto
        System.out.println(b);
        //30 cc di Birra
        System.out.println(" --- Riempi 30 cc di birra");
        resto = b.riempi("Birra", 30);
        System.out.println(b);
        if(resto>0) System.out.println(resto + " cc non sono stati aggiunti, capienza massima raggiunta");
        //40 cc di Coca cola
        System.out.println(" --- Riempi 40 cc di Coca cola");
        resto = b.riempi("Coca cola", 40);
        System.out.println(b);
        if(resto>0) System.out.println(resto + " cc non sono stati aggiunti, capienza massima raggiunta");
        //Svuota 30 cc
        System.out.println(" --- Svuota 30 cc");
        resto = b.svuota(30);
        System.out.println(resto + "cc svuotati");
        System.out.println(b);
        //40 cc di Vino
        System.out.println(" --- Riempi 40 cc di Vino");
        resto = b.riempi("Vino", 40);
        System.out.println(b);
        if(resto>0) System.out.println(resto + " cc non sono stati aggiunti, capienza massima raggiunta");
        //Svuota 30 cc
        System.out.println(" --- Svuota 30 cc");
        resto = b.svuota(30);
        System.out.println(resto + " cc svuotati");
        System.out.println(b);
        //Lancia
        System.out.println(" --- Lancia");
        if(!b.isRotto()){
            resto = b.lancia(8.0);
            if(b.isRotto()) System.out.println(b + "\n" + resto + " cc di liquido disperso.");
            else System.out.println("Sei debole, " + b.getTipo() + " di " + b.getMateriale() + " e' intatto");
        }
        else System.out.println("Il bicchiere e' gia' rotto... lancia qualcos'altro");
        //Riempi 10 cc di birra
        System.out.println(" --- Riempi 30 cc di birra");
        resto = b.riempi("Birra", 10);
        System.out.println(b);
        if(resto>0) System.out.println(resto + " cc non sono stati aggiunti, capienza massima raggiunta");
        //Svuota 30 cc
        System.out.println(" --- Svuota 30 cc");
        resto = b.svuota(30);
        System.out.println(resto + " cc svuotati");
        System.out.println(b);
        //Lancia
        System.out.println(" --- Lancia");
        if(!b.isRotto()){
            resto = b.lancia(8.0);
            if(b.isRotto()) System.out.println(b + "\n" + resto + " cc di liquido disperso.");
            else System.out.println("Sei debole, " + b.getTipo() + " di " + b.getMateriale() + " e' intatto");
        }
        else System.out.println("Il bicchiere e' gia' rotto... lancia qualcos'altro");
    }
    
}
