public class CreadorCompresorGZ extends CreadorCompresor {
    public Compresor crearCompresor() {
        return new CompresorGZ();
    }
}