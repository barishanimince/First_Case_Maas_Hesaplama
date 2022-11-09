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
  
       public void toString(){
        System.out.println("Bilgileriniz:");
        System.out.println("Ad: " +name);
        System.out.println("Maaş: " +salary);
        System.out.println("Çalışma saati: "+workHours);
        System.out.println("Başlangıç Yılı: "+hireYear);
        System.out.println("Vergi: " +tax());
        System.out.println("Bonus: " +bonus());
        System.out.println("Maaş artışı: " +raiseSalary());
        int VergiMaas = (salary+bonus())- tax();
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + VergiMaas);
        int ToplamMaas = (salary+bonus()+raiseSalary())- tax();
        System.out.println("Toplam maaş: " + ToplamMaas);
     
      }
    
       
 
    

    /**
     *
     * @param args
     */
    public static void  main(String[] args) {
       
        String ad;
        int maas,calismaSaati,calismaYili;
       
        
        Scanner scan=new Scanner(System.in);
             
        System.out.println("Ad giriniz:");
        ad=scan.nextLine();
        System.out.println("Maas giriniz:");
        maas=scan.nextInt();
        System.out.println("Çalışma saati giriniz:");
        calismaSaati=scan.nextInt();
        System.out.println("Çalışma yılı giriniz:");
        calismaYili=scan.nextInt();
        
        
        Employee employee=new Employee();
        employee.Employee(ad, maas, calismaSaati, calismaYili);
 
        
     
      employee.setName(ad);
      employee.setSalary(maas);
      employee.setworkHours(calismaSaati);
      employee.sethireYear(calismaYili);
      
       employee.toString();


             }
    
 }
    




    
    
    

