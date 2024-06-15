package pack2;

public class H {
    public static void main(String[] args) {

        int i = 10;
        int j = ++i +i;
        //      11  +11
        System.out.println(j);
        System.out.println(i);
    }
}
/*
pre increment/decrement
will do task but order is different
1. increase/decrease the value by 1
2. used the unchanged value
 */