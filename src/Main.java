public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[5]);
        salesManager.sales = new long[]{1000, 2000, 3000, 1500, 2500};

        System.out.println("Максимальная сумма продажи среди сотрудников: " + salesManager.max());
    }
}
