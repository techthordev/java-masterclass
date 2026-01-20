package br.com.techthordev.section_07.ClassesPart1.Inheritance.StringFormatting;

public class Main {

    static void main() {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point\n";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age  = 35;
        System.out.println();
    }
}
