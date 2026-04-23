package enumstask;

public enum Color {
  RED("red"),// red
  GREEN("green"),
  YELLOW("yellow"),
  BLACK("black"),
  BLUE("blue"),
  WHITE("white");

  private String value;
  Color(String value){
    this.value = value;
  }
  public String getValue(){
    return value;
  }

}
