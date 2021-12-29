public class Test01 {
    public static void main(String[] args) {

        CC c = new CC();
        c.isJ(1);
        System.out.println(c.isJ(2));

        c.P(5,7,'*');

    }
}

class  CC {

    public boolean isJ (int a){
        return a % 2 != 0;
    }

    public void P (int a , int b ,char c){

        for (int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < b ; j++){
                System.out.print(c);
            }
            System.out.println();
        }

    }

}