import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tgs_queue {
    public static void main(String[] args) {

        System.out.println("Nama \t: Athifa Rifda Andra");
        System.out.println("NIM \t: 2111522010");
        System.out.println("Materi \t: Queue");
        System.out.println("----------------------");
        System.out.println("");
        
        Queue <String> antrian = new LinkedList<String>();
        antrian.add("Amar");  
        antrian.add("Bayu");
        antrian.add("Civa");
        antrian.add("Dony");
        antrian.add("Emar");
        antrian.add("Ferry");
        antrian.add("Gala");
        antrian.add("Hanif");
        antrian.add("Intan");
        antrian.add("Jack");

        System.out.println("Antrian Magasin Burger");
        System.out.println("");
        System.out.println(antrian);
        System.out.println("");

        boolean bool = true;
        
        Scanner pilih = new Scanner (System.in);

            
            System.out.println("1. DEQUEUE");
            System.out.println("2. Elemen Awal");
            System.out.println("3. Bersihkan Antrian");
            System.out.println("4. Apakah Antrian kosong? ");
            System.out.println("5. Tampilkan Antrian");
            System.out.println("6. Banyaknya Antrian");
            System.out.println("7. Selesai");
            System.out.print("MASUKAN PILIHAN [1-7]: ");

        do {
            int input=pilih.nextInt();
            switch(input){
                
                case 1:
                    System.out.println("Ambil Nama: "+antrian.poll()); 
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Nama Paling Awal: "+antrian.peek()); 
                    System.out.println("");
                    break;
                
                case 3:
                    antrian.clear();
                    System.out.println("Antrian Telah Dibersihkan");
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("Apakah Antrian Kosong? "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Antrian: "+antrian);
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("Banyak Antrian " +antrian.size());
                    System.out.println("");
                    break;

                case 7:
                    System.exit(0);
                    break;
                
                default:
                System.err.println("Pilihan Anda Salah");
                System.out.println("");
            }
        }
        while(bool);

    }
}