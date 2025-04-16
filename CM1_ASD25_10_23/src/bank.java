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
        System.out.println("No Rekening \t Nama \t Nama Ibu \t NoHP \t Email");
        System.out.println(noRekening +"\t"+ nama +"\t"+ namaIbu +"\t"+ noHp +"\t"+ email );
    }

}
