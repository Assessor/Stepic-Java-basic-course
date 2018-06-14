/**
 * Вам дан список ролей и сценарий пьесы в виде массива строчек.
 * Каждая строчка сценария пьесы дана в следующем виде:
 * Роль: текст
 * Текст может содержать любые символы.
 * Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример).
 */
public class PrintTextPerRole {

    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        String s = new PrintTextPerRole().printTextPerRole(roles, textLines);
        System.out.println(s);
    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String item: roles) {
            result.append(item).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                String prefix = item + ": ";
                if (textLines[i] != null && textLines[i].startsWith(prefix)) {
                    result.append(i + 1).append(") ").append(textLines[i].substring(prefix.length())).append("\n");
                }
            }

            result.append("\n");
        }

        return result.toString();
    }
}
