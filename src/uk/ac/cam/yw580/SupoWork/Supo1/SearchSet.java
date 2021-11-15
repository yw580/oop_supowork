package uk.ac.cam.yw580.SupoWork.Supo1;

public class SearchSet {

    private static class BinaryTreeNode {

        private int mValue;
        private BinaryTreeNode mLeft;
        private BinaryTreeNode mRight;

        public BinaryTreeNode(int n) {
            mValue = n;
        }

        public int getValue() {
            return mValue;
        }

        public void setValue(int n) {
            mValue = n;
        }

        public BinaryTreeNode getLeft() {
            return mLeft;
        }

        public BinaryTreeNode getRight() {
            return mRight;
        }

        public void setLeft(BinaryTreeNode n) {
            mLeft = n;
        }

        public void setRight(BinaryTreeNode n) {
            mRight = n;
        }

    }


    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet() {
        mElements = 0;
        mHead = null;
    }

    public void insert(int n) throws IllegalArgumentException {

        BinaryTreeNode hd = mHead;

        if (hd == null) {
            mHead = new BinaryTreeNode(n);
            mElements++;
            return;
        }

        while (true)
        {
            if (n < hd.getValue()) {
                if (hd.getLeft() == null) {
                    hd.setLeft(new BinaryTreeNode(n));
                    mElements++;
                    return;
                }
                else {
                    hd = hd.getLeft();
                }
            }
            else if (n > hd.getValue()) {
                if (hd.getRight() == null) {
                    hd.setRight(new BinaryTreeNode(n));
                    mElements++;
                    return;
                }
                else {
                    hd = hd.getRight();
                }
            }
            else throw new IllegalArgumentException();
        }

    }

    public int getNumberElements() {
        return mElements;
    }

    public boolean contains(int n) {
        BinaryTreeNode hd = mHead;

        if (hd == null) {
            return false;
        }

        while (true) {
            if (n < hd.getValue()) {
                if (hd.getLeft() == null) {
                    return false;
                } else {
                    hd = hd.getLeft();
                }
            } else if (n > hd.getValue()) {
                if (hd.getRight() == null) {
                    return false;
                } else {
                    hd = hd.getRight();
                }
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        SearchSet s = new SearchSet();
        s.insert(5);
        s.insert(4);
        s.insert(6);
        System.out.println(s.mHead.mValue);
        System.out.println(s.mHead.mLeft.mValue);
        System.out.println(s.mHead.mRight.mValue);
        System.out.println(s.contains(6));
    }
}
