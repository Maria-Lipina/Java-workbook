using static System.Console;
using static System.Convert;
using System;

int[] CreateMyArray(int length)
{
    return new int[length];
}

void FillMyArray(int[] collection, int minValue, int maxValue) // А тут войд можно и нужно, потому что метод только заполняет
{
    for (int i = 0; i < collection.Length; i++)
    {
        collection[i] = new Random().Next(minValue, maxValue + 1);
    }
}

string PrintMyArray(int[] collect)
{
    string outputString = String.Empty;
    for (int pos = 0; pos < collect.Length; pos++) outputString += $"{collect[pos]} ";
    return outputString;
}
//-----------------------------------

// // Почувствуй себя интерном (семинар 04.11.2021)
WriteLine("0. Вывести квадрат числа");

int x = ToInt32(ReadLine());
int power = x*x;
WriteLine(power);

WriteLine();
WriteLine("1. По двум заданным числам проверять является ли первое квадратом второго");

bool IsSquare(int square, int number)
{
if (Math.Sqrt(square) == number) return true;
else return false;
}

WriteLine(IsSquare(ToInt32(ReadLine()),ToInt32(ReadLine()))); // Рекорд по количеству скобок на строку был побит снова, когда работала над задачей 17 и обнаружила, что она идентична задаче 1)

WriteLine();
WriteLine("2. Даны два числа. Показать большее и меньшее число");

void Compare (int x, int y)
{
if (y>x) Console.WriteLine(y + " больше " + x);
else Console.WriteLine(x +" больше "+ y);
}

int x3 = ToInt32(ReadLine());
int x4 = ToInt32(ReadLine());
Compare(x3, x4);

WriteLine();
WriteLine("3. По заданному номеру дня недели вывести его название");

string Week(int day)
{
return day switch
{
1 => "Будний: понедельник",
2 => "Будний: вторник",
3 => "Будний: среда",
4 => "Будний: четверг",
5 => "Будний: пятница",
6 => "Выходной: суббота",
7 => "Выходной: воскресенье",
_ => "нет дня недели с таким номером"
};
}
WriteLine(Week(ToInt32(ReadLine())));


WriteLine();
WriteLine("4. Найти максимальное из 3 чисел");

int num = ToInt32(ReadLine());
int num1 = ToInt32(ReadLine());
int num2 = ToInt32(ReadLine());

int max = num;
if (num1 > max) max = num1;
if (num2 > max) max = num2;
Console.WriteLine(max);

WriteLine();
WriteLine("5. Написать программу вычисления значения функции y=f(a). Как уточнили потом: функция y=sin(a)");

double sin(double a)
{
    return Math.Asin(a); //тот самый момент когда код работает, но как? Непонятно
}

double a = sin(ToDouble(ReadLine()));
Console.WriteLine(a);

WriteLine();
WriteLine("6. Выяснить является ли число чётным");

int b = ToInt32(ReadLine());

if (b%2==0){Console.WriteLine("четное");}
else {Console.WriteLine("нечетное");}


WriteLine();
WriteLine("7. Показать числа от -N до N");

void PrintArray(int[] collect)
{
    for (int pos = 0; pos < collect.Length; pos ++) Write($"{collect[pos]} ");
    WriteLine();
    WriteLine();
}

int [] FillArray(int N)
{
int[] collect = new int[N+N+1];
for (int pos = 0; pos < collect.Length; pos++) 
{
    collect[pos] = -N;
N--; // тот самый момент, когда сначала написал код и только потом понял, почему он работает как надо.
}
return collect;
}
PrintArray(FillArray(ToInt32(ReadLine()))); // и превзошел самого себя по количеству скобочек на строку


WriteLine();
WriteLine("8. Показать четные числа от 1 до N");

int[] SelectEvens(int n)
{
int [] result = new int [n];
int len = 0;

for (int i = 0; i<= result.Length; i++)
{
    if (i%2==0)
    {
    result [len] = i;
    len++;
    }
}
Array.Resize(ref result, len);
return result;
}

PrintArray(SelectEvens(ToInt32(ReadLine())));


WriteLine();
WriteLine("9. Показать третью цифру трёхзначного числа");

void SelectDigit(string? number, int index)
{
    int check = Convert.ToInt32(number);
    if(99 < check && check < 1000) Write(number [index]);
    else {WriteLine("Не трехзначное число"); }
}

SelectDigit(ReadLine(), 0);

WriteLine();
WriteLine("10. Показать вторую цифру трёхзначного числа");

SelectDigit(ReadLine(), 1);


WriteLine();
WriteLine("11. Дано число из отрезка [10, 99]. Показать наибольшую цифру числа. (ради интереся числа генерируются рандомно)");

int DigCompare(int n)
{
WriteLine (n);
int ten = n / 10;
int unit = n % 10;
if (ten > unit) return ten;
else return unit;
}

WriteLine(DigCompare(new Random().Next(10,99)));


WriteLine();
WriteLine();// -----------------------------------------------Семинар 08.11.2021

WriteLine();
WriteLine("12. Удалить вторую цифру трёхзначного числа");

string? number = ReadLine();
SelectDigit(number, 0);
SelectDigit(number, 2);


WriteLine();
WriteLine("13. Выяснить, кратно ли число заданному, если нет, вывести остаток.");

bool FactorCheck (int number, int factor)
{
    if (number % factor == 0) return true;
    else return false;
}

int number3 = Convert.ToInt32(ReadLine());
Write("Проверить на кратность: ");
int factor = Convert.ToInt32(ReadLine());

if(FactorCheck(number3, factor)) WriteLine("Кратно");
else {Write("Не кратно. Остаток: " + number3 % factor);}


WriteLine();
WriteLine("14. Найти третью цифру числа или сообщить, что её нет");

string? number1 = ReadLine();
int check = ToInt32(number1);
if (check > 999) WriteLine(number1, 0);
else {SelectDigit(number1, 0);}

WriteLine();
WriteLine();// -----------------------------------------------


// Почувствуй себя джуном (Задачи, которые появились на самом семинаре 08.11.2021)

WriteLine();
WriteLine("15. Дано число. Проверить кратно ли оно 7 и 23");

int number4 = Convert.ToInt32(ReadLine());

if (FactorCheck(number4, 7) && FactorCheck(number4, 23)) Console.WriteLine ("Кратно");
else {Console.WriteLine ("Не кратно");}


WriteLine();
WriteLine("16. Дано число обозначающее день недели. Выяснить является номер дня недели выходным");

WriteLine(Week(ToInt32(ReadLine())));


WriteLine();
WriteLine("17. По двум заданным числам проверять является ли одно квадратом другого");

WriteLine(IsSquare(ToInt32(ReadLine()),ToInt32(ReadLine())));


WriteLine();
WriteLine("18. Проверить истинность утверждения ¬(X ⋁ Y) = ¬X ⋀ ¬Y");

bool logic(bool x, bool y)
{
    return !(x || y) == (!x && !y); // Без скобок == выполняется до &&
}

// Write("Х - true или false? ");
// bool X = ToBoolean(ReadLine());
// Write("Y - true или false? ");
// bool Y = ToBoolean(ReadLine());
// WriteLine(logic(X, Y));
//WriteLine();

WriteLine("Таблица истинности"); //первая попытка, которая хороша чисто тем, что она есть.

for (int i = 0; i < 2; i++)
{
    if (i == 0)
    {
       WriteLine("При X - true, начиная с Y - true");
       WriteLine($"{logic(true, true)} {logic(true, false)}"); 
    }
    else
    {
        WriteLine("При X - false, начиная с Y - true");
        WriteLine($"{logic(false, true)} {logic(false, false)}");;
    }
}

WriteLine();
WriteLine("19. Определить номер четверти плоскости, в которой находится точка с координатами Х и У, причем X ≠ 0 и Y ≠ 0");

int Min = -100;
int Max = 100;

int [] RandomDot (int D, int range) //range - четверть или октант.
{int [] dot = CreateMyArray(D);
if (D == 2 || D == 3)
{   
    // для определения х
    if (range == 1 || range == 4 || range == 5 || range == 8) dot [0] = new Random().Next(0, Max);
    if (range == 2 || range == 3 || range == 6 || range == 7) dot [0] = new Random().Next(Min, 0);
    //для определения у
    if (range == 1 || range == 2 || range == 5 || range == 6) dot [1] = new Random().Next(0, Max);
    if (range == 3 || range == 4 || range == 7 || range == 8) dot [1] = new Random().Next(Min, 0);
}
 if (D == 3)
 {  //для определения z
    if (range == 1 || range == 2 || range == 3 || range == 4) dot [2] = new Random().Next(0, Max);
    if (range == 5 || range == 6 || range == 7 || range == 8) dot [2] = new Random().Next(Min, 0);
 }
return dot;
}

int range (int [] dot)
{
switch (dot[0], dot[1])
{
case (> 0, > 0): return 1;
case (< 0, > 0): return 2;
case (< 0, < 0): return 3;
case (> 0, < 0): return 4;
default: return 0;
};
}

int [] Dottocheck = RandomDot(2, 2);
WriteLine(range(Dottocheck));


WriteLine();
WriteLine("20. Задать номер четверти, показать диапазоны для возможных координат");

string ShowRange (int range)
{string Show = $"В четверти {range} Х принимает значения";

   // для определения х
    if (range == 1 || range == 4) Show += $" положительных чисел от 0 до {Max}. Y принимает значения";
    if (range == 2 || range == 3) Show += $" отрицательных чисел от {Min} до 0. Y принимает значения";
    //для определения у
    if (range == 1 || range == 2) Show += $" положительных чисел от 0 до {Max}.";
    if (range == 3 || range == 4) Show += $" отрицательных чисел от {Min} до 0.";
return Show;
}
WriteLine(ShowRange(4));


WriteLine();
WriteLine("21. Программа проверяет пятизначное число на палиндром."); //черновой вариант
WriteLine();

bool Palindrome (int [] digits)
{
bool compare1 = digits[0] == digits[digits.Length];
bool compare2 = digits[1] == digits[digits.Length-1];

return compare1 && compare2;
}
int tocheck = 12321;
int [] digits = Digits(tocheck);
PrintArray(digits);
WriteLine(Palindrome(digits));

WriteLine();
WriteLine("22. Найти расстояние между точками в пространстве 2D/3D");

int [] DotA = RandomDot(3, 1);
WriteLine (PrintMyArray(DotA));

int [] DotB = RandomDot(3, 7);
WriteLine (PrintMyArray(DotB));

// int [] DotA = RandomDot(3, 1);
// WriteLine (PrintMyArray(DotA));

// int [] DotB = RandomDot(3, 1);
// WriteLine (PrintMyArray(DotB));

int [] A3 = {10, 4};
int [] B3 = {19, 1};


double distance(int D, int[] A, int[] B)
{
double distance = 0;
if (D == 2) 
{
    distance = Math.Sqrt(Math.Pow((B[0] - A[0]),2) + Math.Pow((B[1] - A[1]),2));
}
if (D == 3) 
{
    distance = Math.Sqrt(Math.Pow((B[0] - A[0]),2) + Math.Pow((B[1] - A[1]),2)+ Math.Pow((B[2] - A[2]),2));
}
return distance;
}

double dist = distance(2, A3, B3);
WriteLine(dist);

//A x   y   z
//  4   5   9   

//B x   y   z
//  7   2   4


//----------------------- Задачи, которые добавилмсь на семинаре 11.11.2021

// Почувствуй себя мидлом
WriteLine();
WriteLine("23. Найти квадраты чисел от 1 до N");

int [] FillArray1(int A)
{
int[] collect = new int [A];
for (int pos = 0; pos < collect.Length; pos++) collect[pos] = pos+1;
return collect;
}

void PrintPowers(int [] N, int power)
{
for (int i = 0; i < N.Length; i++)
{
   WriteLine($"{N[i]}^{power} = {Math.Pow(N[i], power)}");
} 
}

PrintPowers(FillArray1(ToInt32(ReadLine())),2);


WriteLine();
WriteLine("24. Найти кубы чисел от 1 до N");

PrintPowers(FillArray1(ToInt32(ReadLine())),3);

WriteLine();
WriteLine("25. Найти сумму чисел от 1 до А");

int ArraySum (int[] A)
{int sum = 1;
for (int i = 1; i < A.Length; i++)
{
    sum = sum + A[i];
}
return sum;
}

WriteLine(ArraySum(FillArray1(ToInt32(ReadLine()))));

WriteLine();
WriteLine("26. Возведите число А в натуральную степень B используя цикл"); 

int Power (int A, int B)
{int result = A;
for (int i = 1; i < B+1; i++)
{
    result = result * A;
}
return result;
}

WriteLine("A = ");
int A1 = ToInt32(ReadLine());
WriteLine("B = ");
int B = ToInt32(ReadLine());
WriteLine(Power(A1,B));


WriteLine();
WriteLine("27. Определить количество цифр в числе");

int Num = ToInt32(ReadLine());
WriteLine(Convert.ToString(Num).Length);


WriteLine();
WriteLine("28. Подсчитать сумму цифр в числе");

//Демонстрация от Сергея, как можно найти ту или иную цифру числа математически: делить число на десять то количество раз, которое соответствует разряду=позиции искомой цифры в числе, от единиц до высшего разряда 
//  n - само число и результаты его деления на 10.
//  o - остаток при делении числа на 10 - цифра в составе числа.
// n               o
// 12345   
// 1234            5
// 123             4
// 12              3
// 1               2
// 0               1

//До: Как Сергей набросал решение задачи 28 а заодно и 27 после демонстрации + я переименовала переменные под себя

// int DigitSum(int n)
// {
//     int DigQuantity = 0;
//     int result = 0;
//     if (n == 0)
//     {
//         DigQuantity = 1;
//         result = 1;
//     }
//     else
//     {
//         while (n != 0)
//         {
//             int o = n % 10;
//             result += o; // не совсем ояевидно, но можно догадаться, что полностью строка будет result = result + o
//             DigQuantity++;
//             n /= 10;
//         }
//     }
//     return result;
// }
// WriteLine(DigitSum(ToInt32(ReadLine())));

// После: А теперь давайте поиграемся массивами и функциями собственного производства

int [] Digits(int n)
{
    int [] result = new int [Convert.ToString(n).Length];
    if (n == 0) result [0] = n;
    else
    {
        for (int i = 0; i < result.Length; i++)
        {
            int o = n % 10;
            result[i] = o; // не совсем очевидно, но можно догадаться, что полностью строка будет result = result + o
            n /= 10;
        }
    }
    return result;
}

int [] digs = Digits(ToInt32(ReadLine()));
PrintArray(digs);
WriteLine(ArraySum(digs));


WriteLine();
WriteLine();
WriteLine("29. Написать программу вычисления произведения чисел от 1 до N");

long ArrayProduct (int[] A)
{long prod = A[0];
for (int i = 1; i < A.Length; i++)
{
prod = prod * A[i];
}
return prod;
}

WriteLine(ArrayProduct(FillArray1(ToInt32(ReadLine()))));


WriteLine();
WriteLine("30. Показать кубы чисел, заканчивающихся на четную цифру");

int [] evens = SelectEvens(ToInt32(ReadLine()));
PrintPowers(evens,3);


// Почувствуй себя сеньором ------------ Задачи добавились на семинаре 15.11.2021 (черновой вариант)

WriteLine();
WriteLine("31. Задать массив из 8 элементов и вывести их на экран");
//Решение от Сергея: Друзья, в задаче 31 перед вами целых 3 подзадачи, и на каждую хорошо бы иметь свой метод. Все методы вынесены в самое начало файла перед задачей 0.
int[] arr = CreateMyArray(8);
FillMyArray(arr, 10, 100);
string res = PrintMyArray(arr); WriteLine(res);

//---------------------------------------------------------------------
// Решение До. Сергей: в принципе это тоже работает, но можно лучше
// int[] CreateArray1(int A)
// {
//     int[] collect = new int[A];
//     for (int pos = 0; pos < collect.Length; pos++) collect[pos] = new Random().Next(); // Спросить у пользователя диапазоны мин и макс
//     return collect;
// }

// void PrintArray(int[] collect) - плохо, потому что войд и потому что тут консоль
// {
//     for (int pos = 0; pos < collect.Length; pos++) Console.Write($"{collect[pos]} ");
//     Console.WriteLine();
//     Console.WriteLine();
// }
//-------------------------------------------------------------------

WriteLine();
WriteLine("32. Задать массив из 8 элементов, заполненных нулями и единицами вывести их на экран ");

int[] arr1 = CreateMyArray(8);
FillMyArray(arr, 0, 1);
WriteLine(PrintMyArray(arr1));

WriteLine();
WriteLine("33. Задать массив из 12 элементов, заполненных числами из [-9,9]. Найти сумму положительных/отрицательных элементов массива");

int[] arr2 = CreateMyArray(12);
FillMyArray(arr, -9, 9);
WriteLine(PrintMyArray(arr2));

int[] SelectBySign (int[] array, int sign)
{
//int [] selection = sign switch
int [] result = new int [array.Length];
int len = 0;
switch (sign)
{
case < 0:
for (int i = 0; i<= result.Length; i++)
{
    if (array[i] < 0)
    {
    result [len] = array[i];
    len++;
    }
}
Array.Resize(ref result, len);
return result;

case > 0:
    for (int i = 0; i<= result.Length; i++)
{
    if (array[i] > 0)
    {
    result [len] = array[i];
    len++;
    }
}
Array.Resize(ref result, len);
return result;

case 0:
return array;
};
}

int [] signed = SelectBySign(arr2, -1);
WriteLine(PrintMyArray(signed));
int [] unsigned = SelectBySign(arr2, +1);
WriteLine(PrintMyArray(unsigned));

int SignedSum = ArraySum(signed);
WriteLine(SignedSum);
int UnsignedSum = ArraySum(unsigned);
WriteLine(UnsignedSum);



WriteLine();
WriteLine("34. Написать программу замену элементов массива на противоположные");

int [] ChangeSign(int [] array)
{
    int [] array1 = new int [array.Length];
    for (int i = 0; i < array.Length; i++)
    {
        array1[i] = -array[i];
    }
return array1;
}

int [] A4 = CreateMyArray(10);
FillMyArray(A4, 0, 100);
WriteLine(PrintMyArray(A4));
WriteLine();
int [] B4 = ChangeSign(A4);
WriteLine(PrintMyArray(B4));


WriteLine();
WriteLine("35. Определить, присутствует ли в заданном массиве некоторое число");

int [] A5 = CreateMyArray(15);
FillMyArray(A5, 0, 5);
WriteLine(PrintMyArray(A5));
WriteLine();

int Find (int N, int [] array)
{
    int i = -1;
    while (i+1 < array.Length)
    {
    if (array [i+1] == N) break;
    else i++;
    }
return i+1;
}
int tofind = 3;
WriteLine($"Индекс искомого элемента ({tofind}) в массиве: {Find(tofind, A5)}");

// WriteLine();
// WriteLine("36. Задать массив, заполнить случайными положительными трёхзначными числами. Показать количество нечетных и четных чисел");


// WriteLine();
// WriteLine("37. В одномерном массиве из 123 чисел найти количество элементов из отрезка [10,99]");

// WriteLine();
// WriteLine("38. Найти сумму чисел одномерного массива стоящих на нечетной позиции");

// WriteLine();
// WriteLine("39. Найти произведение пар чисел в одномерном массиве. Парой считаем первый и последний элемент, второй и предпоследний и т.д.");

// WriteLine();
// WriteLine("40. В Указанном массиве вещественных чисел найдите разницу между максимальным и минимальным элементом");