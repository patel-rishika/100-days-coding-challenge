import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int children = 0;
        int cookie = 0;
        while (cookie < s.length && children < g.length){
            if(s[cookie] >= g[children]) {
                children++;
            }
            cookie++;
        }
        return children;
    }
}

