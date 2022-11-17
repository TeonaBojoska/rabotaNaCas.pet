package Zadaca2;
interface IMatematickiOperaciiIDecimalniBroevi{
    public double odzemanje(double x,double y);
    public double sobiranje(double x,double y);
    public double mnozenje(double x,double y);
    public double delenje(double x,double y);
    public double ostatok(double x,double y);
    public double stepenuvanje(double x,double y);
}
class KalkulatorZaDecimalniBroevi implements IMatematickiOperaciiIDecimalniBroevi{
    public double odzemanje(double x,double y){
        double razlika;
        razlika=x-y;
        return razlika;
    }
    public double sobiranje(double x,double y){
        double zbir;
        zbir=x+y;
        return zbir;
    }
    public double mnozenje(double x,double y){
        double proizvod;
        proizvod=x*y;
        return proizvod;
    }
    public double delenje(double x,double y){
        double kolicnik;
        kolicnik=x/y;
        return kolicnik;
    }
    public double ostatok(double x,double y){
        double broj;
        broj=x%y;
        return broj;
    }
    public double stepenuvanje(double x,double y){
        double stepen;
        stepen=Math.pow(x,y);
        return stepen;
    }
}
public class Glavna {
    public static void main(String[] args){
        KalkulatorZaDecimalniBroevi k=new KalkulatorZaDecimalniBroevi();
        double x=20.5;
        double y=14.3;
        System.out.println("Odzemanje: "+k.odzemanje(x,y));
        System.out.println("Sobiranje: "+k.sobiranje(x,y));
        System.out.println("Mnozenje: "+k.mnozenje(x,y));
        System.out.println("Delenje: "+k.delenje(x,y));
        System.out.println("Ostatok: "+k.ostatok(x,y));
        System.out.println("Stepenuvanje: "+k.stepenuvanje(x,y));
    }
}
