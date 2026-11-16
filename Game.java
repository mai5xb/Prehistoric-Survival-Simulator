import java.util.Scanner;

public class Game {

    private Player player;
    private Scanner input;

    private boolean createdPainting;
    private boolean leftSymbols;

    public Game() {
        input = new Scanner(System.in);
        createdPainting = false;
        leftSymbols = false;
    }

    public void startGame() {

        System.out.println("══════════════════════════════");
        System.out.println("🦴 WELCOME TO 17,000 BCE 🦴");
        System.out.println("══════════════════════════════");

        System.out.print("👤 Enter your name: ");
        String name = input.nextLine();

        player = new Player(name);

        System.out.println("\n🌟 Welcome, " + player.getName() + "!!");
        System.out.println("You are now a member of a Paleolithic tribe.");

        day1();

        if (!player.isAlive()) {
            ending();
            return;
        }

        day2();

        if (!player.isAlive()) {
            ending();
            return;
        }

        day3();

        ending();
    }

    private void day1() {

        System.out.println("\n════════════════════");
        System.out.println("🌞 DAY 1 - SURVIVAL");
        System.out.println("════════════════════");

        System.out.println("🍖 Food supplies are running low!");
        System.out.println("\nWhat will you do, " +player.getName()+"?");

        System.out.println("1. Hunt a Bison 🦬");
        System.out.println("2. Gather Berries 🍓");
        System.out.println("3. Follow Animal Tracks 🐾");

        int choice = input.nextInt();

        switch (choice) {

            case 1:

                System.out.println("\n🦬 Yayy you found a huge bison herd!");

                System.out.println("1. Attack Alone ⚔️");
                System.out.println("2. Hunt With Your Tribe 👥");
                System.out.println("3. Set A Trap 🪤");

                int huntChoice = input.nextInt();

                switch (huntChoice) {

                    case 1:
                        System.out.println("\n💥 DISASTER!");

                        System.out.println(
                                "You attack the bison without waiting for your tribe."
                        );

                        System.out.println(
                                "The hunt succeeds, but the bison fights back."
                        );

                        player.changeHealth(-30);
                        player.changeFood(20);

                        System.out.println("\n📊 RESULT");
                        System.out.println("❤️ Health -30");
                        System.out.println("🍖 Food   +20");


                        break;

                    case 2:
                        System.out.println("\n🎉 GREAT CHOICE!");

                        System.out.println(
                                "You hunt together with your tribe."
                        );

                        System.out.println(
                                "Everyone works as a team and succeeds."
                        );

                        player.changeFood(40);
                        player.changeScore(20);

                        System.out.println("\n📊 RESULT");
                        System.out.println("🍖 Food   +40");
                        System.out.println("⭐ Score  +20");

                        break;

                    case 3:
                        System.out.println("\n🪤 Trap successful!");
                        player.changeFood(30);

                        System.out.println("🐺 UHM but a wolf steals some meat...");
                        player.changeFood(-10);
                        break;
                }

                break;

            case 2:

                System.out.println("\n🍓 You find a berry bush!");

                System.out.println("1. Eat Immediately 😋");
                System.out.println("2. Bring Them Home 🏠");
                System.out.println("3. Take Everything 👀");

                int berryChoice = input.nextInt();

                switch (berryChoice) {

                    case 1:
                        System.out.println("\n😋 QUICK SNACK!");
                        System.out.println("They are fresh and sweet.");
                        System.out.println("You feel more prepared for the rest of the day.");
                        player.changeFood(15);
                        break;

                    case 2:
                        System.out.println("\n🏠 SMART CHOICE!");
                        System.out.println("You save the berries and bring them back to camp.");
                        System.out.println("The extra food will help everyone later.");
                        System.out.println("You feel proud of your decision.");
                        player.changeFood(20);
                        player.changeHealth(10);
                        break;

                    case 3:
                        System.out.println("\n☠️ GREED HAS CONSEQUENCES!");

                        System.out.println(
                                "Some of the berries are poisonous."
                        );

                        System.out.println(
                                "You feel sick after eating them."
                        );

                        player.changeHealth(-20);

                        System.out.println("\n📊 RESULT");
                        System.out.println("❤️ Health -20");

                        break;
                }

                break;

            case 3:

                System.out.println("\n🐾 Mysterious tracks appear.");

                System.out.println("1. Keep Following");
                System.out.println("2. Return Home");
                System.out.println("3. Investigate Carefully");

                int trackChoice = input.nextInt();

                switch (trackChoice) {

                    case 1:
                        System.out.println("\n🐘 AMAZING DISCOVERY!");

                        System.out.println(
                                "You follow the tracks for hours."
                        );

                        System.out.println(
                                "Suddenly, a giant mammoth herd appears!"
                        );

                        System.out.println(
                                "Your tribe now has a valuable food source."
                        );

                        player.changeFood(40);
                        player.changeScore(15);

                        System.out.println("\n📊 RESULT");
                        System.out.println("🍖 Food   +40");
                        System.out.println("⭐ Score  +15");

                        break;

                    case 2:
                        System.out.println("\n🏠 SAVE CHOICE!");
                        System.out.println("The tracks seem strange.");
                        System.out.println("You decide not to take the risk.");
                        System.out.println("Sometimes survival means knowing when to stop.");
                        break;

                    case 3:
                        System.out.println("\n🐺 UNEXPECTED VISITORS!");
                        System.out.println("Suddenly, a pack of wolves appears nearby.");
                        System.out.println("You escape safely, but not without a few scratches.");
                        player.changeHealth(-10);
                        break;
                }

                break;
        }
    }

    private void day2() {

        System.out.println("\n════════════════════");
        System.out.println("🎨 DAY 2 - THE CAVE");
        System.out.println("════════════════════");

        System.out.println("🪨 You discover a cave.");

        System.out.println("1. Leave a Hand Stencil ✋");
        System.out.println("2. Paint an Animal 🎨");
        System.out.println("3. Draw a Symbol 🔺");
        System.out.println("4. Explore Deeper 🦇");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {

            case 1:

                System.out.println("\n✋ YOU LEFT YOUR MARK!");

                System.out.println(
                        "You press your hand against the cave wall."
                );

                System.out.println(
                        "Thousands of years later, archaeologists discover it."
                );

                player.changeScore(10);

                System.out.println("\n📊 RESULT");
                System.out.println("⭐ Score  +10");

                break;

            case 2:

                createPainting();
                System.out.println(
                        "\n🎨 MASTERPIECE COMPLETE!"
                );

                System.out.println(
                        "Your painting now decorates the cave wall."
                );

                System.out.println(
                        "Future generations may see and learn from it."
                );
                createdPainting = true;

                player.changeScore(30);

                break;

            case 3:

                System.out.println("\n🔺 MYSTERIOUS SYMBOLS!");

                System.out.println(
                        "You draw strange symbols on the cave wall."
                );

                System.out.println(
                        "Even modern scientists still debate their meaning."
                );

                leftSymbols = true;

                player.changeScore(20);

                System.out.println("\n📊 RESULT");
                System.out.println("⭐ Score  +20");


                break;

            case 4:

                System.out.println("\n🪨 Deep inside the cave...");

                System.out.println("1. Study Old Paintings 📚");
                System.out.println("2. Leave Them Untouched 👍");
                System.out.println("3. Touch Them 👀");

                int caveChoice = input.nextInt();

                switch (caveChoice) {

                    case 1:
                        System.out.println("\n📚 You learn from ancient artists.");
                        player.changeScore(15);
                        break;

                    case 2:
                        System.out.println("\n🪨 RESPECT FOR HISTORY!");
                        System.out.println("You decide not to disturb the paintings.");
                        System.out.println("Some mysteries are worth preserving.");
                        break;

                    case 3:
                        System.out.println("\n🦇 SCREEEECH!");
                        System.out.println(
                                "A cave bat suddenly flies toward your face!"
                        );

                        System.out.println(
                                "You escape, but get scratched..."
                        );

                        player.changeHealth(-10);

                        System.out.println("\n📊 RESULT");
                        System.out.println("❤️ Health -10");

                        break;
                }

                break;
        }
    }

    private void createPainting() {

        System.out.println("\n🐾 Choose an animal:");

        System.out.println("1. Bison");
        System.out.println("2. Horse");
        System.out.println("3. Deer");

        int animalChoice = input.nextInt();

        String animal;

        switch (animalChoice) {

            case 1:
                animal = "Bison";
                break;

            case 2:
                animal = "Horse";
                break;

            case 3:
                animal = "Deer";
                break;

            default:
                animal = "Bison";
        }

        System.out.println("\n🟫 Choose a pigment:");

        System.out.println("1. Red Ochre");
        System.out.println("2. Charcoal");
        System.out.println("3. Yellow Ochre");

        int pigmentChoice = input.nextInt();

        String pigment;

        switch (pigmentChoice) {

            case 1:
                pigment = "Red Ochre";
                break;

            case 2:
                pigment = "Charcoal";
                break;

            case 3:
                pigment = "Yellow Ochre";
                break;

            default:
                pigment = "Red Ochre";
        }

        System.out.println("\n✨ Choose a purpose:");

        System.out.println("1. Ritual");
        System.out.println("2. Storytelling");
        System.out.println("3. Communication");

        int purposeChoice = input.nextInt();

        String purpose;

        switch (purposeChoice) {

            case 1:
                purpose = "Ritual";
                break;

            case 2:
                purpose = "Storytelling";
                break;

            case 3:
                purpose = "Communication";
                break;

            default:
                purpose = "Storytelling";
        }

        CavePainting painting =
                new CavePainting(animal, pigment, purpose);

        painting.displayPainting();
    }

    private void day3() {

        System.out.println("\n════════════════════");
        System.out.println("🌟 DAY 3 - LEAVE A LEGACY");
        System.out.println("════════════════════");

        System.out.println(
                "How do you want future humans to remember your tribe?");

        System.out.println("1. Leave Symbols ✋");
        System.out.println("2. Create Cave Art 🎨");
        System.out.println("3. Invent Writing ✍️");
        System.out.println("4. Do Nothing 😴");

        int choice = input.nextInt();

        switch (choice) {

            case 1:

                leftSymbols = true;
                System.out.println(
                        "\n✋ A MARK THAT LASTS FOREVER!"
                );


                System.out.println(
                        "Thousands of years later, humans still use symbols to communicate."
                );
                System.out.println("\nFrom cave symbols... to ancient writing... to modern emojis.");

                System.out.println(
                        "Visual communication continues through history!");

                player.changeScore(20);

                break;

            case 2:

                createdPainting = true;

                System.out.println("\n🎨 A LEGACY IS BORN!");

                System.out.println(
                        "You spend hours creating an impressive cave painting..."
                );

                System.out.println(
                        "The artwork survives for thousands of years."
                );

                createdPainting = true;

                player.changeScore(30);

                System.out.println("\n📊 RESULT");
                System.out.println("⭐ Score  +30");


                break;

            case 3:

                System.out.println("\n❌ ERRORRR!");
                System.out.println(
                        "Writing has not been invented yet.");

                break;

            case 4:

                System.out.println(
                        "\n😴 Nobody remembers your tribe.");

                break;
        }
    }

    private void ending() {

        player.showStats();

        if (!player.isAlive()) {

            System.out.println("\n💀 LOST ENDING");
            System.out.println("You did not survive the Paleolithic Era.");

        }

        else if (createdPainting && leftSymbols) {

            System.out.println("\n👑 LEGENDARY ARTIST ENDING");

            System.out.println(
                    "🏛 Your cave art survived 17,000 years.");

            System.out.println(
                    "📚 Future students study your work.");

            System.out.println(
                    "✨ YOUR LEGACY LIVES ON ✨");
        }

        else if (createdPainting) {

            System.out.println("\n🎨 ARTIST ENDING");

            System.out.println(
                    "🏛 Archaeologists discovered your paintings.");

        }

        else {

            System.out.println("\n🏹 SURVIVOR ENDING");

            System.out.println(
                    "You survived, but left little evidence behind.");
        }
    }

}