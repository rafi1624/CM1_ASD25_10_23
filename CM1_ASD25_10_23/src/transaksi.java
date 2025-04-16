public class transaksi {
    String KodeTransaksi, tanggalTransaksi, type;
    double saldo, inOutSaldo, finalSaldo;
    Bank bankAcc = new Bank();

    public transaksi() {
    
    }
    
    public transaksi(String KodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, String type ,Bank bankAcc ) {
        this.KodeTransaksi = KodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.bankAcc = bankAcc;
    }
    
    public void tampilDataTransaksi() {

        System.out.println("Kode Transaksi \t No Rekening \t Saldo \t Debit/Kredit \t Final Saldo \t Tanggal Transaksi \t Type \t bankAcc");
        System.out.println(KodeTransaksi +"\t"+ bankAcc.noRekening +"\t"+ saldo +"\t"+ inOutSaldo +"\t"+ finalSaldo +"\t"+ tanggalTransaksi +"\t"+ type + "");
    }
    
    
}