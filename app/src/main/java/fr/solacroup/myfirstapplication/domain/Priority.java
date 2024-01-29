package fr.solacroup.myfirstapplication.domain;

public enum Priority {

    LOW(0,"faible"),

    HIGH(100,"haut");
    private final int level;

    private final String name;

    Priority(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
