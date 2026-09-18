
abstract class Hayvan {


    public void uyu() {
 System.out.println("Zzzzz... Hayvan uyuyor.");
}
    public abstract void sesCikar();  // her hayvan farklı ses çıkardığından bu her hayvanda olmayan bit özellik olduğu için bu özelliği burada boş bırakıyoruz sonra farklı bir yerde tekrardan değinmek (override) edebilmek için

}




interface EvcilOlma { // bu bir hayvan özelliği ve her hayvanda olmayan bir hayvan özellliği olduğu için interface
  
    public void sevdirKendini(); //  sadece evcil hayvanlar kendini sevdirir bu tüm hayvanlarda olmadığı için bu özelliği burada boş bırakıyoruz sonra farklı bir yerde tekrardan değinmek (override) edebilmek için
  
}




class Kedi extends Hayvan implements EvcilOlma { // kedi hayvan sınıfından türetilen bir hayvandır aynı zamanda özellik olan evcil bir hayvandır 

    
     @Override                  // tekrardan değindiğimiz için burada Override ettik ve birazdan özelliği tanımlayacağız
     public void sesCikar(){    // artık abstract değil kendi nesnesinde olduğu için
        
      System.out.println("miyav");
    
    }
    
     @Override       // tekrardan değindiğimiz için burada Override ettik ve birazdan özelliği tanımlayacağız
     public void sevdirKendini(){
       System.out.println("mrrr....");
    }
}
class Veteriner {
    // 1. GÖREV: Bu metot sadece Kedi değil, TÜM hayvanları kabul etmeli.
    // Parametre kısmındaki boşluğa ne yazmalısın?
    public void muayeneEt(Hayvan h) {
        System.out.println("--- Muayene Odası ---");
        h.sesCikar(); // Gelen hayvan kediyle miyavlar, köpekse havlar!
    }
}




public class Main{
    public static void main (String[] args){
        Veteriner ahmet = new Veteriner();
        Hayvan kedi = new Kedi();
        Kedi tekir = (Kedi)kedi;
      
        tekir.sevdirKendini();
        
        
        
         ahmet.muayeneEt(tekir);  
    }
}