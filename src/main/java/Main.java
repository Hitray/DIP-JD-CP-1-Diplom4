11 lines (9 sloc)  383 Bytes

public class Main {
    public static final int PORT = 8989;

    public static void main(String[] args) throws Exception {
        SearchServer server = new SearchServer(PORT);
        server.start();
    }
}
