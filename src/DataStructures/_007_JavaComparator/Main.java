package DataStructures._007_JavaComparator;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

    }
}

class Checker implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o2.score != o1.score){
            return Integer.compare(o2.score, o1.score);
        }

        return o1.name.compareTo(o2.name);
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}