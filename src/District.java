import java.util.ArrayList;

public class District {

    //class: District
    //attributes
    //
    //- title: String
    //
    //- city: String
    //
    //- districtID: int
    //
    //- heroesInTheDistrict: hero[]

    private String title;
    private String city;
    private int districtID;
    private ArrayList<Hero> heroesInTheDistrict = new ArrayList<Hero>();

    public District() {
    }

    public District(String title, String city, int districtID, ArrayList<Hero> heroesInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.heroesInTheDistrict = heroesInTheDistrict;
    }


    //+ toString(): String
//
    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }


    //+ addNewHero(): boolean
//
    public boolean addNewHero(Hero hero) {
        return heroesInTheDistrict.add(hero);
    }

    //+ removeHero(int index): Hero
//
    public Hero removeHero(int index) {
        return heroesInTheDistrict.remove(index);
    }

    //+ calculateAvgLevelInDistrict(): float
    //+ get and set function
//
    public float calculateAvgLevelInDistrict() {

        float averageLVL = 0;
        for (int i = 0; i < districtSize(); i++) {
            Hero hero = heroesInTheDistrict.get(i);
            averageLVL += hero.calculatedLevel();
        }
        return averageLVL/districtSize();
    }

    public int districtSize() {
        return heroesInTheDistrict.size();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Hero> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<Hero> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;
    }
}
