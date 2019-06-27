package jp.edodai.i17811lj;

public class ClassInsertSort {
    public static void main(String[] args) {
        Student[] zemi = {
                new Student("青木", 21, 70, 85),
                new Student("笠谷", 21, 58, 75),
                new Student("佐藤", 20, 89, 65),
                new Student("高野", 23, 62, 43),
                new Student("中田", 21, 90, 96),
                new Student("浜名", 21, 72, 93),
                new Student("間宮", 20, 55, 78),
                new Student("矢沢", 21, 62, 85),
                new Student("羅門", 22, 89, 98),
                new Student("輪島", 22, 70, 75)
        };
        show(zemi);
//        englishSort(zemi);
//        totalSort(zemi);
        totalAndInfoSort(zemi);
    }

    static void show(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].showInfo();
        }
        System.out.println();
    }

    /**
     * 英語の点数によるソート
     * @param arr
     */
    static void englishSort(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && temp.english > arr[j].english; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        show(arr);
    }
    /**
     * 合計の点数によるソート
     * @param arr
     */
    static void totalSort(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && temp.total() > arr[j].total(); j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        show(arr);
    }
    /**
     * 合計が同じ場合、
     * 情報の点数によるソート
     * @param arr
     */
    static void totalAndInfoSort(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j=i-1;
            Student temp=arr[i];
            for (;j>=0;j--){
                if (temp.total()>arr[j].total()){
                    arr[j+1]=arr[j];
                }else if(temp.total()==arr[j].total()){
                    if (temp.info>arr[j].info){
                        arr[j+1]=arr[j];
                    }
                }
                else {
                    break;
                }
            }
            arr[j+1]=temp;
        }
        show(arr);
    }
}
