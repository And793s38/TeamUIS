import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author xavi
 */
public class GetIP {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception {
        int i =0;
        String domain="www.lawebdelprogramador.com";
        while(i<34){
        Scanner N = new Scanner(System.in);
        System.out.println(" Pagina para ip ");
        domain = N.nextLine();
        // Aqui obtenemos la ip local de la maquina
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("IP Local :"+address.getHostAddress());
 
        // Aqui obtenemos la ip de la web del programador
        InetAddress address2 = InetAddress.getByName(domain);
        byte IP[] = address2.getAddress();
        System.out.print("IP del dominio "+domain+" :");
        for (int index = 0; index < IP.length; index++)
        {
           if (index > 0)
                 System.out.print(".");
           System.out.print(((int)IP[index])& 0xff);
        }
        i = i +1;
    }
    }
}