package ru.netology.services;
 class CalcMonthRestService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // Счётчик месяцев отдыха
        int money = 0;  // Количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // Отдыхаем

                count++;  // увеличиваем счётчик месяцев отдыха
                money = (money - expenses);
                money = money / 3;

            } else {
                // Работаем
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }

}
