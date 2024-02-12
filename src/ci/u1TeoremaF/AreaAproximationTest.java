/**ITESS-TICS ENERO-JULIO 2024 Calculo Integral U1 Teorema fundamental de calculo
 *  09-feb-2024
 * @author Juanita
 */
package ci.u1TeoremaF;

public class AreaAproximationTest {
    public static void main(String args[]){
        AreaAproximation ap = new AreaAproximation(0.0,4.0,5);
        
        ap.computeArea();
        
        System.out.println(ap.getArea());
    }
}
