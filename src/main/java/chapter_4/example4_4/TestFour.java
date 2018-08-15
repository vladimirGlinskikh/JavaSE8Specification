package chapter_4.example4_4;

public class TestFour {
        <T extends C & I> void test(T t){
        t.mI();
        t.mCPublic();
        t.mCProtected();
        t.mCPackage();
        //t.mcPrivate();
    }
}