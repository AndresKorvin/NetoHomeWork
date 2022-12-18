public class _2_2_GetARuble {
    public static void main(String[] args) {
        int accountBalance = 100_50;        //Начальный баланс. Дабл использовать нельзя, чтоб не потерялись копейки. По этому все вычисления делаем в копейках при помощи int
        int replenishmentAmount = 1500_00;   // Сумма поплнения
        if (replenishmentAmount > 1000_00) {
            accountBalance += (replenishmentAmount + replenishmentAmount / 100);
        } else {
            accountBalance += replenishmentAmount;
        }
        System.out.println("Баланс лицевого счета составляет " + (accountBalance / 1_00) + "." + (accountBalance % 1_00) + "руб.");


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
