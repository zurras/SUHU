import java.util.Scanner;

public class konversisuhu{

    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
        System.out.println("==Progran Konversi Suhu==");

        System.out.println("Masukkan Celsius");
        Double Celcius = S. nextDouble();

        System.out.println("Pilih Opsi");
        System.out.println("1. Fahrenhit");
        System.out.println("2. Reamur");
        System.out.println("3. Kelvin");

        int Opsi = S.nextInt();

        if (Opsi == 1) { 
        Double F = (Celcius * 9/5)+32;
        System.out.println("Anda Memilih Opsi Celcius Ke Fahrenhit");
        System.out.println("Hasil Konversi Celcius Ke Fahrenhit Adalah : "+ F);

        }

        else if (Opsi == 2) {
        Double R = (Celcius * 4/5);
        System.out.println("Anda Memilih Opsi Celcius Ke Reamur");
        System.out.println("Hasil Konversi Celcius Ke Reamur Adalah : "+ R);

         }

        else if (Opsi == 3) {
        Double K = (Celcius+273);
        System.out.println("Anda Memilih Opsi Celcius Ke Kelvin"); 
        System.out.println("Hasil Konversi Celcius Ke Kelvin Adalah : "+ K);

        }

    }
}





 

    









    
    }
    
}
