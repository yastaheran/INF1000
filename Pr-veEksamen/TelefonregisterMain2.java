class TelefonregisterMain2 {
    public static void main(String[] args) throws Exception {
	Telefonregister tr = new Telefonregister();
	tr.lesFraFil("kontakter.txt");
	tr.skrivAdresser();
	tr.snakkMedBruker();
    }
}
