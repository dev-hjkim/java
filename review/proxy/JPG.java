public class JPG implements Image {
    private String fileName;

    public JPG(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println(fileName + " is jpg image.");
    }
}