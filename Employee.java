/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.Scanner;

/**
 *
 * @author BARIŞ HANIM İNCE
 */


 public class Employee {
    
private String name;
private int salary;
private int workHours;
private int hireYear;



    public void Employee(String name, int salary, int workHours, int hireYear) {
      this.name=name;
       this.salary=salary;
       this.workHours=workHours;
       this.hireYear=hireYear;
       
    }
   
   


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getworkHours() {
        return workHours;
    }

    public void setworkHours(int workHours) {
        this.workHours = workHours;
    }

    public int gethireYear() {
        return hireYear;
    }

    public void sethireYear(int hireYear) {
        this.hireYear = hireYear;
    }

   
    
    public int tax(){
        int vergi=0;
        if(salary>=1000){
 
            vergi=(int) (salary * 0.03) ;
            return vergi;
        }
        else {
           
            return vergi;
        }

    }
    
        
    public int bonus(){
        int bonus = 0;
        if(workHours>40){
            bonus=(workHours-40)*(30);   
        }
        else {
            return bonus;
        }
    return bonus;
    }
    
     public int  raiseSalary(){
        int x = 0;
        int newSalary= (salary+bonus())-tax();
        if(2021-hireYear<10){
            x=(int) (newSalary*0.05);   
        }
        if((2021-hireYear)>9 && (2021-hireYear)<20){
            x=(int) (newSalary*0.1);  
        }
        if((2021-hireYear)>19){
            x=(int) (newSalary*0.15);
        }
    return x;
    }
  
    private static Scanner toString ;
    
       
 
      

    /**
     *
     * @param args
     */
    public static void  main(String[] args) {
        toString = new Scanner (System.in);
        String ad;
        int maas,calismaSaati,calismaYili;
       
        
        Scanner scan=new Scanner(System.in);
             
        System.out.println("Ad giriniz:");
        ad=toString.nextLine();
        System.out.println("Maas giriniz:");
        maas=toString.nextInt();
        System.out.println("Çalışma saati giriniz:");
        calismaSaati=toString.nextInt();
        System.out.println("Çalışma yılı giriniz:");
        calismaYili=toString.nextInt();
        
        
        Employee employee=new Employee();
        employee.Employee(ad, maas, calismaSaati, calismaYili);
 
        
     
      employee.setName(ad);
      employee.setSalary(maas);
      employee.setworkHours(calismaSaati);
      employee.sethireYear(calismaYili);
      
        System.out.println("Bilgileriniz:");
        System.out.println("Ad: " +ad);
        System.out.println("Maaş: " +maas);
        System.out.println("Çalışma saati: "+calismaSaati);
        System.out.println("Başlangıç Yılı: "+calismaYili);
        System.out.println("Vergi: " +employee.tax());
        System.out.println("Bonus: " +employee.bonus());
        System.out.println("Maaş artışı: " +employee.raiseSalary());
        int VergiMaas = (maas+employee.bonus())- employee.tax();
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + VergiMaas);
        int ToplamMaas = (maas+employee.bonus()+employee.raiseSalary())- employee.tax();
        System.out.println("Toplam maaş: " + ToplamMaas);


             }
    
 }
    




    
    
    

