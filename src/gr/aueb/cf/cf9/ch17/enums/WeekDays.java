package gr.aueb.cf.cf9.ch17.enums;

public enum WeekDays {
    SUNDAY("Κυριακή"),
    MONDAY("Δευτέρα"),
    TUESDAY("Τρίτη"),
    WEDNESDAY("Τετάρτη"),
    THURSDAY("Πέμπτη"),
    FRIDAY("Παρασκευή"),
    SATURDAY("Σάββατο");


    private String day;

    WeekDays(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
