public class AdditionResults {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    Addition myAddition = new Addition(num1,num2,num3);
    
    String output = String.format("The sum is %d", myAddition.getSum());

    System.out.println(output);
  }

}
