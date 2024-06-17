import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        int[] arr = new int[]{6, 53, 54, 84, 191, 52, 1642, 68, 907, 4231};
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        System.out.println("Максимальное значение:" + max + ',' + "Минимальное значение:" + min);

        //2
        System.out.print("Четные значения: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("Нечетные значения: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        //3.
        int longest = arr[0];
        int shortest = arr[0];
        for (int i : arr) {
            longest = Math.max(i, longest);
            shortest = Math.min(i, shortest);
        }
        System.out.println("Самое длинное число: " + longest + ';' + "Самое короткое число:" + shortest);

        //4. Надо доработать.
        int[] arr2=new int[]{1,2,7,10,11,14,24,56,57,58};
        for(int i=1;i<arr2.length;i++) {
            if(arr2[i]==arr2[i-1]+1) {
                System.out.print(arr2[i-1]+","+arr2[i]+";");
            }
        }
        System.out.println();

        //5.
        int[] arr3=new int[]{101,263,343,453,555,643,727,802,969};
        System.out.print("Числа палиндромы:");
        for(int i=0;i<arr3.length;i++) {
            int num=arr3[i];
            int sum=0;
            int a=num;
            while(a>0) {
                int last=a%10;
                sum=(sum*10)+last;
                a=a/10;
            }
            if(sum==num)
                System.out.print(num+",");
        }
    }
}