// Servidor

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;

public class Servidor {
    
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(4125);
        int conexoes = 0;
        while(true) {
            Socket socket = server.accept();
            try (PrintWriter p = new PrintWriter(socket.getOutputStream())) {
                conexoes++;
                p.println(conexoes);
            }
        }
    }
    
}
