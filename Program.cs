using static System.Console;
using static System.Convert;
using System;

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

int max = num1;
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
if (check > 999) Write(number1, 0);
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

int tocheck = 12321;

int [] digits = Digits(paltocheck);
PrintArray(digits);

bool Palindrome (int [] digits)
{
bool compare1 = digits[0] == digits[digits.Length];
bool compare2 = digits[1] == digits[digits.Length-1];

return compare1 && compare2;
}

WriteLine();
WriteLine("22. Найти расстояние между точками в пространстве 2D/3D"); // Адаптировать так, чтобы можно было выбирать 2 точки или три. Так, чтобы вся задача решалась одним методом, а не двумя

int[] dot(int Min, int Max)
{
    int dot1 = new Random().Next(Min, Max);
    int dot2 = new Random().Next(Min, Max);
    int[] result = {dot1, dot2};
    return result;
}

int[] x = dot(0, 20);
WriteLine(PrintMyArray(x));
int[] y = dot(0, 20);
WriteLine(PrintMyArray(y));
int[] z = dot(0, 20);
WriteLine(PrintMyArray(z));

double distance(int[] x, int[] y, int[] z)
{
    return Math.Sqrt(Math.Pow((x[1] - x[0]),2) + Math.Pow((y[1] - y[0]),2)+ Math.Pow((z[1] - z[0]),2));
}

double dist = distance(x, y, z);
WriteLine(dist);


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

int [] digits = Digits(ToInt32(ReadLine()));
PrintArray(digits);
WriteLine(ArraySum(digits));


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
