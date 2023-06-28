package assignment;

class Course {
    String code;
    String name;
    int sks;

    public Course(String name, String code, int sks) {
        this.code = code;
        this.name = name;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t%-50s\t%d", code, name, sks);
    }
}
