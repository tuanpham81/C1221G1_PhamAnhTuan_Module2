package ss8_clean_code.bai_tap.refactoring;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String expectedScore = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case 0:
                    expectedScore = "Love-All";
                    break;
                case 1:
                    expectedScore = "Fifteen-All";
                    break;
                case 2:
                    expectedScore = "Thirty-All";
                    break;
                case 3:
                    expectedScore = "Forty-All";
                    break;
                default:
                    expectedScore = "Deuce";
                    break;

            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) expectedScore = "Advantage player1";
            else if (minusResult == -1) expectedScore = "Advantage player2";
            else if (minusResult >= 2) expectedScore = "Win for player1";
            else expectedScore = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    expectedScore += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case 0:
                        expectedScore += "Love";
                        break;
                    case 1:
                        expectedScore += "Fifteen";
                        break;
                    case 2:
                        expectedScore += "Thirty";
                        break;
                    case 3:
                        expectedScore += "Forty";
                        break;
                }
            }
        }
        return expectedScore;
    }
}