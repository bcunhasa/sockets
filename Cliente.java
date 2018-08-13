// Cliente

import java.net.Socket;
import java.util.Scanner;
import java.io.PrintWriter;

public class Cliente {
    
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 4125);
        Scanner s = new Scanner(socket.getInputStream());
        System.out.println("Conexão número : " + s.nextLine());
        s.close();
    }
}
