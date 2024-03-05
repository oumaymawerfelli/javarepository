package tn.esprit.gestionzoo.entitees;


public abstract class AquaticAnimal extends Animal {
    private String habitat;

    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean isMammal() {
        return super.isMammal();
    }

    @Override
    public void setMammal(boolean mammal) {
        super.setMammal(mammal);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    /*@Override
    public void setName(String name) {
        super.setName(name);
    }
*/
    // Méthode swim() déclarée comme abstraite
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AquaticAnimal other = (AquaticAnimal) obj;
        return getName().equals(other.getName()) &&
                getAge() == other.getAge() &&
                habitat.equals(other.getHabitat());
    }




    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
}