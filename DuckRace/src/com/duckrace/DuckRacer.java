package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DuckRacer<Reward> {
    private int id;
    private String name;
    private final Collection<Reward> rewards = new ArrayList();

    // constructor
    public DuckRacer(int id, String name) {
        this.id = id;
        setName(name);
    }

    // accessor methods
    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // business "action" methods
    public int getWins() {
        return rewards.size();
    }
    /*
    * NOTE: instead of returning a direct reference to the collection,
    * we return a "read-only' view
     */
    public Collection<Reward> getRewards() {
       return Collections.unmodifiableCollection(rewards);
       // return List.copyOf(rewards);  // returns a snapshot of the collection
    }

    // business ("action") methods
      public void win(Reward reward) {
            rewards.add(reward);
        }




    @Override
    public String toString() {
        return "DuckRacer{ " +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", rewards= " + rewards +
                '}';
    }

}
