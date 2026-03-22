package chapter6;

public class SimplePhoneBill {
    private  int basecost;
    private int minutesUsed;
    private  int costperminute;


    public SimplePhoneBill() {
        basecost = 100;
        minutesUsed = 0;
        costperminute = 2;
    }

    public SimplePhoneBill(int basecost, int minutesUsed, int costperminute) {

        this.basecost = basecost;

        this.minutesUsed = minutesUsed;
        this.costperminute = costperminute;
    }

    public double getBaseCost() {
        return basecost;
    }

    public void setBaseCost(int basecost) {
        this.basecost = basecost;

    }

    public double getMinutesUsed() {
        return minutesUsed;

    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;

    }

    public double getcostperminute() {
        return costperminute;
    }

    public void setcostperminute(int costperminute) {
        this.costperminute = costperminute;

    }


public double extra() {
    if (minutesUsed > 50) {
        return (minutesUsed - 50);

    }
    return 0;
}
    public double calculateBill() {

if (minutesUsed>50){

    return basecost + (extra() * 2);
}

else
     return basecost;
    }

    public void printbill() {
        System.out.println(calculateBill());
    }
}