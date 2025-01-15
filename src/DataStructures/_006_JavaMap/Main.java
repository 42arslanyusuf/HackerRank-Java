package DataStructures._006_JavaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> phoneMap = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String key = in.nextLine();
            int value = in.nextInt();
            phoneMap.put(key, value);
            in.nextLine();
        }
        while (in.hasNext()) {
            String queryKey = in.nextLine();
            if (phoneMap.containsKey(queryKey)) {
                System.out.println(queryKey + "=" + phoneMap.get(queryKey));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
