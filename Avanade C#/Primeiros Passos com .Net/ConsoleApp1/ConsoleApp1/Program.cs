﻿using System;

namespace OlaMundo
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = new int[10];

            for (int i = 0; i < a.Length; i++)
            {
                a[i] = i * i;
                Console.WriteLine($"a[{i}] = {a[i]}");
            }  
        }
    }
}