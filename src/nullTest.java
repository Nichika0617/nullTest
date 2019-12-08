public class nullTest {

    static void nullTest(String str) {
        try{
        System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("エラー(NullPointerException)が発生しました。");
            System.out.println(e.getMessage()); //
        }
    }

    public static void main(String[] args){
        String str = null;
        nullTest(str);
    }
}

