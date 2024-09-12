public class Str {
    public static void main(String[] args) {
        System.out.println(toZip("aaaabbbcdd"));
    }

    static String toZip(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                res.append(str.charAt(i - 1));
                if (count > 1) {
                    res.append(count);
                }
                count = 1; // сбрасываем счетчик
            }
        }

        // Добавляем последний символ и его количество
        res.append(str.charAt(str.length() - 1));
        if (count > 1) {
            res.append(count);
        }

        return res.toString();
    }
}
