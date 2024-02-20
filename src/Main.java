public class Main {
    public static void main(String[] args) {

        Choco c1 = new Choco("Twix",2);
        Choco c2 = new Choco("Bounty",3);

        Burger b1 = new Burger("McDakneck",2,2);
        Burger b2 = new Burger("Jirburger",1,1);

        Coke k1 = new Coke("Pepsi",1.5,true);
        Coke k2 = new Coke("Mirinda",1.2,false);

        Food[] foods = {c1,c2,b1,b2,k1,k2};

        Food max = foods[0];
        for(Food f : foods){
            System.out.println(f.name + " " + f.getCalories());
            if(f.getCalories() > max.getCalories())
                max = f;
        }

        System.out.println("Max " + max.name + " " + max.getCalories());
    }
}
