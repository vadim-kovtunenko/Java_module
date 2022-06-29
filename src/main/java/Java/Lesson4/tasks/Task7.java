package Java.Lesson4.tasks;


import Java.Lesson4.utils.IOUtils;

public class Task7 {

    public static void executeTask() {
        System.out.println("Starting game..\n To make a move, enter field number(1-9)");
        char[][] table = new char[3][3];
        initTable(table);
        while (true) {
            makeTurnForUser(table);
            if (checkWin('X', table)) {
                System.out.println("You win!!!");
                break;
            }
            if (isTableFull(table)) {
                System.out.println("DRAW!");
                break;
            }
            makeTurnComputer(table);
            printTable(table);
            if (checkWin('O', table)) {
                System.out.println("You lose!!!");
                break;
            }
            if (isTableFull(table)) {
                System.out.println("DRAW!");
                break;
            }
        }


    }

    private static void makeTurnForUser(char[][] table) {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = IOUtils.readInteger() - 1;
            y = IOUtils.readInteger() - 1;
        } while ((x < 0 || y < 0 || x >= 3 || y >= 3) || table[x][y] != ' ');
        table[x][y] = 'X';
    }

    private static void makeTurnComputer(char[][] table) {
        int x, y;
        do {
            x = IOUtils.getRandomInt(0, 2);
            y = IOUtils.getRandomInt(0, 2);
        } while ((x < 0 || y < 0 || x >= 3 || y >= 3) || table[x][y] != ' ');
        table[x][y] = 'O';
    }

    private static boolean isTableFull(char[][] table) {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (table[row][col] == ' ')
                    return false;
        return true;
    }

    private static boolean checkWin(char dot, char[][] table) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == dot && table[i][1] == dot &&
                    table[i][2] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot &&
                            table[2][i] == dot))
                return true;
        if ((table[0][0] == dot && table[1][1] == dot &&
                table[2][2] == dot) ||
                (table[2][0] == dot && table[1][1] == dot &&
                        table[0][2] == dot))
            return true;
        return false;
    }

    private static void initTable(char[][] table) {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                table[row][col] = ' ';
    }

    private static void printTable(char[][] table) {
        for (int row = 0; row < 3; row++) {
            System.out.print(' ');
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + "|");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int num1 = 6;
        int num2 = 8;
        // тернарный оператор
        String result = num1 > num2 ? "num1 > num2" : "num1 < num2";
        String sameResult;
        if (num1 > num2) {
            sameResult = "num1 > num2";
        } else {
            sameResult = "num1 < num2";
        }
        System.out.println(result);
    }


}