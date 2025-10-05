package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // Cach 1:
//    public static boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) return false;
//        char[] s1 = s.toCharArray();
//        char[] s2  = t.toCharArray();
//        quickSort(s1, 0, s.length()-1);
//        quickSort(s2, 0, s.length()-1);
//        for(int i = 0; i < s.length(); i++){
//            if(s1[i] != s2[i]) return false;
//        }
//        return true;
//    }
//
//    public static void quickSort(char[] s, int left, int right){
//        if(left >= right)return;
//
//        int mid = (left+right)/2;
//        int pivot = partition(s, left, right, s[mid]);
//
//        quickSort(s, left, pivot-1);
//        quickSort(s, pivot, right);
//    }
//
//    public static int partition(char[] s, int left, int right, char key){
//        int iL = left;
//        int iR = right;
//        while(iL <= iR){
//            while(s[iL] < key) iL++;
//            while(s[iR] > key) iR--;
//            if(iL <= iR){
//                char tmp = s[iL];
//                s[iL] = s[iR];
//                s[iR] = tmp;
//                iL++; iR--;
//            }
//        }
//        return iL;
//    }

//    // Cach 2:
//    public static boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) return false;
//        Map<Character, Integer> check = new HashMap<>();
//        for(int i = 0; i < s.length(); i++){
//            check.put(s.charAt(i), check.getOrDefault(s.charAt(i),0)+1);
//            check.put(t.charAt(i), check.getOrDefault(t.charAt(i),0)-1);
//        }
//        for(int x: check.values()){
//            if(x != 0) return false;
//        }
//        return true;
//    }

    //Cach 3:
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())return false;
        int[] check = new int[26];
        for(int i = 0; i < s.length(); i++){
            check[s.charAt(i)-'a']++;
            check[t.charAt(i)-'a']--;
        }
        for(int x: check){
            if(x!=0)return false;
        }
        return true;
    }

}
