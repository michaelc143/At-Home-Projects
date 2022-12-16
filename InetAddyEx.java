import java.net.*;
public class InetAddyEx {
    public static void main(String[]args) throws UnknownHostException {
        String host = "google.com";
        try {
            //gets address and stores as local host for google.com
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost);
            //gets address and mac address and displays both to screen
            InetAddress[] iAddresses = InetAddress.getAllByName(host);
            for(InetAddress ipAddy : iAddresses) {
                System.out.println(ipAddy.toString());
            }
        }
        catch(UnknownHostException e) { 
        }
    }
}
