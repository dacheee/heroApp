public class Hero extends Person {

    private int heroID;
    private int deedTime;

    public Hero() {
    }

    public Hero(int heroID, int deedTime) {
        this.heroID = heroID;
        this.deedTime = deedTime;
    }

    public Hero(String name, String surname, String nickname, HeroType heroType, int heroID, int deedTime) {
        super(name, surname, nickname, heroType);
        this.heroID = heroID;
        this.deedTime = deedTime;
    }

    @Override
    public String toString() {
        return "Hero{" + super.toString() +
                "heroID=" + heroID +
                ", deedTime=" + deedTime +
                "} " ;
    }

//●      calculatedLevel() is the method where hero level is calculated:
    //
    //a.      If the deedTime value is less than 20, the level is 1.
    //
    //b.     If the deedTime value is larger than 20 and less than 40, the level is 2.
    //
    //c.      If the deedTime value is larger than 40, the level is 3.


    public int calculatedLevel() {
        if (deedTime < 20) {
            return 1;
        } else if (deedTime >= 20 && deedTime < 40) {
            return 2;
        } else if (deedTime >= 40) {
            return 3;
        } else {
            return 0;
        }
    }

    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }

}

enum HeroType {
    Hero,
    Villain
}