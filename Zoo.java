 package tn.esprit.gestionzoo.entitees;

public class Zoo {
    public static final int MAX_AQUATIC_ANIMALS = 10;
    final AquaticAnimal[] aquaticAnimals;
    private int nbrAquaticAnimals;
    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
     private int nbrAnimals;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new AquaticAnimal[MAX_AQUATIC_ANIMALS];
    }

    public void addAquaticAnimal(AquaticAnimal aquatic) {
        if (nbrAquaticAnimals < MAX_AQUATIC_ANIMALS) {
            aquaticAnimals[nbrAquaticAnimals++] = aquatic;
            System.out.println("L'animal aquatique a été ajouté avec succès au zoo.");
        } else {
            System.out.println("Le zoo aquatique est plein, impossible d'ajouter plus d'animaux aquatiques.");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        // Parcours de tous les animaux aquatiques dans le zoo
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            AquaticAnimal animal = aquaticAnimals[i];
            // Vérifier si l'animal est un pingouin
            if (animal instanceof Penguin) {
                // Cast l'animal en pingouin
                Penguin penguin = (Penguin) animal;
                // Comparer la profondeur de nage du pingouin actuel avec la profondeur maximale
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }
public void displayNumberOfAquaticsByType() {
    int numberOfDolphins = 0;
    int numberOfPenguins = 0;

    // Parcours de tous les animaux aquatiques dans le zoo
    for (int i = 0; i < nbrAquaticAnimals; i++) {
        AquaticAnimal animal = aquaticAnimals[i];
        // Vérifier le type de l'animal aquatique
        if (animal instanceof Dolphin) {
            numberOfDolphins++;
        } else if (animal instanceof Penguin) {
            numberOfPenguins++;
        }
    }

    // Affichage du nombre de dauphins et de pingouins dans le zoo
    System.out.println("Nombre de dauphins dans le zoo : " + numberOfDolphins);
    System.out.println("Nombre de pingouins dans le zoo : " + numberOfPenguins);
}
   /* public void addAnimal(Animal animal) throws ZooFullException {
        if (nbrAnimals >= NUMBER_OF_CAGES) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter plus d'animaux.");
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }*/
   public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
       if (nbrAnimals >= NUMBER_OF_CAGES) {
           throw new ZooFullException("Le zoo est plein, impossible d'ajouter plus d'animaux.");
       }

       if (animal.getAge() < 0) {
           throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
       }

       animals[nbrAnimals] = animal;
       nbrAnimals++;
   }

   /* public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + ", N° animals: " + nbrAnimals);
    }*/


 /*public Zoo() {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new AquaticAnimal[MAX_AQUATIC_ANIMALS];
    }*/
    /*public AquaticAnimal getAquaticAnimal(int index) {
        if (index >= 0 && index < nbrAquaticAnimals) {
            return aquaticAnimals[index];
        }
        return null; // Retourne null si l'indice est invalide ou s'il n'y a pas d'animal aquatique à cet indice
    }*/

     public int getNbrAquaticAnimals() {
         return nbrAquaticAnimals;
     }
    public String getName() {
        return this.name;
    }
    public void setName (String name){
        if (name.isBlank())
            System.out.println("name must contain caractere");
        this.name =name;
    }
    public String getCity(){
        return this.city;
    }
    public void setCity (String city){
        this.city=city;
    }
    public void setNbrAnimals(int nbranimal){
        this.nbrAnimals=nbranimal;
    }
    public int getNbrAnimals(){
        return this.nbrAnimals;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal " + animal.getName() + " n'existe pas dans le zoo.");
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux du zoo " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + ", N° animals: " + nbrAnimals;
    }


}