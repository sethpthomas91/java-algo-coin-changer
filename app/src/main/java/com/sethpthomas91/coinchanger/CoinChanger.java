package com.sethpthomas91.coinchanger;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collections;

public class CoinChanger {
    int penny = 1;
    int nickel = 5;
    int dime = 10;
    int quarter = 25;

    private Map<Integer, String> coinComparisonMap = new HashMap<>(){{
        put(penny, "P");
        put(nickel, "N");
        put(dime, "D");
        put(quarter, "Q");
}};

    int[] orderedCoinsArray = {quarter, dime, nickel, penny};


//    private TreeMap<Integer, String> sorted = new TreeMap<>(coinComparison);
//    Set<Entry<Integer, String>> coinNumbers = sorted.entrySet();
//
//


    public Map<String, Integer> makeChange(int cents) {
        Map<String, Integer> convertedChangeMap = new HashMap<>();
        for(int coin : orderedCoinsArray) {
            while (cents >= coin) {
                String coinDenomination = coinComparisonMap.get(coin);
                if (convertedChangeMap.containsKey(coinDenomination)) {
                    int count = convertedChangeMap.get(coinDenomination);
                    convertedChangeMap.put(coinDenomination, count + 1);
                } else {
                    convertedChangeMap.put(coinDenomination, 1);
                }
                cents -= coin;
            }
        }
        return convertedChangeMap;
    }
}
