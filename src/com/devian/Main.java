package com.devian;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final String LOG_PATH = "/mnt/c/Users/aminov.md/AppData/Local/DeadByDaylight/Saved/Logs/DeadByDaylight.log";

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new FileReader(LOG_PATH));
        String line;
        while (true) {
            line = br.readLine();
            if (line != null) {
                if (line.contains("LogCustomization: ------")) {
                    System.out.println("---------");
                }
                if (line.contains("LogCustomization: --> ")) {
                    String killer = defineKiller(line);
                    if (killer != null) {
                        System.out.println(killer);
                    }
                }
            } else {
                Thread.sleep(500);   // DELAY could be 100 (ms) for example
            }
        }
    }

    private static String defineKiller(String line) {
        if (line.contains("BE_")) {
            return "Аня";
        }
        if (line.contains("CA_")) {
            return "Бубба";
        }
        if (line.contains("DO_")) {
            return "Доктор";
        }
        if (line.contains("FK_")) {
            return "Свинья";
        }
        if (line.contains("GK_")) {
            return "Клоун";
        }
        if (line.contains("HA_")) {
            return "Хага";
        }
        if (line.contains("HK_")) {
            return "Рин Ямаока";
        }
        if (line.contains("K20_")) {
            return "Пирамидхэд";
        }
        if (line.contains("KK_")) {
            return "Легион";
        }
        if (line.contains("MK_")) {
            return "Чума";
        }
        if (line.contains("MM_")) {
            return "Майерс";
        }
        if (line.contains("OK_")) {
            return "Гоустфейс";
        }
        if (line.contains("QK_")) {
            return "Демогоргон";
        }
        if (line.contains("SD_")) {
            return "Фреди Крюгер";
        }
        if (line.contains("SwedenKiller_")) {
            return "Они";
        }
        if (line.contains("TC_") || line.contains("Hillbilly_")) {
            return "ХиллБилли";
        }
        if (line.contains("TN_") || line.contains("NR_") || line.contains("Nurse_")) {
            return "Медсестра";
        }
        if (line.contains("TR_")) {
            return "Трапер";
        }
        if (line.contains("TW_") || line.contains("Wraith")) {
            return "Колокол";
        }
        if (line.contains("UkraineKiller_")) {
            return "Стрелок";
        }
        return null;
    }
}
