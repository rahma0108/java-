public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages=25;
    int cmp = 0;

    // public Zoo() {}
    public Zoo( String name, String city) {
        animals = new Animal[25];
        this.name = name;
        this.city = city;
    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Animals in Zoo:");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].name);
            }
        }
    }
    public String toString(){
        String ch="Name : "+this.name + "\n City " + this.city + "\n Number of Cages: " + this.nbrCages;
        String a="";
        for (int i = 0; i < cmp; i++) {
            a+=animals[i];

        }
        return ch+a;

    }
    public boolean addAnimal(Animal animal) {
        if (cmp < nbrCages && searchAnimal(animal)==-1) {
            animals[cmp] = animal;
            cmp = cmp + 1;
            return true;
        } else {
            return false;
        }
    }

    public int searchAnimal(Animal animal)
    {
        for (int i=0;i<cmp;i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal)
    {
        for (int i=0;i<cmp;i++) {
            if (animals[i].name.equals(animal.name)) {
                animals[i] = null;
                cmp = cmp - 1;
                System.out.println("Removed animal " + animal.name + " from Zoo");
                return true;
            }
        }
        return false;
    }

}
