public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[5]);
        salesManager.sales = new int[]{1000, 2000, 3000, 1500, 2500};

        System.out.println("Максимальная сумма продажи среди сотрудников: " + salesManager.max());
    }
}
