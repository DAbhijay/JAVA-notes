class Player {
    void play() {
        System.out.println("Playing...");
    }
}

class Cricket extends Player {
    void play() {
        System.out.println("Playing Cricket...");
    }
}

class Football extends Player {
    void play() {
        System.out.println("Playing Football...");
    }
}

class Batsman extends Cricket {
    void play() {
        System.out.println("Playing Batsman...");
    }
}

class Bowler extends Cricket {
    void play() {
        System.out.println("Playing Bowler...");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        System.out.println("Hybrid Inheritance");
        Batsman b = new Batsman();
        b.play();
        Bowler bo = new Bowler();
        bo.play();
        Football f = new Football();
        f.play();
        Cricket c = new Cricket();
        c.play();
        Player p = new Player();
        p.play();
    }
}

