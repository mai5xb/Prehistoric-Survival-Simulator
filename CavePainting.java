public class CavePainting {

    private String animal;
    private String pigment;
    private String purpose;

    // Constructor
    public CavePainting(String animal, String pigment, String purpose) {

        this.animal = animal;
        this.pigment = pigment;
        this.purpose = purpose;
    }

    // Getters

    public String getAnimal() {
        return animal;
    }

    public String getPigment() {
        return pigment;
    }

    public String getPurpose() {
        return purpose;
    }

    // Display Painting

    public void displayPainting() {

        System.out.println("\n═══════════════════════════════");
        System.out.println("🎨 YOUR CAVE PAINTING");
        System.out.println("═══════════════════════════════");

        System.out.println("🐾 Animal  : " + animal);

        System.out.println("🟫 Pigment : " + pigment);

        System.out.println("✨ Purpose : " + purpose);

        System.out.println("═══════════════════════════════");

        // Interpretation

        if (purpose.equalsIgnoreCase("Ritual")) {

            System.out.println(
                    "🔮 This painting may have been used in ceremonies or spiritual practices."
            );
        }

        else if (purpose.equalsIgnoreCase("Storytelling")) {

            System.out.println(
                    "📖 This painting may have helped share stories and knowledge."
            );
        }

        else if (purpose.equalsIgnoreCase("Communication")) {

            System.out.println(
                    "💬 This painting may have been used to communicate ideas through images."
            );
        }

        System.out.println();

        System.out.println(
                "⏳ 17,000 years later..."
        );

        System.out.println(
                "🏛 Archaeologists discover your painting!"
        );

        System.out.println(
                "✨ Your art has survived through history."
        );

        System.out.println("═══════════════════════════════");
    }
}