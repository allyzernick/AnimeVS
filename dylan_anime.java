
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class main {

    public static String[] animeList = { "86 EIGHTY-SIX",
            "91 Days",
            "Afro Samurai",
            "AJIN: Demi-Human",
            "Angel Beats!",
            "Assassination Classroom",
            "Baccano!",
            "Black Clover",
            "Bleach",
            "Blood Blockade Battlefront",
            "Blood+",
            "Bungo Stray Dogs",
            "Casshern Sins",
            "Chainsaw Man",
            "Claymore",
            "Cowboy Bebop",
            "D.Gray-man",
            "Darker than Black",
            "Demon Slayer: Kimetsu no Yaiba Entertainment District Arc",
            "Dr. STONE",
            "Dragon Ball Z",
            "DRIFTERS",
            "Ergo Proxy",
            "Fate/stay night: Unlimited Blade Works",
            "Fate/Zero",
            "Final Fantasy VII: Advent Children",
            "Fire Force",
            "Food Wars! Shokugeki no Soma",
            "Fullmetal Alchemist: Brotherhood",
            "GANTZ:O",
            "GetBackers",
            "Gintama",
            "Guilty Crown",
            "Gurren Lagann",
            "Hellsing Ultimate",
            "Hunter x Hunter",
            "Inazuma Eleven",
            "JoJo's Bizarre Adventure (TV)",
            "Karas",
            "Made in Abyss",
            "Mob Psycho 100",
            "My Hero Academia",
            "Naruto",
            "Naruto: Shippuden",
            "Noragami",
            "ONE PIECE",
            "Overlord",
            "Re:ZERO -Starting Life in Another World-",
            "Redline",
            "Sailor Moon",
            "Samurai 7",
            "Soul Eater",
            "Spirited Away",
            "Steins;Gate",
            "Sword Art Online",
            "The Future Diary",
            "The Seven Deadly Sins",
            "Tokyo Ghoul",
            "Tower of God",
            "Vampire Hunter D",
            "VINLAND SAGA",
            "Weathering With You",
            "Your Name.",
            "Yu Yu Hakusho: Ghostfiles",
            "Yu☆Gi☆Oh!",
            "Zoids",
    };

    static String name1 = "";
    static String name2 = "";
    static int iter = 3;

    public static void main(String args[]) {
        int opt = 0;

        init();

        for (int i = 0; i < animeList.length; i++) {
            System.out.println("1. " + name1 + " OR 2. " + name2);

            Scanner sc = new Scanner(System.in);
            System.out.println("Select an option to move on: ");
            opt = sc.nextInt();

            runner(opt);
        }
    }

    // name1 is always option 1
    // name2 is always option 2

    public static void init() {
        name1 = animeList[0];
        name2 = animeList[1];
    }

    // opt will pass which is selected
    public static void runner(int opt) {
        if (opt == 1) {
            name2 = animeList[iter];
            iter++;
        } else if (opt == 2) {
            name1 = animeList[iter];
            iter++;
        }
    }
}
