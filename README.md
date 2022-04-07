# java-algo-coin-changer
This is going to be an application to solve the coin changing kata.

It will take in an integer and output an array with the change in coins.

Coins used will be half-dollars, quarters, dimes, nickels, and pennies, worth 50¢, 25¢, 10¢, 5¢ and 1¢, respectively. They'll be represented by the symbols H, Q, D, N and P

CoinChanger.make_change(0)   #-->  {}

CoinChanger.make_change(1)   #-->  {:P=>1}

CoinChanger.make_change(43)  #-->  {:Q=>1, :D=>1, :N=>1, :P=>3}

CoinChanger.make_change(91)  #-->  {:H=>1, :Q=>1, :D=>1, :N=>1, :P=>1}