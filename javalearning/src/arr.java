import java.util.Arrays;

public class arr {
    //输出一维数组（foreach方法）
    public static void Print_1(int arr[]){
        for (int e:arr){
            System.out.print(e+",");
        }
        System.out.println(".");
    }
    //输出二维数组
    public static void Print_2(int arr[][]){
        for (int[] x :arr){
            for (int e:x) {
                System.out.print(e + ",");
            }
        }
        System.out.println(".");
    }
    //数组创建及初始化
    public static void Array_creation_initialization(){
        //一维数组
        int[] arr_1;//初始化填充0
        arr_1 = new int[5];
        int arr_2[]=new int[]{1,2,3};
        arr_1= new int[]{1, 2, 3};
        //二维数组
        int a[][]=new int[2][];//要定义一维长度
        a[0]=new int[]{1,2};
        a[1]=new int[]{3,4,5};
    }
    //forreach语句遍历二维数组
    public static void Through_array_forreach(){
        int arr2[][]={{4,3},{1,2,3}};
        for (int x[]:arr2){
            for(int e:x){
                if(e==x.length){
                    System.out.print(e);
                }else{System.out.print(e+"、");
                }
            }
        }
    }
    //填充替换数组元素
    public static void Fill_replace_elements(){
        int arr_2[]=new int[8];
        Arrays.fill(arr_2,5);//用5填充所有元素
        Arrays.fill(arr_2,2,3,7);//用7替换索引为2的元素
    }
    //数组排序
    public static void sorting(){
        int arr[]={12,34,11,8};//一维
        Arrays.sort(arr);
        int arr2[][]={{41,3},{1,22,3}};//二维
        Arrays.sort(arr2[0]);
        Arrays.sort(arr2[1]);
    }
    //复制数组
    public static void Copy(){
        int arr[]={12,34,11,8};//一维
        int arr_1[]=Arrays.copyOf(arr,5);
        int arr_2[]=Arrays.copyOfRange(arr,1,3);
        Print_1(arr_1);
        Print_1(arr_2);
        int arr2[][]={{41,3},{1,22,3}};//二维
        int ar2_1[][] =Arrays.copyOf(arr2,2);
        int[][] arr2_2 =Arrays.copyOfRange(arr2,1,2);
        Print_2(ar2_1);
        Print_2(arr2_2);
    }
    //数组查询
    public static void Search(){
        int[] arr={4,25,10};//一维
        int index=Arrays.binarySearch(arr,25);//直接查找元素，返回索引值
        System.out.println(index);
        index=Arrays.binarySearch(arr,0,2,6);//在指定范围内查找元素，返回索引，若查找不到，则返回负的插入点
        System.out.println(index);
    }
    //数组排序
    public static void Sort(){
        int[] arr={63,4,24,1,3,15};
        Bubble_sort(arr);//冒泡排序
        Direct_selection_sort(arr);//直接选择排序
        Reverse_order(arr);//反转排序
    }
    //冒泡排序
    public static void Bubble_sort(int[] arr){
        for(int i=1;i< arr.length;i++){
            for(int j=0;j< arr.length-i;j++){
                if(arr[j]> arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        Print_1(arr);
    }
    //直接选择排序，交换次数要少很多，速度会快些
    public static void Direct_selection_sort(int[] arr){
        int index;
        for(int i=1;i< arr.length;i++) {
            index = 0;
            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            int t = arr[arr.length - i];
            arr[arr.length - i] = arr[index];
            arr[index] = t;
        }
        Print_1(arr);
    }
    //反转排序（将数组翻转输出）
    public static void Reverse_order(int[] arr){
        int len=arr.length;
        for(int i=0;i<len/2;i++){
            int t=arr[i];
            arr[i]=arr[len-1-i];
            arr[len-1-i]=t;
        }
        Print_1(arr);
    }
    public static void main(String[] args){
        Array_creation_initialization();//数组创建及初始化
        Through_array_forreach();//数组遍历forreach语句
        sorting();//数组排序，从小到大掉包排序
        Copy();//复制数组
        Search();//数组查询
        Sort();//数组排序，冒泡法，直接排序法，反转排序
    }
}
