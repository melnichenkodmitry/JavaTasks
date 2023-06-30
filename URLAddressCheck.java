public class URLAddressCheck {
    public static void main(String[] args) {
        String[] urls = {"https://ya.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("� URL-������ - " + url + ", ������� �������� - " + protocol + ", ����� - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("http://")) {
            return "http";
        } else if (url.startsWith("https://")) {
            return "https";
        } else {
            return "�����������";
        }

    }

    public static String checkDomain(String url) {
        if (url.endsWith("com")) {
            return "com";
        } else if (url.endsWith("net")) {
            return "net";
        } else if (url.endsWith("org")) {
            return "org";
        } else if (url.endsWith("ru")) {
            return "ru";
        } else {
            return "�����������";
        }

    }
}
