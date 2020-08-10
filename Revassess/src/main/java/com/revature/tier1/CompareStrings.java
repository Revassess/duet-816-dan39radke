package com.revature.tier1;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2){
        for(i=0;i < s2.length(); i++) {
            if(s1.charAt[i]==s2.charAt[i]) {
                i++;
                return true;
            }
        }


        return false;
    }
}

