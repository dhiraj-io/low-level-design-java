//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    System.out.println("hello");

    Printable p = new Printable();
    Thread t = new Thread(p);
    t.start();

    System.out.println("Hello");

}
