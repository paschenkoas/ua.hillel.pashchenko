package ua.hillel.pashchenko;

public class CountSymbol {
    public static void main(String[] args) {
        int count1 = 0; //count *;
        int count2 = 0; //count spaces;
        String initials = "******         *" + "\n" +
                "*******      ** **" + "\n" +
                "**    **    **   **" + "\n" +
                "**    **   **     **" + "\n" +
                "*******    *********" + "\n" +
                "******     **********" + "\n" +
                "**        **        **" + "\n" +
                "**       **          **";
        char[] strToArray = initials.toCharArray(); // Преобразуем строку initials в массив символов (char);
        for (int i = 0; i < initials.length(); i++) {
            if (strToArray[i] == '*') count1++;
            if (strToArray[i] == ' ') count2++;
        }
        System.out.println(initials); //print initials;
        System.out.println(initials.length()+" - всего количество символов");
        System.out.println(count1+" количество *");
        System.out.println(count2+" количество пробелов");
    }
}