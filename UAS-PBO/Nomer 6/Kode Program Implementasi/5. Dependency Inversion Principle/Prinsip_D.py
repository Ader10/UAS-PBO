# -*- coding: utf-8 -*-
"""Untitled2.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1-BmmnerpPplfU53Ej7vEiYVfXLB_WTgI
"""

class Koneksi:

    def connect():
        pass

class MySQLConnection(Koneksi):

    def connect():
        # Logic untuk menghandle database connection
        return "Database Connection"

class ModelApp:

    def __init__(self, connection : Koneksi):
        # self connection
        self.connection = connection