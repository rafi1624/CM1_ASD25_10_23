import java.util.Scanner;

public class serviceTransaksi {
    transaksi[] trs = new transaksi[10];
    int idx = 0;
    int jumData;

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (trs[j].saldo > trs[maxIdx].saldo) {
                    maxIdx = j;
                }
            }
            transaksi temp = trs[i];
            trs[i] = trs[maxIdx];
            trs[maxIdx] = temp;
        }
    }
    public void MaxSaldo(){
    transaksi maxSaldo = trs[0];
    for (int i = 1; i < idx; i++) {
        if (trs[i].saldo > maxSaldo.saldo) {
            maxSaldo = trs[i];
            }
        }
    }
}

