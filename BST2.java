//insertion in BST using iteration
import java.util.Scanner;

class Tree3 {
    BST root=null;
    public  void insert(int data)
    {

        BST t1=new BST(data);
        if(root==null)
        {
            root=t1;
            return;
        }
        else{
            BST temp=root;
            while(true) {
                if (data < temp.data) {
                    if (temp.left==null)
                    {
                        temp.left=t1;
                        return;
                    }
                    temp=temp.left;
                }
                else if(data>temp.data)
                {
                    if(temp.right==null)
                    {
                        temp.right=t1;
                        return;
                    }
                    temp=temp.right;
                }
            }
        }
    }

    public  void Print(BST root)
    {
        if(root==null)
            return;
        System.out.println(root.data+" ");
        Print(root.left);
        Print(root.right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tree3 obj1=new Tree3();
        obj1.insert(sc.nextInt());
        obj1.insert(sc.nextInt());
        obj1.insert(sc.nextInt());
        obj1.insert(sc.nextInt());
        obj1.insert(sc.nextInt());
        obj1.Print(obj1.root);

    }
}
class BST
{
    int data;
    BST left;
    BST right;
    public BST(int data)
    {
        this.data=data;
    }
}

