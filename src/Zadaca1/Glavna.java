package Zadaca1;
interface IMatematickiOperaciiiCeliBroevi{
    public int odzemanje(int x,int y);
    public long sobiranje(int x,int y);
    public long mnozenje(int x,int y);
    public long delenje(int x,int y);
    public long ostatok(int x,int y);
    public long stepenuvanje(int x,int y);
}
class KalkulatorZaCeliBroevi implements IMatematickiOperaciiiCeliBroevi{
    public int odzemanje(int x,int y){
        int razlika;
        razlika=x-y;
        return razlika;
    }
    public long sobiranje(int x,int y){
        int zbir;
        zbir=x+y;
        return zbir;
    }
    public long mnozenje(int x,int y){
        int proizvod;
        proizvod=x*y;
        return proizvod;
    }
    public long delenje(int x,int y){
        int kolicnik;
        kolicnik=x/y;
        return kolicnik;
    }
    public long ostatok(int x,int y){
        int broj;
        broj=x%y;
        return broj;
    }
    public long stepenuvanje(int x,int y){
        long stepen;
        stepen=(long)Math.pow(x,y);
        return stepen;
    }
}
public class Glavna {
    public static void main(String[] args){
        KalkulatorZaCeliBroevi k=new KalkulatorZaCeliBroevi();
        int x=20;
        int y=20;
        System.out.println("Odzemanje "+k.odzemanje(x,y));
        System.out.println("Sobiranje "+k.sobiranje(x,y));
        System.out.println("Mnozenje "+k.mnozenje(x,y));
        System.out.println("Delenje "+k.delenje(x,y));
        System.out.println("Ostatok "+k.ostatok(x,y));
        System.out.println("Stepenuvanje "+k.stepenuvanje(x,y));
    }
}
