public class OOPS {
  public static void main (String args[]) {
    Pen p1 = new Pen(); // created a pen object called p1
    p1.setColor("Black");

    System.out.println(p1.color);
    p1.SetTip(5);
    System.out.println(p1.tip);
    BankAccount MyAcc = new BankAccount();
    MyAcc.Username = "SrijanChowdhury";
    System.out.println(MyAcc.Username);
    MyAcc.setPassword("Fuck you");
  }
}

class BankAccount {
  public String Username;
  private String Password;

  default public void setPassword (String pwd) {
    Password = pwd;
  }
}

class Pen {
  String color;
  int tip;

  void setColor(String newColor) {
    color = newColor;
  }
  void SetTip (int NewTip) {
    tip = NewTip;
  }
}

class Student {
  String name;
  int age;
  float percentage;
  void CalcuPercan (int phy, int chem, int math) {
    int percentage = (phy + math + chem)/3;
  }
}