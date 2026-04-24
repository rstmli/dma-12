package enumstask;

public enum Color {
  RED("red"),// red
  GREEN("green"),
  YELLOW("yellow"),
  BLACK("black"),
  BLUE("blue"),
  WHITE("white");

  private final String value;
  Color(String value){
    this.value = value;
  }


  public String getValue(){
    return value;
  }

}


/*
weekly enum yaradaq
icerisinde MONDAY("Bazar ertesi"),THOSDAY vs.
switch case ile yoxlayiriq
int deyer = sc.nextInt();
1
sout("bugun bazarertesidir");
 */