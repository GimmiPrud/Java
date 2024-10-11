public class Pitagora {
    public static void main(String[] args) {

        double c1 = 45.3;
        double c2 = 67.2;

        double Ipo = Math.sqrt((c1*c1)+(c2*c2));
        double Area = (c1*c2)/2;
        double P = Ipo + c1 + c2;
        double r_cerchio = (c1/c2)*Ipo;
        double C_cerchio = (3.14 * r_cerchio)*2;
        double A_cerchio = (r_cerchio*r_cerchio)* 3.14;

        System.out.println("Ipotenusa = " + Ipo);
        System.out.println("Area = " + Area);
        System.out.println("Perimetro = " + P);
        System.out.println("Circonferenza cerchio = " + C_cerchio);
        System.out.println("Area cerchio = " + A_cerchio);

    }
}