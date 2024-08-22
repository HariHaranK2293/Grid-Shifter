# Grid-Shifter

Grid Shifter is a Java-based game inspired by Tetris, where players interact with a 5x5 grid to place, mark, and shift elements dynamically. The game implements array manipulation techniques to allow for grid optimization and cell shifting.

## Features
* Grid Manipulation: Players can input specific coordinates to mark positions in a 5x5 grid.
* Grid Optimization: Rows that meet certain conditions are optimized by marking them entirely.
* Dynamic Cell Shifting: The marked cells are shifted through a swapping mechanism, providing dynamic movement across the grid.
* Random Initialization: Each run initializes the grid with random values for a new experience.

## How It Works
* The grid is initialized as a 5x5 array, filled with random integers.
* Players enter coordinates to place a mark "1" in the grid.
* The grid checks if the entire row should be optimized (marked with -1).
* Once optimized, the grid undergoes a shifting process, dynamically moving the cells upwards to fill the gaps.

## Code Structure
* enter(): Takes user input and marks a specific position on the grid.
* opt(): Checks the grid for rows that meet optimization conditions and updates the grid accordingly.
* pp(): Shifts cells by swapping positions to create movement in the grid.
* print(): Displays the current state of the grid.

## Future Improvements

* Implement additional grid sizes and difficulty levels.
* Introduce more complex movement patterns and optimizations.
* Add a scoring system and a graphical interface for enhanced gameplay.
