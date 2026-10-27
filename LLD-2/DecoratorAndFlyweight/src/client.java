public class client {
   public static void main(String[] args) {

//       Coffee coffee = new Espresso();
//
//       System.out.println(coffee.cost());
//       System.out.println(coffee.description());


       Coffee coffee = new Decaf();
       Condiment condiment = new Whip(coffee);

       System.out.println(condiment.cost());
       System.out.println(condiment.description());

       // expresso with moka
       Coffee coffee1 = new Espresso();
       Condiment condiment1 = new Moka(coffee1);

       System.out.println(condiment1.cost());
       System.out.println(condiment1.description());

       // expresso with moka and whip
       Coffee coffee2 = new Espresso();
       Coffee coffee3 = new Moka(coffee2);
       Coffee coffee4 = new Whip(coffee3);

       System.out.println(coffee4.cost());
       System.out.println(coffee4.description());
    }
}
