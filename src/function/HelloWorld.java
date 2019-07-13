package function;

import Array.Array;

import java.util.Arrays;

public class HelloWorld {
    public void print(){
        System.out.println("Hello World");
    }

    public int calcSum(){
        int a = 5;
        int b = 120211;
        int sum = a +b;
        return sum;
    }

    public double calcAvg(){
        double java = 92.5;
        double php = 83.1;
        double avg = (java+php)/2;
        return avg;
    }

    public String getName(){
        String name = "张三";
        return name;
    }

    public double averageScore(double SubjectOne,double SubjectTwo){
        return (SubjectOne+SubjectTwo)/2;
    }

    public int sortScore(int scores[]){
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        return scores.length;
    }

    //function重载
    public void show(){
        System.out.println("hello world");
    }

    public void show(String name){
        System.out.println("hello " + name);
    }

    //创建指定长度的 int 型数组，并生成 100 以内随机数为数组中的每个元素赋值，然后输出数组
    public int[] createArray(int count){
        int[] nums = new int[count];
        for (int i = 0;i < count;i++){
            nums[i] = (int)(Math.random() * 100);
        }
        return nums;
    }

    //找出考试成绩前3 并且剔除作废的成绩
    public void getBestStudent(int[] scores){
        Arrays.sort(scores);
        int j = 0;
        for ( int i = scores.length - 1; i >= 0; i-- ){
            if (j > 2) break;
            if (scores[i] < 0 || scores[i] > 100) continue;
            j++;
            System.out.println(scores[i]);
        }
    }

    public static void main(String[] args) {
        HelloWorld test = new HelloWorld();
        //test.print();

        /*int sum = test.calcSum();
        System.out.println(sum);*/

        /*double avg = test.calcAvg();
        System.out.println("平均成绩为：" + avg);*/

        /*String name = test.getName();
        System.out.println(name);*/

        /*double averageScore = test.averageScore(94, 81);
        System.out.println(averageScore);*/

        /*int[] scores={79,52,98,81};
        //String[] sortScore = test.sortScore(scores);
        //System.out.println(sortScore);
        int count= test.sortScore(scores);
        System.out.println("共有"+count+"个成绩信息！");*/

        /*test.show();
        test.show("张三");*/

        /*int[] nums = test.createArray(8);
        System.out.println(Arrays.toString(nums));*/

        int[] scores={89 , -23 , 64 , 91 , 119 , 52 , 73 , 0 , 9};
        System.out.println("考试成绩前3名为：");
        test.getBestStudent(scores);
    }
}
