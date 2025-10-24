import java.util.Scanner;
 
 
  public class currencyconverter {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        double usdtoInr = 88.01;
        double usdtoEur = 0.92;
        double usdtoGbp = 0.79;
        double usdtoJpy = 151.5;
        double usdtoAud = 1.52;

        System.out.println("--------------------CURRENCY CONVERTER----------------------");
        System.out.println("AVALIABLE CURRENCYS ARE :");
        System.out.println("USD -> US Dollar");
        System.out.println("INR -> Indian Rupees");
        System.out.println("EUR -> Europ -Euro");
        System.out.println("GBP ->british pound");
        System.out.println("JPY -> Japanese yen");
        System.out.println("AUD -> Australin DOLLar");
        System.out.println("-------------------------------------------------------------");

        System.out.print("\n ENTER THE SOURCE CURRENCY :");
        String from = scan.next().toUpperCase();

        System.out.print("\n ENTER THE TARGETED  CURRENCY :");
        String to  = scan.next().toUpperCase();

        System.out.print("ENTER THE AMOUNT :");
        double amount = scan.nextDouble();
        double usdAmount = amount / getRate(from, usdtoInr, usdtoGbp, usdtoEur, usdtoJpy, usdtoAud);
        double converter = usdAmount * getRate(to, usdtoInr, usdtoGbp, usdtoEur, usdtoJpy, usdtoAud);
        System.out.println(" \n CONVERTER AMOUNT:" + String.format("%.2f", converter) + "  " + to );
        scan.close();

    }
    public static double getRate(String code , double inr, double eur, double gbp, double jpy, double aud)
    {
        switch( code) {
              case "USD": return 1.0;
              case "INR": return inr;
              case "EUP": return eur ;
              case "GBP": return gbp ;
              case "JPY": return jpy;
              case "AUD": return aud;
              default :
            
              return 1.0;
              
              

        }
    }
}