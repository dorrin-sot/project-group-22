package enums;

public enum Technology {
    AGRICULTURE(20, null, "POTTERY,ANIMALHUSBANDRY,ARCHERY,MINING"),
    ANIMALHUSBANDRY(35, "AGRICULTURE", "TRAPPING,THEWHEEL"),
    ARCHERY(35, "AGRICULTURE", "MATHEMATICS"),
    BRONZEWORKING(55, "MINING", "IRONWORKING"),
    CALENDAR(70, "POTTERY", "THEOLOGY"),
    MASONRY(55, "MINING", "CONSTRUCTIONS"),
    MINING(35, "AGRICULTURE", "MASONRY,BRONZEWORKING"),
    POTTERY(35, "AGRICULTURE", "CALENDAR,WRITING"),
    THEWHEEL(55, "ANIMALHUSBANDRY", "HORSEBACKRIDING,MATHEMATICS"),
    TRAPPING(55, "ANIMALHUSBANDRY", "CIVILSERVICE"),
    WRITING(55, "POTTERY", "PHILOSOPHY"),
    CONSTRUCTION(100, "MASONRY", "ENGINEERING"),
    HORSEBACKRIDING(100, "THEWHEEL", "CHIVALRY"),
    IRONWORKING(150, "BRONZEWORKING", "METALCASTING"),
    MATHEMATICS(100, "THEWHEEL,ARCHERY", "CURRENCY,ENGINEERING"),
    PHILOSOPHY(100, "WRITING", "THEOLOGY,CIVILSERVICE"),
    CHIVALRY(440, "CIVILSERVICE,HORSEBACKRIDING,CURRENCY", "BANKING"),
    CIVILSERVICE(400, "PHILOSOPHY,TRAPPING", "CHIVALRY"),
    CURRENCY(250, "MATHEMATICS", "CHIVALRY"),
    EDUCATION(440, "THEOLOGY", "ACOUSTICS,BANKING"),
    ENGINEERING(250, "MATHEMATICS,CONSTRUCTION", "MACHINERY,PHYSICS"),
    MACHINERY(440, "ENGINEERING", "PRINTINGPRESS"),
    METALCASTING(240, "IRONWORKING", "PHYSICS,STEEL"),
    PHYSICS(440, "ENGINEERING,METALCASTING", "PRINTINGPRESS,GUNPOWDER"),
    STEEL(440, "METALCASTING", "GUNPOWDER"),
    THEOLOGY(250, "CALENDAR,PHILOSOPHY", "EDUCATION"),
    ACOUSTICS(650, "EDUCATION", "SCIENTIFICTHEORY"),
    ARCHAEOLOGY(1300, "ACOUSTICS", "BIOLOGY"),
    BANKING(650, "EDUCATION,CHIVALRY", "ECONOMICS"),
    CHEMISTRY(900, "GUNPOWDER", "MILITARYSCIENCE,FERTILIZER"),
    ECONOMICS(900, "BANKING,PRINTINGPRESS", "MILITARYSCIENCE"),
    FERTILIZER(1300, "CHEMISTRY", "DYNAMITE"),
    GUNPOWDER(680, "PHYSICS,STEEL", "CHEMISTRY,METALLURGY"),
    METALLURGY(900, "GUNPOWDER", "RIFLING"),
    MILITARYSCIENCE(1300, "ECONOMICS,CHEMISTRY", "STEAMPOWER"),
    PRINTINGPRESS(650, "MACHINERY,PHYSICS", "ECONOMICS"),
    RIFLING(1425, "METALLURGY", "DYNAMITE"),
    SCIENTIFICTHEORY(1300, "ACOUSTICS", "BIOLOGY,STEAMPOWER"),
    BIOLOGY(1680, "ARCHAEOLOGY,SCIENTIFICTHEORY", "ELECTRICITY"),
    COMBUSTION(2200, "REPLACEABLEPARTS,RAILROAD,DYNAMITE", null),
    DYNAMITE(1900, "FERTILIZER,RIFLING", "COMBUSTION"),
    ELECTRICITY(1900, "BIOLOGY,STEAMPOWER", "TELEGRAPH,RADIO"),
    RADIO(2200, "ELECTRICITY", null),
    RAILROAD(1900, "STEAMPOWER", "COMBUSTION"),
    REPLACEABLEPARTS(1900, "STEAMPOWER", "COMBUSTION"),
    STEAMPOWER(1680, "SCIENTIFICTHEORY,MILITARYSCIENCE", "ELECTRICITY,REPLACEABLEPARTS,RAILROAD"),
    TELEGRAPH(2200, "ELECTRICITY", null);

    private final int cost;
    private final String prerequisiteTechs;
    private final String leadsToTechs;

    Technology(int cost, String prerequisiteTechs, String leadsToTechs) {
        this.cost = cost;
        this.prerequisiteTechs = prerequisiteTechs;
        this.leadsToTechs = leadsToTechs;
    }

    public static Technology matchTechnology(String tech) {
        for (Technology temp : values()) {
            if (temp.name().equalsIgnoreCase(tech)) {
                return temp;
            }
        }
        return null;
    }

    public int getCost() {
        return cost;
    }

    public String getPrerequisiteTechs() {
        return prerequisiteTechs;
    }

    public String getLeadsToTechs() {
        return leadsToTechs;
    }
}
