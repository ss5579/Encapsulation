package Encapsulation;

public class Access {
    public static void main(String[] args) {
        Gamer[] gamers = new Gamer[5];
        gamers[0] = new Gamer("garik123", true);
        gamers[1] = new Gamer("sun456", false);
        gamers[2] = new Gamer("moon345", false);
        gamers[3] = new Gamer("ivan123", true);
        gamers[4] = new Gamer("star789", false);

        System.out.println("Игроки, которые находятся в игре: ");
        for (Gamer gamer : gamers) {
            if (gamer.isActive()) {
                System.out.println(gamer.getNickname());
            }
        }
    }
}

/*
        for (gamers[i] = gamers.length - 1; i++) {
            if (gamer.isActive() == true) {
            System.out.println(gamers[i].getNickname());
            System.out.println(gamers[i].isActive());
            }
        }
 */
/*        Gamer gamer = new Gamer("garik123", false);
        System.out.println(gamer.getNickname());
        System.out.println(gamer.isActive());

        Gamer gamer1 = new Gamer("sun456", true);
        System.out.println(gamer1.getNickname());
        System.out.println(gamer1.isActive());

        Gamer gamer2 = new Gamer("moon345", true);
        System.out.println(gamer2.getNickname());
        System.out.println(gamer2.isActive());

        Gamer gamer3 = new Gamer("ivan123", false);
        System.out.println(gamer3.getNickname());
        System.out.println(gamer3.isActive());

        Gamer gamer4 = new Gamer("star789", true);
        System.out.println(gamer4.getNickname());
        System.out.println(gamer4.isActive());

 */



/*
        Gamer gamer = new Gamer("garik123", false);
        if (gamer.isActive() == true) {
            System.out.println(gamer.getNickname());
            System.out.println(gamer.isActive());
        } else {
        }
        Gamer gamer1 = new Gamer("sun456", true);
        if (gamer1.isActive() == true) {
            System.out.println(gamer1.getNickname());
            System.out.println(gamer1.isActive());
        } else {
        }
        Gamer gamer2 = new Gamer("moon345", true);
        if (gamer2.isActive() == true) {
            System.out.println(gamer2.getNickname());
            System.out.println(gamer2.isActive());
        } else {
        }
        Gamer gamer3 = new Gamer("ivan123", false);
        if (gamer3.isActive() == true) {
            System.out.println(gamer3.getNickname());
            System.out.println(gamer3.isActive());
        } else {
        }
        Gamer gamer4 = new Gamer("star789", true);
        if (gamer3.isActive() == true) {
            System.out.println(gamer4.getNickname());
            System.out.println(gamer4.isActive());
        } else {
        }
    }
}
        //        System.out.println(gamer.getNickname());
        //        System.out.println(gamer.isActive());
        //gamer.setNickname();

 /*
        System.out.println(gamer.getNickname());
        System.out.println(gamer.isActive());
        System.out.println(gamer1.getNickname());
        System.out.println(gamer1.isActive());
        System.out.println(gamer2.getNickname());
        System.out.println(gamer2.isActive());
        System.out.println(gamer3.getNickname());
        System.out.println(gamer3.isActive());
        System.out.println(gamer4.getNickname());
        System.out.println(gamer4.isActive());
*/

