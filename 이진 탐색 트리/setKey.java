//데이터 set하는 클래스
public class setKey {
    int data;
    setKey leftchild, rightchild;

    setKey() {
        leftchild = null;
        rightchild = null;
    }

    //d라는 데이터가 들어온 순간
    public setKey(int d) {
        data = d;
        leftchild = null;
        rightchild = null;
    }

    public int getData() {
        return data;
    }

    //왼쪽 자식 set
    public void setLeftchild(setKey d) {
        leftchild = d;
    }

    //오른쪽 자식 set
    public void setRightchild(setKey d) {
        rightchild = d;
    }

    //왼쪽 자식 get(반환)
    public setKey getLeftchild() {
        return leftchild;
    }

    //오른쪽 자식 get(반환)
    public setKey getRightchild() {
        return rightchild;
    }
}
