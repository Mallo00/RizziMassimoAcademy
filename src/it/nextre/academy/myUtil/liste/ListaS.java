package it.nextre.academy.myUtil.liste;

public class ListaS {
    private String[] mem;

    public ListaS() {
        mem = new String[0];
    }

    public void add(String s) {
        String[] tmp = new String[mem.length + 1];
        for (int i = 0; i < mem.length; i++) {
            tmp[i] = mem[i];
        }
        tmp[tmp.length - 1] = s;
        mem = tmp;
    }

    public boolean contains(String s) {
        for (int i = 0; i < mem.length; i++) {
            if (mem[i].equals(s))
                return true;
        }
        return false;
    }

    public void clear() {
        mem = new String[0];
    }

    public int getSize() {
        return mem.length;
    }

}//end class