# GuessNumberSimulation
A simulation of a guess the number game

# Example: 
![alt text](https://github.com/lLukii/GuessNumberSimulation/blob/main/Screenshot%202023-08-26%20at%2011.14.08%20AM.png)

# Approach:
The simulation below is just the equivalent of finding the target number $t$ ($t\in\mathbb{Z}$) in a sorted array $arr$ of all integers from $0$ to $1000$ (where $arr_i=i$) using binary search, such that we treat the middle index between pointers $i$ and $j$, $p$ as attempts in finding the number $t$. Since $p$ will always update to $\lfloor{\frac{i+j}{2}}\rfloor$ rendering it to be an integer and that the maximum possible value achieveable value cannot exceed $1000$, it is guaranteed for $p$ to eventually reach $t$, ending the simulation.  
