package Array;

public class maxAge {

    public int getMaxage(){
        int ages[] = {18 ,23 ,21 ,19 ,25 ,29 ,17};
        int age = 0;
        for (int i=0;i<ages.length;i++){
            if (age < ages[i]){
                age = ages[i];
            }
        }
        return age;
    }

    public static void main(String[] args) {
        maxAge age  =new maxAge();
        int maxScore = age.getMaxage();
        System.out.println("最大的年龄为" + maxScore);
    }
}
