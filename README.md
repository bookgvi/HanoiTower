# Hanoi Tower
## Головоломка "Ханойская башня"
Даны три стержня, на один из которых нанизаны восемь колец, причём кольца отличаются размером и лежат меньшее на большем. 
Задача состоит в том, чтобы перенести пирамиду из восьми колец за наименьшее число ходов на другой стержень. 
За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.

## Реализация через рекурсивное решение
Рекурсивно решаем задачу «перенести башню из n−1 диска на 2-й штырь». 
Затем переносим самый большой диск на 3-й штырь, и рекурсивно решаем задачу «перенеси башню из n−1 диска на 3-й штырек».
  
   
  
 
 
     
  
 
 
