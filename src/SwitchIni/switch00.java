package SwitchIni;

public class switch00 {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs   : \"Terimakasih Atas Ilmunya Pak\"");
                System.out.println("Dosen : \"Iya sama-sama mudahan berkah yah\"");
                break;
            case 'B':
                System.out.println("Dosen : \"Selamat yah atas kerja kerasmu,Bapak Bangga\"");
                System.out.println("Mhs   : \"Siap pak,terimakasih, ini berkat bantuan bapak juga\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Mohon Maaf Ibu, apakah hari ini ibu ada sibuk?\"");
                System.out.println("Dosen : \"ouhh ... TIdak , saya hari ini Free\"");
                break;
            default:
                System.out.println("Mhs   : \"Hari ini saya ingin mengajak Ibu untuk Berbelanja\"");
                System.out.println("Dosen : \"ouhh ... Oghey bisa, mau berbelanja kemana kita\"");
                System.out.println("Mhs   : \"HTerserah ibu,saya ACC bu\"");
                System.out.println("Dosen : \"Baiklah ayo kita cuss epribadih\"");
                break;

        }
    }
}
