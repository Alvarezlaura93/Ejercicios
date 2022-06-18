
import java.util.Arrays;


public class removerUnNumero {

    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "4", "5", "5"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
              if (j!=i) {
                  if (array[i] == (array[j])) {
                      array[i] = "";

                  }
              }
            }

        }
        Arrays.sort(array);
        for (String newarray : array
        ) {
            System.out.println(newarray);
        }
    }
}
