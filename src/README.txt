Программа запускается посредством main() класса Main.

Схема работы программы:
    1. Считывание общего списка игрушек из файла
    2. Запуск главного меню (манипуляции с общим списком, подготовка списка для розыгрыша, розыгрыш призов)
    3. Запись результатов розыгрыша (при его проведении)
    4. Запись результирующего общего списка в файл.

По пакетам:
    Toy - класс игрушек с сопутствующими методами;
    Assortment - класс, работающий с полученным ассортиментом игрушек;
    Crook - класс, отвечающий за список розыгрыша и его реализацию;
    Menu - класс главного меню.

    Предложенная в задании схема с выдачей случайного id с соответствующим весом экземпляра игрушки
показалась нелогичной. Кроме того - случайный выбор не обеспечивал надлежащего соотношения весов игрушек.
Странно вообще формировать список случайным выбором по весам, не указав общий размер результирующего списка.
А задание как раз подразумевало наличие отдельного метода по созданию списка розыгрыша с четко фиксированным
по размеру (10 позиций) результатом. В итоговом варианте метод createListOfPrizes() принимает размер списка и три
категории игрушек с соответствующими им весам.
    Решено формированием списка (класс Crook, путем случайного выбора из общего списка, по категориям игрушек и их
весам) из десяти позиций с дальнейшим случайным выбором из него в процессе розыгрыша. Список розыгрыша после
формирования "перемешивается" для избежания закономерности по выпадению игрушки в соответствии с весом.