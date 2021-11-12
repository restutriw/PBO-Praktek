package minggu.pkg8.kasus.pkg3;

public class Commission extends Hourly{
    private double total_Sales;
    private double commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate, double commission){
        
        super(eName,eAddress,ePhone,socSecNumber,rate);
        commissionRate = commission;
    }
    
    public void addSales(double totalSales){
        total_Sales = totalSales;
    }
    
    public double pay(){
        double payment = super.pay()+(super.pay()*commissionRate);
        return payment;
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sale: "+total_Sales;
        return result;
    }
            
}
