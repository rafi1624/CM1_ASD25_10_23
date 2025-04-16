public class transaksi {
    String KodeTransaksi, tanggalTransaksi, type;
    double saldo, inOutSaldo, finalSaldo;
    Bank bankAcc = new Bank();

    public transaksi() {
    
    }
    
    public transaksi(String KodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type ,Bank bankAcc ) {
        this.KodeTransaksi = KodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.bankAcc = bankAcc;
    }
    
    public void tampilDataTransaksi() {
        System.out.printf("%-15s %-20s %-10.2f %-12.2f %-12.2f %-18s %-10s\n",
                          KodeTransaksi, bankAcc.noRekening, saldo, inOutSaldo,
                          finalSaldo, tanggalTransaksi, type);
    }
    
    
    
}