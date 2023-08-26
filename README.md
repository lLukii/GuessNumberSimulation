# GuessNumberSimulation
A simulation of a guess the number game

# About the approach
[UNFINISHED (wrote this at 11:30 pm)]
The simulation starts with some $n$ ($n\in\mathbb{Z}$) in the range of 0 to 1000 such that the "user" needs to guess that particular number. A key part of guess the number is minimizing the range of possible values that $n$ could correspond to. So in other words, we want $j-i$ approach 0 for $n\in[i,j]$ and integer bounds $i$ and $j$. Knowing that $i\le{j}$, we can reach this direction either by incrementing $i$ or decrementing $j$. Since any number in the range of 0 to 1000 can be $n$, we set $i$ and $j$ to the two respectivley. 

Next, we chose the computer input as some number $g$ such that $g=\lfloor i+\frac{j-i}{2}\rfloor$ to balance $g-i$ and $j-g$. If $g$ is less than $n$, we know that $n\notin[i,g]$ (and ovbiously nothing in previously elimated ranges) meaning that the new bound can be updated to $[g+1,j]$. Simiarly if $g$ is greater than $n$, we know that $n\notin[g,j]$ allowing us to change the bound to $[i, g-1]$. (Note: $i=g+1$ and $j=g-1$ for succeeding iterations to properly update $g$). 
