//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("hello");
    for(int i = 1; i<=100; i++) {
        IndividualNumberPrinter inp = new IndividualNumberPrinter(i);
        Thread t = new Thread(inp);
        t.start();
    }

    System.out.println("Hello");

}
