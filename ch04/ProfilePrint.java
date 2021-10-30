public class ProfilePrint {
    byte age = 0;
    String name = "";
    boolean isMarried = false;

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean flag) {
        this.isMarried = flag;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();
        profilePrint.setAge((byte)24);
        profilePrint.setName("hjkim");
        profilePrint.setMarried(false);

        System.out.println("Age : " + profilePrint.getAge());
        System.out.println("Name : " + profilePrint.getName());
        System.out.println("isMarried : " + profilePrint.isMarried());
    }
}