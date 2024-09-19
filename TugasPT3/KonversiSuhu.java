package TugasPT3;

public class KonversiSuhu {
    double f,r,c;
    public double CelciusToFahrenheit(double c){
        f = 1.8 * c + 32;
        return f;
    };
    
    public double CelciusToReamur(double c){
        r = 0.8 * c;
        return r;
    };
}