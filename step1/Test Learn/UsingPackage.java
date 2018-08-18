import pkg.sub.ch;

public class UsingPackage{
  public static void main(String[] args){
    pkg.pa p = new pkg.pa(31.2, 45.9);
    ch c = new ch(13);
    
    System.out.println(p.getArea()*c.getPrice());
  }
}