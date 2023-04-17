A chess game using Object Oriented Principles

Reference: https://www.geeksforgeeks.org/design-a-chess-game/

Spot: A spot represents one block of the 8×8 grid and an optional piece.
Piece: The basic building block of the system, every piece will be placed on a spot. Piece class is an abstract class. The extended classes (Pawn, King, Queen, Rook, Knight, Bishop) implements the abstracted operations.
Board: Board is an 8×8 set of boxes containing all active chess pieces.
Player: Player class represents one of the participants playing the game.
Move: Represents a game move, containing the starting and ending spot. The Move class will also keep track of the player who made the move.
Game: This class controls the flow of a game. It keeps track of all the game moves, which player has the current turn, and the final result of the game.


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
