
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Song деген класс тузолу(свойства:
         * File тузуп, ырдын атын, авторун
         * Fileды ачып, маалыматтарды song
         * song деген объекттин
         * title, author, text).
         * жана текстин жазалы.
         * деген объектке берели.
         * маалыматтарын консольго
         * чыгаралы.
         */
        Song song = new Song("\nВалерий Меладзе","\nСалют вера"," \\\\\"\nКогда закончатся полеты первых ласточек\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"И ты усталая придешь к себе домой\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Увидишь из окна слова из ярких лампочек\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Я напишу тебе: \\\\\\\\\\\\\"\\\\\\\\\\\\\"Не бойся, я с тобой\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Мы можем быть только на расстоянии и в невесомости\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Хочешь упасть – я неволить не стану, хочешь лететь – лети\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Но я тысячу раз обрывал провода\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Сам себе кричал: \\\\\\\\\\\\\"\\\\\\\\\\\\\"Ухожу навсегда\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Непонятно, как доживал до утра Салют, Вера!\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Но я буду с тобой или буду один\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Дальше не сбежать, ближе не подойти\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Прежде чем навек поменять номера Салют, Вера!\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Ты не сбываешься, хоть снишься в ночь на пятницу\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Не отзываешься ни на один пароль\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Не ошибаешься, и мне все чаще кажется\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Что ты посланница неведомых миров\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Мы можем быть только на расстоянии и в невесомости\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Хочешь упасть – я неволить не стану, хочешь лететь – лети\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Но я тысячу раз обрывал провода\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Сам себе кричал: \\\\\\\\\\\\\"\\\\\\\\\\\\\"Ухожу навсегда\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Непонятно, как доживал до утра Салют, Вера!\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Но я буду с тобой или буду один\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Дальше не сбежать, ближе не подойти\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Прежде чем навек поменять номера Салют, Вера!\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Но я тысячу раз обрывал провода\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Сам себе кричал: \\\\\\\\\\\\\"\\\\\\\\\\\\\"Ухожу навсегда\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Непонятно, как доживал до утра Салют, Вера!\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Но я буду с тобой или буду один\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Дальше не сбежать, ближе не подойти\\\\\\\\n\\\\\" +\\\\n\" +\n" +
                "                                \"                \\\\\"Прежде чем навек поменять номера Салют, Вера!\\\\\";\" + text);\"\"\"");

        try{
            FileWriter fileWriter = new FileWriter("Салют вера");
            fileWriter.write(song.getTitle());
            fileWriter.write(song.getAuthor());
            fileWriter.write(song.getText());
            fileWriter.close();
        }catch(IOException e){
            System.out.println(e.getMessage());

        }try{
              FileReader fileReader = new FileReader("Салют вера");
              Scanner scanner = new Scanner(fileReader);
              while(scanner.hasNextLine()){
                  System.out.println(scanner.nextLine());
              }
          }catch(IOException e){
              System.out.println(e.getMessage());
          }

        }
    }


