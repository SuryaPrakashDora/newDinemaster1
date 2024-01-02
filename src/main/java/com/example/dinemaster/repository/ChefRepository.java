/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.repository;

import com.example.dinemaster.model.Chef;
import com.example.dinemaster.model.Restaurant;

import java.util.ArrayList;

public interface ChefRepository {

    ArrayList<Chef> getChef();

    Chef getChefById(int chefId);

    Chef addChef(Chef chef);

    Chef updateChef(int chefId, Chef chef);

    void deleteChef(int chefId);

    Restaurant getchefRestaurant(int chefId);
}