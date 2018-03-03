import java.util.Scanner;

public class CircleAndCross {

    public void createBoardAndPlay() {
        String[][] boardGame = new String[3][3];
        for (int i = 0; i < boardGame.length; i++) {
            for (int j = 0; j < boardGame.length; j++) {
                boardGame[i][j] = "-";
            }
        }

        while (true) {
            System.out.println("Tura gracza 1:\nwybierz pozycję (1-9) dla x:");
            asignChoice(boardGame, "x");
            displayBoard(boardGame);

            if (checkDraw(boardGame)) break;
            if (checkWinner(boardGame)) {
                System.out.print("Player 1 !!!");
                break;
            }
            System.out.println("********************************");
            System.out.println("Tura gracza 2:\nwybierz pozycję (1-9) dla o:");
            asignChoice(boardGame, "o");
            displayBoard(boardGame);
            if (checkDraw(boardGame)) break;
            if (checkWinner(boardGame)) {
                System.out.print("Player 2 !!!");
                break;
            }
            System.out.println("********************************");

        }
    }


    private boolean checkDraw(String[][] boardGame) {
        if (!boardGame[0][0].equals("-") && !boardGame[1][0].equals("-") && !boardGame[2][0].equals("-") &&
                !boardGame[0][1].equals("-") && !boardGame[1][1].equals("-") && !boardGame[2][1].equals("-") &&
                !boardGame[0][2].equals("-") && !boardGame[1][2].equals("-") && !boardGame[2][2].equals("-")) {
            System.out.println("KONIEC GRY!!! \nREMIS!");
            return true;
        }
        return false;
    }

    private boolean checkWinner(String[][] boardGame) {
        if ((boardGame[0][0].equals(boardGame[1][0]) && boardGame[1][0].equals(boardGame[2][0]) && !boardGame[2][0].equals("-")) ||
                (boardGame[0][1].equals(boardGame[1][1]) && boardGame[1][1].equals(boardGame[2][1]) && !boardGame[2][1].equals("-")) ||
                (boardGame[0][2].equals(boardGame[1][2]) && boardGame[1][2].equals(boardGame[2][2]) && !boardGame[2][2].equals("-")) ||
                (boardGame[0][0].equals(boardGame[0][1]) && boardGame[0][1].equals(boardGame[0][2]) && !boardGame[0][2].equals("-")) ||
                (boardGame[1][0].equals(boardGame[1][1]) && boardGame[1][1].equals(boardGame[1][2]) && !boardGame[1][2].equals("-")) ||
                (boardGame[2][0].equals(boardGame[2][1]) && boardGame[2][1].equals(boardGame[2][2]) && !boardGame[2][2].equals("-")) ||
                (boardGame[0][0].equals(boardGame[1][1]) && boardGame[1][1].equals(boardGame[2][2]) && !boardGame[2][2].equals("-")) ||
                (boardGame[0][2].equals(boardGame[1][1]) && boardGame[1][1].equals(boardGame[2][0]) && !boardGame[2][0].equals("-"))) {
            System.out.print("KONIEC GRY!!! \nWygrał: ");
            return true;
        }
        return false;
    }


    private void asignChoice(String[][] boardGame, String signOfPlayer) {

        Scanner cin = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            int choice;
            choice = cin.nextInt();
            switch (choice) {
                case 1:
                    if (boardGame[0][0].equals("-")) {
                        boardGame[0][0] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;
                case 2:
                    if (boardGame[0][1].equals("-")) {
                        boardGame[0][1] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;

                case 3:
                    if (boardGame[0][2].equals("-")) {
                        boardGame[0][2] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;
                case 4:
                    if (boardGame[1][0].equals("-")) {
                        boardGame[1][0] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;
                case 5:
                    if (boardGame[1][1].equals("-")) {
                        boardGame[1][1] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;
                case 6:
                    if (boardGame[1][2].equals("-")) {
                        boardGame[1][2] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;
                case 7:
                    if (boardGame[2][0].equals("-")) {
                        boardGame[2][0] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;
                case 8:
                    if (boardGame[2][1].equals("-")) {
                        boardGame[2][1] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;
                case 9:
                    if (boardGame[2][2].equals("-")) {
                        boardGame[2][2] = signOfPlayer;
                        flag = false;
                    } else {
                        System.out.println("To pole jest wypełnione!!!\nwybierz inne:");
                    }
                    break;
                default:
                    System.out.println("Musisz wybrać liczbę z przedziału 1-9!!!" +
                            "\nPodaj poprawną liczbę:");
            }
        }
    }

    public void createAndDisplayRefBoard() {
        System.out.println("Witaj w grze Kółko i krzyżyk!!!" +
                "\nTo jest gra dla dwóch osób." +
                "\nZobacz tablicę poniżej" +
                "\nKażdy z graczy (naprzemian) wpisuje liczbę odpowiadającą polu tablicy gry, by umieścić swój znak." +
                "\ngracz1 gra krzyzykami, natomiast gracz2 kółkami." +
                "\nStart!!!!!" +
                "\n*******************************");
        String[][] boardOfReferences = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        displayBoard(boardOfReferences);
    }

    private void displayBoard(String[][] board) {
        for (String[] aBoard : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(aBoard[j] + " ");
            }
            System.out.println();
        }
    }

}
