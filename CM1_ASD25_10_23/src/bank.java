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
        System.out.println("noRekening: " + noRekening );  
        System.out.println("Nama : " + nama);
        System.out.println("Nama Ibu : "+ namaIbu);
        System.out.println("noHp : "+ noHp);
        System.out.println("email : "+ email);
    }
}
