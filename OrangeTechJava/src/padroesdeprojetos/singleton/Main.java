package padroesdeprojetos.singleton;

public class Main {

  public static void main(String[] args) {

    SingletonLazy lazy = SingletonLazy.getInstacia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstacia();
    System.out.println(lazy);

    System.out.println("-------------------");

    SingletonEager eager = SingletonEager.getInstacia();
    System.out.println(eager);
    eager = SingletonEager.getInstacia();
    System.out.println(eager);

    System.out.println("-------------------");

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstacia();
    System.out.println(lazyHolder);


  }

}
