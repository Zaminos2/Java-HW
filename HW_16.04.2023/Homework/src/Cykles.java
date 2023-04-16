public class Cykles {

    /**
     * Каждый из этих циклов имеет свои преимущества и может быть использован в зависимости от конкретной задачи. Например, если необходимо выполнить определенное количество итераций, то удобнее использовать цикл for. Если же количество итераций заранее неизвестно, то можно использовать цикл while или do-while.(суть цыкла do while и том что он отработает хотябы раз даже если условие невыполнимо)
     */
    public static void forCykle(){
        for (int i = 1; i >= 10; i ++){
            System.out.println(i);
        }
    }
    public static void whileCykle(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i ++;
        }
    }
    public static void doWhileCykle(){
        int i = 1;
        do {
            System.out.println(i);
            i ++;

        }while (i <= 10);
    }
}
