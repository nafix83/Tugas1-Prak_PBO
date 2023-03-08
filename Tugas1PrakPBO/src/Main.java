import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int pilih;
            boolean ulang = true;
            
            while(ulang){
                System.out.println("");
                System.out.println("+=================+");
                System.out.println("      MENU");
                System.out.println("+=================+");
                System.out.println("1. Hitung Balok");
                System.out.println("2. Hitung Tabung");
                System.out.println("3. Keluar");
                System.out.print("Pilih : ");
                pilih = sc.nextInt();
                    
                    switch(pilih){
                        case 1:
                        // input nilai
                            System.out.println("Ini Balok");
                            System.out.println("Masukkan nilai");
                            
                        
                            System.out.print("Panjang   : ");
                            float p = sc.nextInt();
                            
                            System.out.print("Lebar     : ");
                            float l = sc.nextInt();
        
                            System.out.print("Tinggi    : ");
                            float tinggiBalok = sc.nextInt();
                            //pemanggilan ya kakk
                            MenghitungRuang balok = new Balok(tinggiBalok, p, l);
                            balok.cetak();
                            
                            break;
                        case 2:
                        //inout nilai
                            System.out.println("Ini Tabung");
                            System.out.println("Masukkan nilai");
                            
                            System.out.print("Jari-jari : ");
                            float j = sc.nextInt();
                            
                            System.out.print("Tinggi    : ");
                            float tinggiTabung = sc.nextInt();
                            // pemanggilan dll
                            MenghitungRuang tabung = new Tabung(tinggiTabung, j);
                            tabung.cetak();
                            
                            
                            break;
                        case 3:
                            System.out.println("Program Berakhir");
                            ulang = false;
                            break;

                        default:
                                System.out.println("Maaf, menu tidak tersedia");
                            break;
                }
            }
        }
    }
}

// Masukkan nilai
// Panjang   : 2 
// Lebar     : 3
// Tinggi    : 4
// Keliling        = 10.0
// Luas            = 6.0 
// Luas Permukaan  = 52.0
// Volume          = 24.0


// Masukkan nilai
// Jari-jari : 7 
// Tinggi    : 2
// Keliling        = 43.982297150257104
// Luas            = 153.93804002589985
// Luas Permukaan  = 395.8406743523139 
// Volume          = 307.8760800517997 


/*Ardan Maukemana Nafi'a
 * 123210117
 * Plug IF-F
 */