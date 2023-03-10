# -*- coding: utf-8 -*-
"""Untitled2.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1-BmmnerpPplfU53Ej7vEiYVfXLB_WTgI
"""

import math
class Lingkaran:

    def __init__(self, radius):
        self.radius = radius
class Persegi:

    def __init__(self, panjang):
        self.panjang = panjang
class Kalkulasi:

    def __init__(self, *args):
        self.bangunDatar = args

    def calculate(self):
        listLuas = []
        for objek in self.bangunDatar:
            luas = 0
            if type(objek).__name__ == 'Persegi':
                luas = math.pow(objek.panjang, 2)
            elif type(objek).__name__ == 'Lingkaran':
                luas = math.pi * math.pow(objek.radius, 2)
            listLuas.append(luas)

        return sum(listLuas)

    def output(self):
        return self.calculate()

if __name__ == "__main__":

    result = Kalkulasi(
        Lingkaran(2),
        Persegi(5),
        Persegi(6)
    )

    print("Jumlah luas dari bangunan ", result.output())