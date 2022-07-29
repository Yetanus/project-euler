package pe4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int result = i * j;
                String temp = String.valueOf(result);
                if (result < 100000) {
                    for (int k = 0; k < temp.length(); k++) {
                        if (temp.charAt(0) == temp.charAt(temp.length()-1)) {
                            if(temp.charAt(1)==temp.charAt(3)){
                                palindromes.add(temp);
                            }
                        }
                    }
                }
                else{
                    for (int k = 0; k < temp.length(); k++) {
                        if (temp.charAt(0) == temp.charAt(temp.length() - 1)) {
                            if(temp.charAt(1)==temp.charAt(4)){
                                if(temp.charAt(2)==temp.charAt(3)){
                                    palindromes.add(temp);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Largest is: "+ Collections.max(palindromes));
    }
}
