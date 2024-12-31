package DataStructures._003_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int number = scanner.nextInt();
            list.add(number);
        }

        int q = scanner.nextInt();
        for(int i = 0; i < q; i++){
            String choose = scanner.next();
            if(choose.equals("Insert")){
                int index = scanner.nextInt();
                int element = scanner.nextInt();
                list.add(index, element);
            } else {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

        for(Integer e : list){
            System.out.print(e+" ");
        }
    }
}
