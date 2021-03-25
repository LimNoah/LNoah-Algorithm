package B4673;

public class Main {
    static int d(int n){
        String input = Integer.toString(n);
        int sum = n;
        for(int i = 0; i < input.length(); i++){
            sum += Character.getNumericValue(input.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for(int i = 0; i <= 10000; i++){
            if(d(i) < 10001){
                arr[d(i)] = true;
            }
        }

        for(int i = 0; i < 10000; i++){
            if(arr[i] == false){
                System.out.println(i);
            }
        }
    }
}