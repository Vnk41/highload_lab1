В данной лабораторной работе необходимо создать несколько экземпляров приложения на разных портах, реализовать и проанализировать разные алгоритмы балансировки.
- round robin

В данном случае последовательно происходит обращение к разным портам.
- ip_hash

Обращение только к одному порту.
- least_conn

Результат зависит от параметра weight.
- random

Выбирается случайный порт (из 20 обращений 11 к первому порту, 9 ко второму).
Конфиги вариантов указаны в папке NginxConfigs.
