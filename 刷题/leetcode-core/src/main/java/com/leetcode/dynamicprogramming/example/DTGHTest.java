package com.leetcode.dynamicprogramming.example;

/**
 * @author lj.michale
 * @description 背包问题测试
 * @date 2021-05-27
 */
public class DTGHTest {

    public static void main(String[] args) {

        DTGHProblem.Knapsack[] bags = new DTGHProblem.Knapsack[] {
                new DTGHProblem.Knapsack(2, 13),
                new DTGHProblem.Knapsack(1, 10),
                new DTGHProblem.Knapsack(3, 24),
                new DTGHProblem.Knapsack(2, 15),
                new DTGHProblem.Knapsack(4, 28),
                new DTGHProblem.Knapsack(5, 33),
                new DTGHProblem.Knapsack(3, 20),
                new DTGHProblem.Knapsack(1, 8)
        };

        int totalWeight = 12;

        DTGHProblem problem = new DTGHProblem(bags, totalWeight);
        problem.solve();

        System.out.println(problem.getBestValue());

    }

}
