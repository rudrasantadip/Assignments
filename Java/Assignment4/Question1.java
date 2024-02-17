/*
 * Write a JAVA program apply the concept of method overriding,
 *  consider the case  where  Bank  is  a  class  that  provides  functionality  to  get  the  rate  of interest. 
 *  The  rate  of  interest  varies  according  to  bank  are,  SBI,  PNB  and Bank of Baroda banks 
 * could provide 9%, 10%, and 11% rate of interest.
 */
class Bank
{
    float rateOfInterest=0.0f;

    public float getRateOfInterest() {
        return rateOfInterest;
    }
}

class SBI extends Bank
{
    float rateOfInterest=9f;
    @Override
    public float getRateOfInterest() {
        return this.rateOfInterest;
    }
}

class PNB extends Bank
{
    float rateOfInterest=10f;
    @Override
    public float getRateOfInterest() {
        return this.rateOfInterest;
    }
}

class BankOfBaroda extends Bank
{
    float rateOfInterest=11f;
    @Override
    public float getRateOfInterest() {
        return this.rateOfInterest;
    }
}



 public class Question1
 {
    public static void main(String[] args)
    {
       System.out.println("Rates Of Interest");

       System.out.println("SBI: "+new SBI().getRateOfInterest());
       System.out.println("PNB: "+new PNB().getRateOfInterest());
       System.out.println("Bank Of Baroda: "+new BankOfBaroda().getRateOfInterest());
    }
 }