public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте");
        System.out.println("Наш сотовый оператор решил сделать Вам приятный бонус: "
                + "При пополнении счета более, чем на 1000 рублей, " +
                "то компания дарит Вам по 1 рублю за каждые полные 100 рублей пополнения.");
        int startMoney = 100;
        int topMoney = 300;
        int bonus;
        if (topMoney > 1000) {
            bonus = topMoney / 100;
        } else {
            bonus = 0;
        }
        int FinalAmount2 = startMoney + topMoney + bonus;
        System.out.println("Итоговый счёт при пополнении на 1100руб.: " + FinalAmount2 + " руб.");
        System.out.println("Количество бонусных рублей при пополнении на 1100руб.: " + bonus + " руб.");
    }
}