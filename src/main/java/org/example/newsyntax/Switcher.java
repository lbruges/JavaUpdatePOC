package org.example.newsyntax;

public class Switcher {

    public static void getPlayer(String team) {
        switch (team) {
            case "player1","player2","player3" -> System.out.println("team123");
            case "player4" -> System.out.println("team4");
            default -> System.out.println("no team");
        }
    }

    public static String getPlayerStr(String team) {
        return switch (team) {
            case "player1","player2","player3" ->  "team123";
            case "player4" -> "team4";
            default -> "no team";
        };
    }
     //Available since JDK 19
    public static String formatterPatternMatching(Object o) {
        return switch (o) {
            case null -> "null!";
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    //Available since JDK 19
    public static String patternMatching(Object o) {
        return switch (o) {
            case String s when s.length() == 1 -> "1";
            case String s when s.startsWith("l") -> "here";
            case Integer i when i > 0 -> "Positive Integer";
            default -> "None";
        };
    }

}
