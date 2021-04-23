package string;

public class OperasiString {
    public static void main(String[] args){
        java.lang.String kota = "Banjarbaru";

        System.out.println(kota);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        java.lang.String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5,9));
        System.out.println(kota.substring(1,4));

    }
}
