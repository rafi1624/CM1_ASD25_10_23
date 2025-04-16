class Bank {
    String noRekening, nama, namaIbu, noHp, email;

    
    public Bank(){

    }

    public Bank(String noRekening, String nama, String namaIbu, String noHp, String email) 
    {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }
    
    
    // public void tampil() {
    //     System.out.println("Kode : " + kode);  
    //     System.out.println("Nama : " + nama);
    //     System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    //     System.out.println("Usia : " + usia);
    //     System.out.println("");
    // }
}
