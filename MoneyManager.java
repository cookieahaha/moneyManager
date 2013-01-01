
public class MoneyManager{

  private final double MONEYTOTAL = 2000.0;
  private double moneyLeft;
  private double moneyUsed;

  public MoneyManager(){
    setMoneyLeft(MONEYTOTAL);
  }

  public void setMoneyLeft(int moneyLeft){
    this.moneyLeft = moneyLeft;
  }

  private void setMoneyUsed(double moneyUsed){
    this.moneyUsed = moneyUsed;
  }

  public double getMoneyLeft(){
    return moneyLeft;
  }

  public double getMoneyUsed(){
    return moneyUsed;
  }

  public void useMoney(double moneyUsed){
    moneyLeft -= moneyUsed;
  }
  
}
