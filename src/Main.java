import java.util.*;

public class Main {
    // Function to add x in arr
    public static String[] addX(String heroArray[], String newHeroName) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Add the new element
        arrlist.add(newHeroName);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);

        // return the array
        return heroArray;
    }

    // Function to remove a hero from an array
    public static String[] removeX(String heroArray[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Find and remove a String from an array
        arrlist.remove(heroIndexToDelete);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        heroArray = Arrays.copyOf(heroArray, heroArray.length - 1);
        // return the array
        return heroArray;
    }

    public static void main(String[] args) {

        DB_connection heroDB = new DB_connection();


//        ArrayList<District> listOfLargestDistricts = new ArrayList<>();
//int largestNumberOfPeopleInDistrict = 0;
//for (District eachDistrict : listOfDistricts) {
//    if (eachDistrict.amountOfPersonsInDistrict() > largestNumberOfPeopleInDistrict) {
//        largestNumberOfPeopleInDistrict = eachDistrict.amountOfPersonsInDistrict();
//       }
//}
//for (District eachDistrict : listOfDistricts) {
//    if (eachDistrict.amountOfPersonsInDistrict() == largestNumberOfPeopleInDistrict) {
//        listOfLargestDistricts.add(eachDistrict);
//        System.out.println(eachDistrict.getTitle());
//    }
//}
        //a.      Create seven Heroes as the objects, two Districts as the objects and three Villains as the objects.
        Hero hero1 = new Hero("Good", "Hero", "The good hero", HeroType.Hero, 1, 1);
        Hero hero2 = new Hero("Good", "Hero2", "The good hero number two", HeroType.Hero, 2, 2);
        Hero hero3 = new Hero("Good", "Hero3", "The good hero number three", HeroType.Hero, 3, 3);
        Hero hero4 = new Hero("Good", "Hero4", "The good hero number hour", HeroType.Hero, 4, 4);
        Hero hero5 = new Hero("Good", "Hero5", "The good hero number five", HeroType.Hero, 5, 5);
        Hero hero6 = new Hero("Good", "Hero6", "The good hero number six", HeroType.Hero, 6, 6);
        Hero hero7 = new Hero("Good", "Hero7", "The good hero number seven", HeroType.Hero, 7, 7);


        Villain villain1 = new Villain("Bad", "Guy", "Dr.Evil", HeroType.Villain, 100, 666);
        Villain villain2 = new Villain("Bad", "Guy2", "Dr.Not nice", HeroType.Villain, 150, 999);
        Villain villain3 = new Villain("Bad", "Guy3", "Dr.Villain", HeroType.Villain, 200, 777);

        //        this.title = title;
        //        this.city = city;
        //        this.districtID = districtID;
        //        this.heroesInTheDistrict = heroesInTheDistrict;


        District goodDistrict = new District();
        District goodDistrict2 = new District();


        //            this.title = title;
        //        this.city = city;
        //        this.districtID = districtID;
        //        this.heroesInTheDistrict = heroesInTheDistrict;

        //b.     Add three Heroes in the first District and others in the second District.
        //

        goodDistrict.setTitle("Good district nr1");
        goodDistrict.setCity("Riga");
        goodDistrict.setDistrictID(1);
        goodDistrict.getHeroesInTheDistrict().add(hero1);
        goodDistrict.getHeroesInTheDistrict().add(hero2);
        goodDistrict.getHeroesInTheDistrict().add(hero3);

        goodDistrict2.setTitle("Good district nr2");
        goodDistrict2.setCity("Ventspils");
        goodDistrict2.setDistrictID(2);
        goodDistrict2.getHeroesInTheDistrict().add(hero4);
        goodDistrict2.getHeroesInTheDistrict().add(hero5);
        goodDistrict2.getHeroesInTheDistrict().add(hero6);
        goodDistrict2.getHeroesInTheDistrict().add(hero7);


        //c.      Print out all information about each District.
        //

        System.out.println(goodDistrict.toString());
        System.out.println(goodDistrict2);
        //d.     Print out information about all Villains.
        //

        System.out.println(villain1.toString());
        System.out.println(villain2.toString());
        System.out.println(villain3.toString());
//

        ArrayList<District> districtArray = new ArrayList<>();
        districtArray.add(goodDistrict);
        districtArray.add(goodDistrict2);

        System.out.println(districtArray);

        int allHeroes = goodDistrict.districtSize() + goodDistrict2.districtSize();
        System.out.println("There are " + allHeroes + " heroes in both districts");

        int avgLVLInGoodDistr = (int) goodDistrict.calculateAvgLevelInDistrict();
        int avgLVLInGoodDistr2 = (int) goodDistrict2.calculateAvgLevelInDistrict();

        if(avgLVLInGoodDistr < avgLVLInGoodDistr2){
            System.out.println("District is the best based on the average level of heroes. : " + goodDistrict.getTitle());
        }
        else if (avgLVLInGoodDistr > avgLVLInGoodDistr2) {

            System.out.println("District is the best based on the average level of heroes. : " + goodDistrict2.getTitle());
        }
        else {
            System.out.println("Avg LVL is the same in both districts");
        }

//e.      Create an arraylist for Villains storing. Put all Villains in it.
//
//f.      Find out the total number (total time) of the crimes in which the Villains were involved.
//
//g.     Find out which Villains is involved the most to crimes (max time spent).

        ArrayList<Villain> allVillains = new ArrayList<>();
        allVillains.add(villain1);
        allVillains.add(villain2);
        allVillains.add(villain3);



        Villain baddestVillain = allVillains.get(0);
        for (int i = 0; i < allVillains.size(); i++) {
            Villain villain = allVillains.get(i);
        if (baddestVillain.getCrimeTime()<villain.getCrimeTime()){
            baddestVillain=villain;
        }
        else {
            baddestVillain=baddestVillain;
        }
        }
        System.out.println("The baddest Villain of them all " + baddestVillain);



        String[] heroList = {"AliExpressMan", "DogoMom", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowflake", "MuffinGirl", "STAR"};


        // MENU
        int menuEntry;
        Scanner scanner = new Scanner(System.in);

        // BUSINESS REQUIREMENTS FOR LESSON #12
        // 1. I would like to see a MENU to select different parts of superhero information card
        // 2. A list of superheroes
        // 3. Add new superhero
        // 4. show specific superhero information
        // 5. Delete the superhero from the list
        // 6. Print info about heroes
        // 0. Exit
        do {
            // EXIT == 0
            System.out.println("Welcome!");
            System.out.println("Please select what to do:");
            System.out.println("1 - Show a list of superheroes");
            System.out.println("2 - Add a new superhero");
            System.out.println("3 - Show specific superhero information");
            System.out.println("4 - Delete the superhero");
            System.out.println("0 - Exit");
            menuEntry = scanner.nextInt();

            switch (menuEntry) {
                case 1:

                    System.out.println("======== SUPERHERO LIST +++++++++");

                    heroDB.getHeroes();

                    break;
                case 2:
                    System.out.println("Enter hero's name");
                    String newHeroName = scanner.next();
                    heroList = addX(heroList, newHeroName);
                    break;
                case 3:

                    // Show different information, based on selected superhero!
                    System.out.println("Which superhero info to print?");
                    int superheroIndex = scanner.nextInt();
//                    String superHeroName = scanner.next();

                    System.out.println("Hero name: " + heroList[superheroIndex]);

                    // Variable initialization
                    String heroName;
                    String heroCity;

                    String heroPower1, heroPower2, heroPower3;

                    boolean isEvil;

                    double heroSalary;
                    String realName;

                    String universe;

                    // Variable assignment
                    heroName = "AliexpressMan";
                    heroCity = "Dobele";
                    heroPower1 = "Super discounts";
                    heroPower2 = "Fast delivery";
                    heroPower3 = "";
                    isEvil = false;
                    heroSalary = 99.99;
                    realName = "Artjoms";
                    universe = "Ours";

                    // Print out Hero information card
                    System.out.println("***************************");
                    System.out.println("*** HERO INFORMATION ***");
                    System.out.println("***************************");

                    System.out.println("Hero name: " + heroName);
                    System.out.println("This hero lives in  " + heroCity);

                    System.out.println("----------------------------");
                    System.out.println("Hero Superpowers:");
                    System.out.println("---" + heroPower1);
                    System.out.println("---" + heroPower2);
                    System.out.println("---" + heroPower3);

                    System.out.println("This super hero is evil? " + isEvil);

                    System.out.println("This hero earns: " + heroSalary + " EUR");
                    System.out.println(realName + " hides his identity.");
                    System.out.println("Hero lives in " + universe + " Universe");
                    System.out.println();
                    System.out.println("***************************");
                    System.out.println("*** HERO INFORMATION ***");
                    System.out.println("***************************");


                    // If a hero is a villain or a hero
                    if (isEvil) {
                        System.out.println(" Hero is a villain. he is stealing cookies!!!");
                    } else {
                        System.out.println("hero protects the city!");
                    }


                    heroCity = "Metropolis";

                    switch (heroCity) {
                        case "New York":
                            heroSalary = 2000;
                            break;
                        case "Riga":
                            heroSalary = 1200.91;
                            break;
                        case "Metropolis":
                            heroSalary = 1000000;
                            break;
                        default:
                            heroSalary = 100;
                    }

                    System.out.println("Hero's new salary: " + heroSalary);
                    // How many cookies can superhero purchase for his /her salary
                    // 1 cookie costs = 1.29 euro
                    System.out.println("**********************************");
                    System.out.println("********** Financials ***************");
                    int numOfCookies = (int) Math.floor(heroSalary / 1.29);
                    System.out.println(" Hero can purchase " + numOfCookies + " cookies");
                    double averageDailySalary = Math.round((heroSalary / 30 * 100)) / 100;
                    System.out.println(" Hero average daily salary is " + averageDailySalary + " euro");
                    break;
                case 4:
                    System.out.println("please enter hero index to be removed");
                    int heroToRemove = scanner.nextInt();

                    heroList = removeX(heroList, heroToRemove);
                    break;
                default:
                    System.out.println("menu item does not exist");
            }

        } while (menuEntry != 0);


    }


}
