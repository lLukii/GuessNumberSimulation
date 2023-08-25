# GuessNumberSimulation
A simulation of a guess the number game

# About the approach
[UNFINISHED (wrote this at 11:30 pm)]
The simulation starts with some number $n$ in the range of 0 to 1000 such that the "user" needs to guess that particular number. A key part of guess the number is minimizing the range of possible values that $n$ could correspond to. So in other words, $j-i$ must approach 0 if $n\in[i, j]$. Knowing that $i\le{j}$, we can help reach this direction either by incrementing $i$ or decrementing $j$. Next, we chose the computer input as some number $g$ such that $g=\lfloor\frac{i+j}{2}\rfloor$ to balance $g-i$ and $j-g$. 
