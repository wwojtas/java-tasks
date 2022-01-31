package OOP.inheritance.super_examplle;

public class Teacher extends Person {

    private String teachingSubject;

    Teacher() {

    }

    public Teacher(String name, String surname, String teachingSubject) {
        super(name, surname);
        this.setTeachingSubject(teachingSubject);
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        teachingSubject = teachingSubject.toLowerCase();
        switch (teachingSubject) {
            case "math":
            case "english":
            case "sport":
                this.teachingSubject = teachingSubject;
                break;
            default:
                this.teachingSubject = "unknown";
        }

    }
}
