package tn.esprit.gestionzoo.entitees;

public  class TerrestrialAnimal extends Animal {
    private int nbrLegs;
    public TerrestrialAnimal(){}
    public TerrestrialAnimal(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public int getnbrlegs() {
        return nbrLegs;
    }

    public void setnbrlegs(int nbrLegs) {
        this.nbrLegs= nbrLegs;
    }
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
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}
