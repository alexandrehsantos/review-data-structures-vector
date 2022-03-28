package br.com.bulvee.vector_samples;

public class TestingForVectorImplemetantion {

    public static void main(String[] args) {
        Stock stock = new Stock("PETR4", 16.2);
        Stock stock1 = new Stock("B3SA3", 11.0);
        Stock stock2 = new Stock("BBAS3", 34);
        Stock stock3 = new Stock("VALE3", 89);
        Stock stock4 = new Stock("IRBR3", 4);
        Stock stock5 = new Stock("SHOW3", 2);

        Vector<Stock> vector = new Vector();
        int add = vector.add(stock);
        int add1 = vector.add(stock1);
        int add2 = vector.add(stock2);
        int add3 = vector.add(stock3);

        System.out.println(vector);
        System.out.println(vector.size());

        System.out.println(vector.contains(stock4));

        System.out.println(vector.get(1));
//        System.out.println(vector.get(3000));

        vector.add(2, stock4);
        vector.add(5, stock5);

        vector.remove(1);
        System.out.println(vector);
    }

}
