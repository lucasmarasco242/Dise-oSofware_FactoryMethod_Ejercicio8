public class CreadorCompresorZIP extends CreadorCompresor {
    public Compresor crearCompresor() {
        return new CompresorZIP();
    }
}