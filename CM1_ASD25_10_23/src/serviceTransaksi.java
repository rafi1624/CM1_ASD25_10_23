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

    void displayData() {
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