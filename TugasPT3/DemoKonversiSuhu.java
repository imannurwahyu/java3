package TugasPT3;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 demo = new KonversiSuhu2();
        System.out.println("Celcius to Fahrenheit : " + demo.CelciusToFahrenheit(1200.0));
        System.out.println("Celcius to Reamur : " + demo.CelciusToReamur(1000.0));
        System.out.println("Fahrenheit to Reamur : " + demo.FahrenheitToReamur(5500.0));
    }
}
