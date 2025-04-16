import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        serviceTransaksi list = new serviceTransaksi(5);
        Bank[] arrayOfBank = new Bank[5];
        arrayOfBank[0] = new Bank("16038927 3084", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
        arrayOfBank[1] = new Bank("16108617 0573", "Darius", "Susanti", "081-357-843-0547", "darius@pt.org");
        arrayOfBank[2] = new Bank("16240401 2243", "Fuller", "Rosalia", "085-556-712-7062", "fuller@mail.com");
        arrayOfBank[3] = new Bank("16270525 0112", "Maria", "Krabela", "082-267-223-0234", "maria@gmail.com");
        arrayOfBank[4] = new Bank("16101617 2416", "Genry", "Fatimah", "083-683-416-8323", "gery@gery.com");

        transaksi[] data = new transaksi[5];
        data[0] = new transaksi("tr005", 500000, 200000, 700000, "23-04-2024", arrayOfBank[0]);
        data[1] = new transaksi("tr004", 500000, 150000, 650000, "23-04-2024", arrayOfBank[1]);
        data[2] = new transaksi("tr003", 500000, 300000, 200000, "23-04-2024", arrayOfBank[2]);
        data[3] = new transaksi("tr002", 500000, 100000, 600000, "23-04-2024", arrayOfBank[3]);
        data[4] = new transaksi("tr001", 500000, 100000, 400000, "23-04-2024", arrayOfBank[4]);

        int pilihan;
        do {
            System.out.println("==========POLINEMA BANK==========");
            System.out.println("BANK MENU : ");
            System.out.println("1. Data Norek ");
            System.out.println("2. Data Transaksi ");
            System.out.println("3. Search Data ");
            System.out.println("4. Display Min/Max Saldo ");
            System.out.println("5. Sort Data ");
            System.out.println("6. Exit ");
            System.out.print("Pilih Menu 1-6 : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    list.displayData();
                    break;
                
                case 2:
                    list.displayData();
                    break;
                
                case 3:
                    System.out.print("Masukkan No Rekening: ");
                    String noRek = sc.nextLine();
                    list.searching(noRek);
                    break;
                
                case 4:
                    list.FindMax();
                    break;
                
                case 5:
                    list.sorting();
                    break;
                
                case 6:
                    break;
                default:
                
                    break;
            }

        }while(pilihan != 6);
}
}
