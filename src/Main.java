//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static class Product{

        public int product(int x, int y) {
return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args) {
         Product p1 = new Product();
         System.out.println(p1.product(2,3));
        System.out.println(p1.product(2,3,4));
         System.out.print(p1.product(12.22,3.44));

    }
}