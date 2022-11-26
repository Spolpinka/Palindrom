public class Main {
    public static void main(String[] args) {
        String test = "строка для проверки";
        String testRight = "Ешь немытого ты меньше";//палиндром
        System.out.println("проверка первого задания!");
        System.out.println(checkPalindrom(test));
        System.out.println(checkPalindrom(testRight));
        System.out.println("проверка второго задания!");
        System.out.println(removeSpace(test));
        System.out.println(removeSpace(testRight));
    }

    private static boolean checkPalindrom (String s) {
        //приводим к нижнему регистру и убираем пробелы для корректности проверки
        s = s.toLowerCase();
        s = s.replace(" ", "");
        StringBuilder reverse = new StringBuilder();
        //переворачиваем строку
        for (char c :
                s.toCharArray()) {
            reverse.insert(0, c);
        }
        //возвращаем результат проверки
        return s.equals(reverse.toString());
    }

    private static String removeSpace(String s) {
        StringBuilder result = new StringBuilder();
        //пока есть пробелы, берем часть строки до пробела, складываем в result и убираем из исходной строки
        // часть до пробела включительно
        while (s.contains(" ")) {
            result.append(s, 0, s.indexOf(" "));
            s = s.substring(s.indexOf(" ") + 1);
        }
        result.append(s);
        return result.toString();
    }
}