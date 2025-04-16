public class serviceTransaksi {
    transaksi[] trs;
    int idx = 0;
    int jumData;

    serviceTransaksi(int kapasitas) {
        trs = new transaksi[kapasitas];
        idx = 0;
    }

    void tambah(transaksi transaksi) {
        if (idx < trs.length) {
            trs[idx++] = transaksi;
        } else {
            System.out.println("Data penuh.");
        }
    }

    void FindMax() { //Menu 4 Cari Max Saldo
        if (idx == 0) return;
        transaksi max = trs[0];
        for (int i = 1; i < idx; i++) {
            if (trs[i].saldo > max.saldo) {
                max = trs[i];
            }
        }
        max.tampilDataTransaksi();
    }

    void searching(String noRek) { //Menu 3 Cari No rekening 
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (trs[i].bankAcc.noRekening.equalsIgnoreCase(noRek)) {
                trs[i].tampilDataTransaksi();
                found = true;
            }
        }
        if (!found) System.out.println("No Rekening yang dicari tidak ditemukan.");
    }


    void displayData() {
        System.out.printf("%-15s %-20s %-10s %-12s %-12s %-18s %-10s\n", 
                          "Kode Transaksi", "No Rekening", "Saldo", 
                          "Debit/Kredit", "Final Saldo", "Tanggal Transaksi", "Type");
        for (int i = 0; i < idx; i++) {
            trs[i].tampilDataTransaksi();
        }
    }

    public void sorting() { //(menu 5) sorting final saldo
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (trs[j].finalSaldo > trs[j + 1].finalSaldo) {
                    transaksi temp = trs[j];
                    trs[j] = trs[j + 1];
                    trs[j + 1] = temp;
                }
            }
        }
    }

}