/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Maximum Depth of Binary Tree");
        System.out.println("");

        Solution solution = new Solution();

        BuildTree1 tree1 = new BuildTree1();
        TreeNode root1 = tree1.getTree();

        BuildTree1 tree2 = new BuildTree1();
        TreeNode root2 = tree2.getTree();

        boolean return_value = solution.isSubtree(root1, root2);
        
        System.out.println("Output is sub tree = " + return_value); // how to print tree

    }

}
