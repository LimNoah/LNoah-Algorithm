package ct713;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

//        int[][] arr0 = {{1,1,2,4,3},{3,2,1,2,3},{4,1,1,4,3},{2,2,1,3,3}};
//        int[][] arr1 = {{3,1,2,2,4},{3,1,2,2,4},{4,2,1,2,3,}, {1,1,1,2,3}};
        int[][] arr2 = {{3,1,1,1,2},{1,1,2,2,2},{4,2,1,2,2},{2,1,1,2,1}};

//        int[] result0 = solution.solution(4, 3, arr0);
//        int[] result1 = solution.solution(2, 4, arr1);
        int[] result2 = solution.solution(2, 2, arr2);

        for(int i = 0; i < result2.length; i++){
            System.out.println(result2[i]);
        }
    }
}
