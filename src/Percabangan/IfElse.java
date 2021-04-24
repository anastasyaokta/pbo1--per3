package Percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 35000;
        double uangDiDompet = 35000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, Kurangi Jajan Anda");
            }else if(uangDiDompet>totalBelanja) {
            double angsul = uangDiDompet - totalBelanja;
            System.out.println("Uang cukup, Angsul : " + angsul);
        }else{
            System.out.println("Uang pas.. UwU..");
        }
    }
}
