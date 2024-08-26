package Enum;

enum matchStatus {
    NotStarted, OnGoing, Ended;
}

class BGMI {
    public void MatchStatus(matchStatus S) {
        System.out.println(S);
    }
}

public class Enum {
    public static void main(String[] args) {
        BGMI obj = new BGMI();
        matchStatus s = matchStatus.NotStarted;
        obj.MatchStatus(s);
        matchStatus[] ss = matchStatus.values();
        for (matchStatus _ss : ss) {
            System.out.println(_ss + " " + _ss.ordinal());
        }
        if (s == matchStatus.NotStarted) {
            System.out.println(" Join team");
        } else if (s == matchStatus.Ended) {
            System.out.println("Calculating Results");
        } else {
            System.out.println("wait in lobby");
        }
        System.out.println("Switch cases");
        switch (s) {
            case NotStarted:
                System.out.println(" Join team");
                break;
            case OnGoing:
                System.out.println("wait in lobby");
                break;
            case Ended:
                System.out.println("Calculating Results");
                break;

            default:
                break;
        }
    }
}
