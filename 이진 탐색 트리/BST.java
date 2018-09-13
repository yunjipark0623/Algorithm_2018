//이진탐색트리 클래스(저장, 삽입, 탐색)
public class BST {
    private setKey root;
    private int cnt = 0;//찾고자 하는 키가 몇 번만에 탐색되었는지 세는 변수

    BST() {
        root = new setKey();
    }

    //데이터 삽입하는 메소드
    public void insertBST(int data) {
        root = insertKey(root, data);
    }

    public setKey insertKey(setKey root, int data) {
        setKey newNode = new setKey(data);

        if (root == null) { return newNode; }
        else if (root.data > newNode.data) {
            root.leftchild = insertKey(root.leftchild, data);
            return root;
        }
        else if (root.data < newNode.data) {
            root.rightchild = insertKey(root.rightchild, data);
            return root;
        }
        else { return root; }
    }

    //탐색하는 메소드
    public boolean search(int val) {
        return search(root, val);
    }

    public boolean search(setKey root, int val) {
        boolean found = false;
        while ((root != null) && !found) {
            int rval = root.getData();
            if (val < rval) {
                cnt++;
                root = root.getLeftchild();
            }
			else if (val > rval) {
                cnt++;
                root = root.getRightchild();
            }
            else {
                found = true;
                break;
            }
            found = search(root, val);
        }
        return found;
    }

    public int getCnt() {
        return cnt;
    }
}
