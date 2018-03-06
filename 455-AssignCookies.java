class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gIndex = 0;
        int sIndex = 0;
        int satisfiedKids = 0;

        while(gIndex < g.length && sIndex < s.length){
            if (s[sIndex] >= g[gIndex]){
                satisfiedKids++;
                gIndex++;
            }
            sIndex++;
        }
        return satisfiedKids;
    }
}
