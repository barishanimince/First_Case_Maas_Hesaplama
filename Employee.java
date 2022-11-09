package Employee;



import java.util.Scanner;





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
   
   


    public String getAd() {
        return name;
    }

    public void setAd(String name) {
        this.name = name;
    }

    public int getMaas() {
        return salary;
    }

    public void setMaas(int salary) {
        this.salary = salary;
    }

    public int getCalismaSaati() {
        return workHours;
    }

    public void setCalismaSaati(int workHours) {
        this.workHours = workHours;
    }

    public int getİseGiris() {
        return hireYear;
    }

    public void setİseGiris(int hireYear) {
        this.hireYear = hireYear;
    }

   int vergi=0;
   int bonus = 0;
   int maasSon = 0;
   
    public int tax(){
        
        if(salary>=1000){
 
            vergi=(int) (salary * 3/100) ;
            return vergi;
        }
        else {
           
            return vergi;
        }

    }
    
   
    
       public int  raiseSalary(){
       
      
        if(2021-hireYear<10){
            maasSon=(int) (salary*5/100);   
        }
        else if((2021-hireYear)>9 && (2021-hireYear)<20){
            maasSon=(int) (salary*10/100);  
        }
        else if((2021-hireYear)>19){
           maasSon=(int) (salary*15/100);
        }
        else{
            return maasSon;
        }
    return maasSon;
    }
  

         
    public int bonus(){
   
        if(workHours>40){
            bonus=(workHours-40)*(30);   
            return bonus;
        }
        else {
            return bonus;
        }

    }
       
 

    public static void  main(String[] args) {
          
        String ad;
        int maas;
        int calismaSaati;
        int calismaYili;
       
        
        Scanner toString=new Scanner(System.in);
             
        System.out.println("Adınız = ");
        ad=toString.next();
        System.out.println("Maaşınız = ");
        maas=toString.nextInt();
        System.out.println("Çalışma saatiniz = ");
        calismaSaati=toString.nextInt();
        System.out.println("İşe giriş yılınız = ");
        calismaYili=toString.nextInt();
   
      Employee calisan=new Employee();
      calisan.Employee(ad, maas, calismaSaati, calismaYili);
      calisan.setAd(ad);
      calisan.setMaas(maas);
      calisan.setCalismaSaati(calismaSaati);
      calisan.setİseGiris(calismaYili);
      int Maas1 = (maas+calisan.bonus())- calisan.tax();
      int Maas2 = (maas+calisan.bonus()+calisan.raiseSalary())- calisan.tax();
      
        System.out.println("----Sonuclar-----");
        System.out.println("İsim= " +ad);
        System.out.println("Maaş= " +maas);
        System.out.println("Çalışma saati= "+calismaSaati);
        System.out.println("İşe Başlangıç Yılı= "+calismaYili);
        System.out.println("Vergi miktarı= " +calisan.tax());
        System.out.println("Bonus= " +calisan.bonus());
        System.out.println("Maaş artışı= " +calisan.raiseSalary());
        System.out.println("Toplam maaş= " + Maas2);
        System.out.println("Vergi ve bonuslarla birlikte maaş= " + Maas1);
        


             }
    
 }
    
    
    
    

