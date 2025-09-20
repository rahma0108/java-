//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal a1=new Animal("test","aaaa",10,false);
        //a1.displayanimal();
        Zoo z1=new Zoo("myZoo","sfax");
        //z1.displayZoo(a1);
        Zoo z2=new Zoo("Zoo1","sfax");

        Animal anim=new Animal("species","Animal",4,true);
        Animal anim1=new Animal("aaaa","zzzz",7,false);
        Animal anim2=new Animal("bbbbb","eeee",8,true);

        boolean add=z1.addAnimal(anim);
        boolean add1=z1.addAnimal(anim1);
        boolean add2=z1.addAnimal(anim2);
        z1.displayZoo();
        System.out.println(z1.cmp);
        int p= z1.searchAnimal(anim2);
        System.out.println(p);
        Aquatic aquatic1=new Aquatic("aaaaa","aaaaa",5,true,"tunis");
        Dolphin dolphin=new Dolphin(true);
        aquatic1.swim();


    }
}