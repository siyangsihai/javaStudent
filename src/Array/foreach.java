package Array;


public class foreach {
    public static void main(String[] args) {
        String [] hobbys = {"我在","练习","java"};
        System.out.println("java for 循环输出");
        for (int i = 0; i < hobbys.length; i++){
            System.out.println(hobbys[i]);
        }

        System.out.println("java foreach 循环输出");
        for (String hobby : hobbys){
            System.out.println(hobby);

        }

    }
}
