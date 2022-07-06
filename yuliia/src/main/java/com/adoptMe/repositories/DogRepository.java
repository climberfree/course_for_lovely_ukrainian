package com.adoptMe.repositories;

import com.adoptMe.config.Database;
import com.adoptMe.entities.Dog;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.getInt;

public class DogRepository {
    //CRUD: R-read
    public List<Dog> dogs() {
        Connection connection = Database.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from dog");
            List <Dog> dogs = new ArrayList<>();
            while (resultSet.next()) {
                Dog dog = new Dog();
                dog.setId(getInt("id") );
                dog.setName(resultSet.getString("name"));
                dog.setBreed(resultSet.getString("breed"));
                dogs.add(dog);
            }
            return dogs;
        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
          return null;
        }
    }
}
