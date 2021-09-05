public class Villain extends Person{

    private int villainID;
    private int crimeTime;

    public Villain() {
    }

    public Villain(int villainID, int crimeTime) {
        this.villainID = villainID;
        this.crimeTime = crimeTime;
    }

    public Villain(String name, String surname, String nickname, HeroType heroType, int villainID, int crimeTime) {
        super(name, surname, nickname, heroType);
        this.villainID = villainID;
        this.crimeTime = crimeTime;
    }

    @Override
    public String toString() {
        return "Villain{"+ super.toString() +
                "villainID=" + villainID +
                ", crimeTime=" + crimeTime +
                "} " ;
    }




    public int getVillainID() {
        return villainID;
    }

    public void setVillainID(int villainID) {
        this.villainID = villainID;
    }

    public int getCrimeTime() {
        return crimeTime;
    }

    public void setCrimeTime(int crimeTime) {
        this.crimeTime = crimeTime;
    }
}
