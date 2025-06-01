
public class FindShortestPath {

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        int disx = 0;
        int disy = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                disy += 1;
            } else if (path.charAt(i) == 'W') {
                disx -= 1;
            } else if (path.charAt(i) == 'E') {
                disx += 1;
            } else if (path.charAt(i) == 'S') {
                disy -= 1;
            }
        }
        double value1 =(disx*disx)+(disy*disy);
        double value = Math.sqrt(value1);
        System.out.println(value);

    }
}
