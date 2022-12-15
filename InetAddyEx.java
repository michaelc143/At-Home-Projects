import java.net.*;
public class InetAddyEx {
    public static void main(String[]args) throws UnknownHostException {
        String host = "google.com";
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost);
            InetAddress[] iAddresses = InetAddress.getAllByName(host);
            for(InetAddress ipAddy : iAddresses) {
                System.out.println(ipAddy.toString());
            }
        }
        catch(UnknownHostException e) { 
        }
    }
}