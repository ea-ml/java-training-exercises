// Exercise 2
public class ChemicalElement {
    public enum chemicalSeries {
        ALKALI,
        TRANSITION,
        POOR
    }

    private final String symbolicName, name;
    private final int protons;
    private static final boolean[] isPoorMetal = new boolean[119];

    static {
        isPoorMetal[31] = true;
        isPoorMetal[49] = true;
        isPoorMetal[50] = true;
        isPoorMetal[81] = true;
        isPoorMetal[82] = true;
        isPoorMetal[83] = true;
        isPoorMetal[113] = true;
        isPoorMetal[114] = true;
        isPoorMetal[115] = true;
        isPoorMetal[116] = true;
    }

    ChemicalElement(String symbolicName, String name, int protons) {
        this.symbolicName = symbolicName;
        this.name = name;
        this.protons = protons;
    }

    public String getSymbolicName() { return symbolicName; }
    public String getName() { return name; }
    public int getProtons() { return protons; }


    public boolean isAlkaliMetal() {
        return switch (protons) {
            case 3, 11, 19, 37, 55, 87 -> true;
            default -> false;
        };
    }

    public boolean isTransitionMetal() {
        return (protons >= 21 && protons <= 30) ||
               (protons >= 39 && protons <= 48) ||
               (protons >= 72 && protons <= 80) ||
               (protons >= 80 && protons <= 104);
    }

    public boolean isPoorMetal() {
        return protons < isPoorMetal.length && isPoorMetal[protons];
    }

    @Override
    public String toString() {
        return "%c: %s with atomic number %d".formatted(
            symbolicName.toUpperCase().charAt(0),
            name,
            protons
        );
    }
}
