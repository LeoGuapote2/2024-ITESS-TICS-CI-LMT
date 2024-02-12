package ci.u1TeoremaF;

/**ITESS-TICS ENERO-JULIO 2024 Calculo Integral U1 Teorema fundamental de calculo
 *  20-feb-2024
 * @author Juanita
 */
public class AreaAproximation {
    // - es pribate
    // + es public
    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double x[];
    private double fx[];
    private double area;

    //constructor
    public AreaAproximation(double xIni, double xEnd, int n) {
        this.xIni = xIni;
        this.xEnd = xEnd;
        this.n = n;
        x = new double [n+1];
        fx = new double [n+1];
        
    }
    
    public void computeArea(){
        dx=(xEnd-xIni)/n;
        area=0;
        for(int i=0; i<=n; i++){
            x [i]=xIni+i*dx;
            fx [i]= x[i]*x[i];
            area= area+fx[i]*dx;
            
        }
        
    }

    public double getArea() {
        return area;
    }
    
}
