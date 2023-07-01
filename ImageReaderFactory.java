public class ImageReaderFactory implements ImageReader {
    public static ImageReader getImageReader(ImageTypes pic) {

        if (ImageTypes.BMP.equals(pic)) {
            return new BmpReader();
        } else if (ImageTypes.JPG.equals(pic)) {
            return new JpgReader();
        } else if (ImageTypes.PNG.equals(pic)) {
            return new PngReader();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
