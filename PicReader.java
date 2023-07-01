public class PicReader {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.BMP);
        System.out.println(reader);
    }
}
