import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArr = reader.readLine().split(" ");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        int longest = 0;
        int counter = 0;
        int repeatedNumber = 0;
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                counter++;
                if (longest < counter) {
                    longest = counter;
                    repeatedNumber = arr[i];

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == repeatedNumber){
                index = i;
                break;
            }
        }
        System.out.println(repeatedNumber + " " + longest + " " + index);
    }
}
