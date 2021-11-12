public class Student {
    String name;
    String address;
    String phone;
    String email;

    public Student() {}
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (this.getClass() != object.getClass()) return false;
        Student other = (Student) object;

        if (this.name == null) {
            if(other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        if (this.address == null) {
            if (other.address != null) return false;
        } else if (!address.equals(other.address)) return false;

        if (this.phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;

        if (this.email == null) {
            if (other.email != null) return false;
        } else if(!email.equals(other.email)) return false;

        return true;
    }

}