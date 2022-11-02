package Practice.Level0.Java.점의위치구하기;

class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        return x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);
    }
}