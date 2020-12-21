public class TriangleClassifier {
    static  String result;
    public static String triangleClassifier(int a, int b, int c){
        if (isTriangle(a, b, c)){
            result = getTriangleClassifier(a, b, c);
        } else
            result = "Khong Phai La Tam Giac";
        return result;
    }

    private static String getTriangleClassifier(int a, int b, int c) {
        if ( a == b && b == c){
            result = "Tam Giac Deu";
        } else if (a == b | a == c | b == c){
            result = "Tam Giac Can";
        } else {
            result = "Tam Giac Thuong";
        }
        return result;
    }

    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
