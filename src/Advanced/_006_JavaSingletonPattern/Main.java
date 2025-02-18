package Advanced._006_JavaSingletonPattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class Main{
    public static void main(String[] args) {

    }
}


class Singleton{
    static Singleton instance = new Singleton();
    private Singleton(){

    }
    public String str;

    static Singleton getSingleInstance(){
        return instance;
    }
}