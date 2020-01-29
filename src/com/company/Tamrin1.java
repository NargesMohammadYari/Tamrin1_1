package com.company;

import java.util.Scanner;

/**
 * Created by narges nastran on 09/28/2019.
 */
public class Tamrin1 {
    public int salary;
    public int instalments;
    public int real_salary;

    public void set_salary()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your salary:");
        String str=scanner.nextLine();
        salary=Integer.parseInt(str);
        System.out.println("your salary is:"+salary);
    }

    public void set_Instalments()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your instalments:");
        String str=scanner.nextLine();
        instalments=Integer.parseInt(str);
        System.out.println("your instalments is:"+instalments);
    }
    public void calculate_Realsalary()
    {

            real_salary=(salary-instalments);
            System.out.println("your real_salary is:" +real_salary);
        }

    }
