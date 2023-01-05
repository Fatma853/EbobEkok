import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    int n1, n2;
    int ebob;
    Scanner input = new Scanner(System.in);
    System.out.println("Küçük sayıyı giriniz: ");
    n1 = input.nextInt();
    System.out.println("Büyük sayıyı giriniz: ");
    n2 = input.nextInt();
    int k= n1;
    while(k>=1) {
      if(n1 % k == 0 && n2 % k == 0) {
        ebob= k;
        break;
      } 
      k--;
    }
    int i=1;
    while (k<= n1 * n2) {
      
      if(i % n1==0 && i % n2== 0) {
        System.out.println(+ i);
        break;
      }
      i++;
    }
    System.out.println("Ebob değeri: " +k);
    System.out.println((n1 * n2) / k);
  }
}