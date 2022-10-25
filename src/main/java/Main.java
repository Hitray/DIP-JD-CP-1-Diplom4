import java.io.File;
import java.net.ServerSocket;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        SearchServer searchServer = new SearchServer(8989);
        searchServer.start();
    }
}
