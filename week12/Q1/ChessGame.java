
import java.util.ArrayList;
import java.util.Scanner;

interface Movable {
    void move(String newPos);
}

abstract class ChessPiece implements Movable {
    String name; // e.g. "King", "Queen"
    String color; // "White", "Black"
    String curPos; // e.g. "a1", "c5"

    public ChessPiece(String name, String color, String curPos) {
        this.name = name;
        this.color = color;
        this.curPos = curPos;
    }

    @Override
    public void move(String newPos) {
        System.out.println(color + " " + name + " moving from " + curPos + " to " + newPos);
        this.curPos = newPos; // Update the current position
    }
}

class King extends ChessPiece {
    public King(String color, String curPos) {
        super("King", color, curPos);
    }
}

class Queen extends ChessPiece {
    public Queen(String color, String curPos) {
        super("Queen", color, curPos);
    }
}

class Pawn extends ChessPiece {
    public Pawn(String color, String curPos) {
        super("Pawn", color, curPos);
    }
}

class ChessGame {
    public static void main(String[] args) {
        ArrayList<ChessPiece> pieces = new ArrayList<>();
        pieces.add(new King("White", "e1"));
        pieces.add(new Queen("Black", "d8"));
        pieces.add(new Pawn("White", "a2"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("(Comp) : Created 3 chess Pieces (King(White), Queen(Black), Pawn(White)).");

        while (true) {
            System.out.print("(Comp) : Enter which piece to be moved (0 to Quit) & new Position: ");
            int pieceIndex = scanner.nextInt(); // Get the index of the piece to move
            if (pieceIndex == 0) {
                System.out.println("(Comp) : Bye, Thank you !!");
                break; // Exit the loop if the user enters 0
            }
            String newPos = scanner.next(); // Get the new position for the selected piece
            if (pieceIndex > 0 && pieceIndex <= pieces.size()) {
                pieces.get(pieceIndex - 1).move(newPos); // Move the selected piece
            } else {
                System.out.println("(Comp) : Invalid piece selection."); // Handle invalid input
            }
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}