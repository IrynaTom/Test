package com.test.stepic;

public class PrintTextPerRole {
    public static void main(String[] args) {
        System.out.println(printTextPerRole(
                new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"},
                new String[]{
                        "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                        "Аммос Федорович: Как ревизор?",
                        "Артемий Филиппович: Как ревизор?",
                        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                        "Аммос Федорович: Вот те на!",
                        "Артемий Филиппович: Вот не было заботы, так подай!",
                        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                }));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        int a =0;
        Integer ia = new Integer(a =1);
        System.out.println(ia);
        StringBuilder res = new StringBuilder();
        for (String role : roles) {
            res.append(role).append(":").append("\n");
            int offset = role.length() + 2;
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role+ ":")) {
                    res.append(i + 1).append(") ").append(textLines[i].substring(offset)).append("\n");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }
}
