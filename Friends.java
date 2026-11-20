import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

    // declare and initialize the ArrayList
    ArrayList<Name> friends = new ArrayList<>();
    // declare and initialize the Random class
    Random r = new Random();
    // the constructor
    public Friends () {
        friends.add(new Name("Ian", "Shyu"));
        friends.add(new Name("Curtis", "Chan"));
        friends.add(new Name("Issac", "Gao"));

    }
   
    public Name getRandomFriend(){
        //print out the fullname of a rnadom name in the ArrayList 
        int x = (int)(Math.random()) * (friends.size());
        return friends.get(x);
    }
  
}