class Solution {
    public int firstUniqChar(String s) {
        // This int array implementation turned out to be twice as fast as my previous
        // HashSet and LinkedHashMap implementation.
        int[] charCount = new int[26]; // stores char count, stops counting after 2
        int[] charFirstIndex = new int[26]; // stores the first index a char appears

        for (int i = 0; i < s.length(); i++) {
            // a char can be mapped to an array index by subtracting its ASCII value
            // by 97, thus a becomes 0, b becomes 1 and so on.
            char c = s.charAt(i);
            int index = c - 97;
            if (charCount[index] > 1) {
                continue;
            } else if (charCount[index] == 1) {
                charCount[index]++;
            } else {
                charFirstIndex[index] = i;
                charCount[index]++;
            }
        }

        int resultIndex = Integer.MAX_VALUE;
        for (int i = 0; i < charCount.length; i++) {
             if (charCount[i] == 1 && charFirstIndex[i] < resultIndex) {
                 resultIndex = charFirstIndex[i];
             }
        }

        return resultIndex == Integer.MAX_VALUE ? -1 : resultIndex;
    }
}
