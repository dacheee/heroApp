public class Person {

    private String name;
    private String surname;
    private String nickname;
    private HeroType heroType;

    public Person() {
    }

    public Person(String name, String surname, String nickname, HeroType heroType) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.heroType = heroType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", heroType=" + heroType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }
}

