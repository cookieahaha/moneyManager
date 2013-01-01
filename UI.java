import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UI{

  public static void main(String args[]){
    MoneyManager mm = new MoneyManager();
 
    try{
      FileInputStream fileInputStream = new FileInputStream("moneyLeft.txt");
      mm.setMoneyLeft(fileInputStream.read());
    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }
     
    while(true){
      String userInput = JOptionPane.showInputDialog(null, "How much money did you use?");
      double userInputDouble = Double.parseDouble(userInput);
      mm.useMoney(userInputDouble);
      JOptionPane.showMessageDialog(null, "you used " + userInputDouble + "$. You can use " + mm.getMoneyLeft() + "$.");

      try{
        FileOutputStream fileOutputStream = new FileOutputStream("moneyLeft.txt");
        fileOutputStream.write(mm.getMoneyLeft());
      }
      catch(IOException e){
        e.printStackTrace();
      }
    }
  }

}
