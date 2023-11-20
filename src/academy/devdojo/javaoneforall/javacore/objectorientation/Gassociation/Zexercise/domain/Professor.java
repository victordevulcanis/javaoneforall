package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain;

public class Professor {

    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public void print() {
        System.out.println("--- Professor ---");
        System.out.println("Name " + this.name);
        System.out.println("Research Field: " + this.researchField);
        if (seminars != null) {
            System.out.print("Seminars: ");
            for (Seminar seminar : seminars) {
                System.out.print("[" + seminar.getTitle() + "]");
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public String getResearchField() {
        return this.researchField;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

}
