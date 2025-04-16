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
    

    public void tampilDataNorek() {
        System.out.printf("%-20s %-15s %-15s %-15s %-25s\n", 
                          noRekening, nama, namaIbu, noHp, email);
    }

}
