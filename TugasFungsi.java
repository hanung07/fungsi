import java.util.Scanner;

public class TugasFungsi {
    static void Nama(int id){
        String namapelanggan[] = {"Hanung", "Cipto", "Wiryadi", "Hayung"};
        System.out.println(namapelanggan[id-1]);
    }

    static int hitungtarif(int jumlahpakai){
        int harga = 0;
            if (jumlahpakai>0 && jumlahpakai<10){
                harga=jumlahpakai*2000;
            }else if(jumlahpakai>=11 && jumlahpakai<=20){
                harga=jumlahpakai*3000;
            }else if(jumlahpakai>=21 && jumlahpakai<=30){
                harga=jumlahpakai*4000;
            }else if(jumlahpakai>=31 && jumlahpakai<=40){
                harga=jumlahpakai*5000;
            }System.out.println(harga+10000);
            return harga;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah id(1-4): ");
        int id = input.nextInt();
        System.out.print("masukan jumlah pemakaian: ");
        int pakai = input.nextInt();
        System.out.print("nama: ");
        Nama(id);
        System.out.print("total: ");
        hitungtarif(pakai);
    }
}
