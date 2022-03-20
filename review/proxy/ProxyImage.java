public class ProxyImage implements Image {
    private String fileName;
    private Image image;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (fileName.contains("jpg")) {
            image = new JPG(fileName);
        }
        image.display();
    }
}