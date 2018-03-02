/*
 * made by widea9928
 * on 02/03/2018
 * to calculate the cost of a carpet.
 */

package carpet;

/**
 *
 * @author widea9928
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables for length, width and price per square meter.
        double l = 8.5;
        double w = 6;
        double price = 19.95;
        
        //Calculates the area
        double area = l*w;
        //Calculates total cost
        double cost = area*price;
        //Outputs the cost
        System.out.println("Thine majick carpet shall cost thee $"+cost);
    }
    
}
