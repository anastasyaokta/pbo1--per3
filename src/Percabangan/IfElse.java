package Percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 35000;
        double uangDiDompet = 35000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, Jajan dikurangi lah gais");
            }else if(uangDiDompet>totalBelanja) {
            double Kembalian = uangDiDompet - totalBelanja;
            System.out.println("Uang cukup, Kembalian : " + Kembalian;
        }else{
            System.out.println("Uang Pas.. Thankyou Epribadeehh..");
        }
    }
}
