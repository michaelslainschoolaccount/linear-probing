# Hash Table With Linear Probing

## Info

-   Author: Michael Slain
-   Acknowledgements: Mr. Kuszmaul

## Outline

-   HashTable
    -   _constructor_
        -   **input:** the maximum size of the hash table
        -   **output:** _none_
        -   **effect:** creates the arrays to store keys and values based on the size provided
    -   makeEmpty
        -   **input:** _none_
        -   **output:** _none_
        -   **effect:** empties out the keys and values of the hash table
    -   getSize
        -   **input:** _none_
        -   **output:** the current size of the hash table
        -   **effect:** returns the current size of the hash table
    -   isFull
        -   **input:** _none_
        -   **output:** a boolean indicating whether the hash table is full
        -   **effect:** returns a boolean indicating whether the current size of the hash table is equal to its maximum size
    -   isEmpty
        -   **input:** _none_
        -   **output:** a booolean indicating whether the hash table is empty
        -   **effect:** returns a boolean indicating whether the hash table is empty
    -   contains
        -   **input:** a key
        -   **output:** a boolean indicating whether the hash table contains the key
        -   **effect:** checks whether the hash table contains the key provided
    -   insert
        -   **input:** a key, a value
        -   **output:** _none_
        -   **effect:** inserts the key and value into the hash table
    -   get
        -   **input:** a key
        -   **ouput:** a value
        -   **effect:** finds the value that is attributed the the key provided
    -   remove
        -   **input:** a key
        -   **output:** _none_
        -   **effect:** removes the key provided and the value attributed to it from the hash table
    -   print
        -   **input:** _none_
        -   **output:** _none_
        -   **effect:** prints a representation of the hash table

## Dev

-   Run tests

```zsh
java Main.java
```
