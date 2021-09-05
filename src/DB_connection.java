import java.sql.*;
import java.util.ArrayList;

public class DB_connection {


//    creating a method to be used in other class

    private Connection connection;

    public DB_connection() {

//        TRY CATCH method to catch an error with the database

        try {


        String DBConn = "jdbc:sqlite:database.db";
        connection = DriverManager.getConnection(DBConn);

            Statement statement = connection.createStatement();
            String sqlStatement =
                    "CREATE TABLE IF NOT EXISTS heroes " +
                            "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                            "name TEXT NOT NULL, " +
                            "surname TEXT NOT NULL, " +
                            "nickname TEXT NOT NULL, " +
                            "deed time INTEGER NOT NULL, " +
                            "hero type TEXT NOT NULL)";

            statement.execute(sqlStatement);



    }

        catch (SQLException exception) {
            System.out.println("There is an ERROR (database issues): " + exception);
        }



    }

    public ArrayList<Person> getHeroes(){

        ArrayList<Person> heroList = new ArrayList<Person>();

        try {

            Statement statement = connection.createStatement();
            String sqlStatement = "SELECT * FROM heroes";

            ResultSet resultSet = statement.executeQuery(sqlStatement);

            while (resultSet.next()){

//                create new HERO object
                Hero hero = new Hero();
                hero.setHeroID(resultSet.getInt("id"));
                hero.setName(resultSet.getString("name"));
                System.out.println(hero.toString());

            }

        }
        catch (SQLException heroException){
            System.out.println("There was an ERROR getting hero list");
        }

        return heroList;

    }

    public void createHero (){

        ArrayList<Person> heroList = new ArrayList<Person>();

        try {

            Statement statement = connection.createStatement();
            String sqlStatement = "INSERT INTO heroes ("+
                    "name, surname, nickname, hero_type, deed_time")
            ;

            ResultSet resultSet = statement.executeQuery(sqlStatement);

            while (resultSet.next()){

//                create new HERO object
                Hero hero = new Hero();
                hero.setHeroID(resultSet.getInt("id"));
                hero.setName(resultSet.getString("name"));
                System.out.println(hero.toString());

            }

        }
        catch (SQLException heroException){
            System.out.println("There was an ERROR getting hero list");
        }

        return heroList;

    }

}
