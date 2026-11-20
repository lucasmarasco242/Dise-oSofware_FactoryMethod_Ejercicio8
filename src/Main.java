public class Main {
    public static void main(String[] args) {
        CreadorCompresor creadorZip = new CreadorCompresorZIP();
        Compresor compresor1 = creadorZip.crearCompresor();
        compresor1.comprimir("datos.txt");

        CreadorCompresor creadorTar = new CreadorCompresorTAR();
        Compresor compresor2 = creadorTar.crearCompresor();
        compresor2.comprimir("backup.dir");

        CreadorCompresor creadorGz = new CreadorCompresorGZ();
        Compresor compresor3 = creadorGz.crearCompresor();
        compresor3.comprimir("log.txt");
    }
}