using static System.Console;
using static System.Convert;
using System;

// // Почувствуй себя интерном (семинар 04.11.2021)
// WriteLine("0. Вывести квадрат числа");

// int x = ToInt32(ReadLine());
// int power = x*x;
// WriteLine(power);

// WriteLine();
// WriteLine("1. По двум заданным числам проверять является ли первое квадратом второго");

// bool IsQuadrat (int x, int y)
// {
// int z = x*y;
// if (z==x) return true;
// else return false; 
// }

// int x1 = ToInt32(ReadLine());
// int x2 = ToInt32(ReadLine());
// WriteLine(IsQuadrat(x1, x2));

// WriteLine();
// WriteLine("2. Даны два числа. Показать большее и меньшее число");

// void Compare (int x, int y)
// {
// if (y>x) Console.WriteLine(y + " больше " + x);
// else Console.WriteLine(x +" больше "+ y);
// }

// int x3 = ToInt32(ReadLine());
// int x4 = ToInt32(ReadLine());
// Compare(x3, x4);

// WriteLine();
// WriteLine("3. По заданному номеру дня недели вывести его название");

// int day = ToInt32(ReadLine());

// string name = day switch
// {
// 1 => "понедельник",
// 2 => "вторник",
// 3 => "среда",
// 4 => "четверг",
// 5 => "пятница",
// 6 => "суббота",
// 7 => "воскресенье",
// _ => "нет дня недели с таким номером"
// };
// WriteLine(name);

// WriteLine();
// WriteLine("4. Найти максимальное из 3 чисел");

// int num = ToInt32(ReadLine());
// int num1 = ToInt32(ReadLine());
// int num2 = ToInt32(ReadLine());

// int max = num1;
// if (num1 > max) max = num1;
// if (num2 > max) max = num2;
// Console.WriteLine(max);

// WriteLine();
// WriteLine("5. Написать программу вычисления значения функции y=f(a). Как уточнили потом: функция y=sin(a)");

// double sin(double a)
// {
//     return Math.Asin(a); //тот самый момент когда код работает, но как? Непонятно
// }

// double a = sin(ToDouble(ReadLine()));
// Console.WriteLine(a);

// WriteLine();
// WriteLine("6. Выяснить является ли число чётным");

// int b = ToInt32(ReadLine());

// if (b%2==0){Console.WriteLine("четное");}
// else {Console.WriteLine("нечетное");}


// WriteLine();
// WriteLine("7. Показать числа от -N до N");

void PrintArray(int[] collect)
{
    for (int pos = 0; pos < collect.Length; pos ++) Write($"{collect[pos]} ");
    WriteLine();
    WriteLine();
}

// int [] FillArray(int N)
// {
// int[] collect = new int[N+N+1];
// for (int pos = 0; pos < collect.Length; pos++) 
// {
//     collect[pos] = -N;
// N--; // тот самый момент, когда сначала написал код и только потом понял, почему он работает как надо.
// }
// return collect;
// }
// PrintArray(FillArray(ToInt32(ReadLine()))); // и превзошел самого себя по количеству скобочек на строку


// WriteLine();
// WriteLine("8. Показать четные числа от 1 до N");

int[] SelectEvens(int n)
{

int [] result = new int [n+1];

for (int i = 0; i<= result.Length; i++)
{
    if (i%2==0)
    {
    result [i] = i;
    }
}
return result;
}

PrintArray(SelectEvens(ToInt32(ReadLine())));

// WriteLine();
// WriteLine("9. Показать последнюю цифру трёхзначного числа");

// int number = ToInt32(ReadLine());
// string text = Convert.ToString(number);
// WriteLine(text [0]);

// WriteLine();
// WriteLine("10. Показать вторую цифру трёхзначного числа");

// int number1 = ToInt32(ReadLine());
// string t = Convert.ToString(number1); // Какой-то внутренний баг платформы? Без Convert не распознает ToString, но и добавлять его опять для ВСЕЙ простыни из-за пары задач как-то некорректно. И сергея на спросишь. То ли просто потому что он не одобряет этих конвертаций, то ли потому что он объяснял, а я прослушала((()))
// WriteLine(t [1]);


WriteLine();
WriteLine("11. Дано число из отрезка [10, 99]. Показать наибольшую цифру числа. (ради интереся числа генерируются рандомно)");

// int DigCompare(int n)
// {
// WriteLine (n);
// int ten = n / 10;
// int unit = n % 10;
// if (ten > unit) return ten;
// else return unit;
// }

// WriteLine(DigCompare(new Random().Next(10,99)));


WriteLine();
WriteLine();// -----------------------------------------------Семинар 08.11.2021

WriteLine("12. Удалить вторую цифру трёхзначного числа");

// int number5 = 465;
// string totext = ToString(number5);
// Console.Write($"{totext [0]}{totext [2]}");
WriteLine();
WriteLine("13. Выяснить, кратно ли число заданному, если нет, вывести остаток.");

// int number6 = 323;
// int crat = 10;

// if (number6 % crat == 0) Console.WriteLine ("Кратно");
// else {Console.WriteLine (number6 % crat);}
WriteLine();
WriteLine("14. Найти третью цифру числа или сообщить, что её нет");


WriteLine();
WriteLine();// -----------------------------------------------

// Почувствуй себя джуном (Задачи, которые появились на самом семинаре 08.11.2021)
WriteLine("15. Дано число. Проверить кратно ли оно 7 и 23");

// int number6 = 25;

// if (number6 % 7 == 0 || number6 % 23 == 0) Console.WriteLine ("Кратно");
// else {Console.WriteLine (" Не кратно");}
WriteLine();
WriteLine("16. Дано число обозначающее день недели. Выяснить является номер дня недели выходным");

// string WeekMethod(int arg)
// {
// if (arg==6 || arg ==7) 

// return "выходной";

// else return "будний день";
// }

// Console.WriteLine(WeekMethod(3));
WriteLine();
WriteLine("17. По двум заданным числам проверять является ли одно квадратом другого");

// string IsQuadrat(int arg1, int arg2)
// {
// if (arg1*arg2 % arg2 ==0) 

// return "Является";

// else return "Не является";
// }

// Console.WriteLine(IsQuadrat(64, 8));
WriteLine();
WriteLine("18. Проверить истинность утверждения ¬(X ⋁ Y) = ¬X ⋀ ¬Y");

// bool logic(bool x, bool y)
// {
//     return !(x || y) == (!x && !y); //  закон моргана всегда истина. Без скобок == выполняется до &&
// }

// Console.WriteLine(logic(true, true));
WriteLine();
WriteLine("19. Определить номер четверти плоскости, в которой находится точка с координатами Х и У, причем X ≠ 0 и Y ≠ 0");

// int x = 1;
// int y = -1;

// if (x > 0 && y > 0) Console.WriteLine(1);
// if (x > 0 && y < 0) Console.WriteLine(4);
// if (x < 0 && y < 0) Console.WriteLine(3);
// if (x < 0 && y > 0) Console.WriteLine3(3);

WriteLine();
WriteLine("20. Задать номер четверти, показать диапазоны для возможных координат");
WriteLine();
WriteLine("21. Программа проверяет пятизначное число на палиндромом.");
WriteLine();
WriteLine("22. Найти расстояние между точками в пространстве 2D/3D");


//----------------------- Задачи, которые добавилмсь на семинаре 11.11.2021

// Почувствуй себя мидлом
// 23. Показать таблицу квадратов чисел от 1 до N 
// int [] Fillarray(int N)
// {
//  int [] array = new int [N+1];

// for (int i = 1; i < array.Length; i++)
// {
//     array [i-1] = i*i;
// }
//  return array;   
// }

// void PrintArray(int[] collect)
// {
//     for (int pos = 0; pos < collect.Length; pos ++) Console.Write($"{collect[pos]} ");
//     Console.WriteLine();
//     Console.WriteLine();
// }

// PrintArray(Fillarray(5));

// 24. Найти кубы чисел от 1 до N
// 25. Найти сумму чисел от 1 до А

// int Sum (int A)
// {int sum = 0;
// for (int i = 1; i < A+1; i++)
// {
//     sum = sum + i;
// }
// return sum;
// }

// int Sum1 = Sum(10);
// Console.WriteLine(Sum1);

// 26. Возведите число А в натуральную степень B используя цикл

// int Power (int A, int B)
// {int result = A;
// for (int i =1; i < B; i++)
// {
//     result = result * A;
// }
// return result;
// }

// Console.WriteLine(Power(2,3));

// 27. Определить количество цифр в числе

// int Num = 12893;

// int DigitQuantity(int Num)
// {
// return Convert.ToString(Num).Length;
// }

// n         o
// 12345   
// 1234            5
// 123             4
// 12              3
// 1               2
// 0               1
// int Counter(int n)
// {
//     int res  =0;
//     int s=0;
//     if (n == 0)
//     {
//     res  =1;
//     s=1;
//     }
//     else
//     {
//     while(n!=0)
//     {
//         int o = n%10;
//         s+=o;
//         res++;
//         n/=10;
//     }
//     }
//     return s;
// }
// System.Console.WriteLine(Counter(0));
// System.Console.WriteLine(Counter(10));
// System.Console.WriteLine(Counter(23));
// System.Console.WriteLine(Counter(110));
// System.Console.WriteLine(Counter(11023));
// int DG = DigitQuantity(Num);

// 28. Подсчитать сумму цифр в числе

// string [] Fillarray(int Num)
// {
// string [] digits = new string [Convert.ToString(Num).Length];
// string digit = Convert.ToString(Num);
// for (int i = 0; i < digits.Length; i++)
// {
//     digits [i] = digit [0];
// }

//     return ;
// }

// void PrintArray(string[] collect)
// {
//     for (int pos = 0; pos < collect.Length; pos ++) Console.Write($"{collect[pos]} ");
//     Console.WriteLine();
//     Console.WriteLine();
// }

// PrintArray(digits);

// 29. Написать программу вычисления произведения чисел от 1 до N
// 30. Показать кубы чисел, заканчивающихся на четную цифру
