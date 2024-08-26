public class TrivalArrayOperations {
    public static void main(String[] args) {
    int[] num = {1,2,3};
    print(num);
    int[] minundmax = {1, 10, 25, -13, 1000};
    minUndMax(minundmax);
    invert(num);
    cut(num,5);
    int[][] ru = {
            {1,3},
            {25},
            {7,4,6,9}
        };
    linearize(ru);
    }
    public static void print(int[] arr){
        System.out.print("{");
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(arr[i] != arr[arr.length - 1]){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
    public static void minUndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);

    }
    public static int[] invert(int[] arr){
        //0 , 1, 2 ,3 ,4 ,5
        System.out.print("{");
        for (int i = arr.length - 1;0 <= i; i--){
            System.out.print(arr[i] + " ");
            if (arr[i] != arr[0]){
                System.out.print(",");
            }
        }
        System.out.println("}");
        return arr;
    }
    public static int [] cut(int[] arr ,int len){
        int[] result;
        if (arr.length >= len){
            result = new int[len];
            System.out.print("{");
            for (int i = 0; i < len; i++ ){
                System.out.print(result[i] + " ");
                if (arr[i] != arr[len - 1]){
                    System.out.print(",");
                }
            }
            System.out.println("}");
        }else{
            result = new int[len];
            System.out.print("{");
            for(int i = 0; i < arr.length ; i++){
                result[i] = arr[i];
                System.out.print(result[i]);
                if(i < arr.length){
                    System.out.print(" ,");
                }
            }
            for(int j = arr.length; j < len;j++){
                result[j] = 0;
                System.out.print(result[j] + " ");
            if(j < len -1){
                System.out.print(" ,");
            }
            }
            System.out.println("}");
        }
        return result;
    }
    public static int[] linearize(int[][] arr) {
        int totalElements = 0;
        for (int i = 0; i < arr.length; i++) {
            totalElements += arr[i].length;
        }

        int[] result = new int[totalElements];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[index++] = arr[i][j];
            }
        }
        System.out.print("{");
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
            if(result[i] != result[result.length - 1]){
                System.out.print(", ");
            }
        }
        System.out.print("}");

        return result;
    }
}
