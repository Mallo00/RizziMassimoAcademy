package it.nextre.academy.myUtil;
public class ListaI {
    int [] mem;
    public ListaI(){
        mem=new int [0];
    }
    public void add(int s){
        int [] tmp= new int [mem.length+1];
        for (int i = 0; i < mem.length; i++) {
            tmp[i]=mem[i];
        }
        tmp[tmp.length-1]=s;
        mem=tmp;
    }
    public boolean contains(int s){
        for (int i = 0; i<mem.length; i++) {
            if(mem[i]==s)
                return true;
        }
        return false;
    }
    public void clear() {
        mem=new int [0];
    }
}//end class