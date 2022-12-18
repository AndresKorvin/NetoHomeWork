public class _2_2_GetARuble {
    public static void main(String[] args) {
        int accountBalance = 100_50;        //Дабл использовать нельзя, чтоб не потерялись копейки
        int replenishmentAmount = 500_00;   //По этому все вычисления делаем в копейках при помощи int
        //accountBalance = replenishmentAmount > 1000_00 ? accountBalance + replenishmentAmount + replenishmentAmount / 100 : accountBalance + replenishmentAmount;
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