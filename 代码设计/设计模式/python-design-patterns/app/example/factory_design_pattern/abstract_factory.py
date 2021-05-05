# -*- coding: utf-8 -*-#

# -------------------------------------------------------------------------------
# Name:         abstract_factory
# Description:  抽象工厂
# Author:       orange
# Date:         2021/5/5
# -------------------------------------------------------------------------------


class Frog:
    def __init__(self, name):
        self.name = name

    def __str__(self):
        return self.name

    def interact_with(self, obstacle):
        print('{} the Frog encounters {} and {}!'.format(self, obstacle, obstacle.action()))


class Bug:

     def action(self):
        return 'eats it'
