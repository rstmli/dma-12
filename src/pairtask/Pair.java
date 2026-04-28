package pairtask;

public class Pair <K,V>{
  private K key;
  private V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public static <K,V> void swap (Pair<K,V> pair){
    var key = pair.getKey(); // java value ProgramLanguage
    pair.setKey((K) pair.getValue()); // ProgramLanguage
    pair.setValue((V) key); // programLanguage
  }
  public void displayInfo(){
    System.out.printf("key: %s value %s",key,value);
  }

  public Pair() {
  }
}








/*



  Calc class
 int method (a,b,BiFunction<Integer> function)
  return function.apply(a,b);

  main 15 + 20 = 35


  Function<T,R>
  main{

  Function<String,Integer> func = (a) ->


  }
 */
