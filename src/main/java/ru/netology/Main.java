package ru.netology;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();

        System.out.println("Вам нужно потратить ещё " + service.remain(10) + " чтобы получить кэшбек");
    }
}