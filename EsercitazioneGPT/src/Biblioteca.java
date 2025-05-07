public class Biblioteca {
    public class Nodo {
        private Libro data;
        private Nodo next;
        
        public Nodo(Libro lib) {
            this.data = lib;
            this.next = null;
        }
        
    }

    private Nodo testa;

    public Biblioteca() {
        this.testa = null;
    }

    public boolean empty(){return testa==null;}
    public boolean full() {return false;}

    private void push(Libro e) {
        Nodo temp = new Nodo(e);
        temp.next = testa;
        testa = temp;
    }

    private Libro pop() {
        Libro lib = testa.data;
        testa = testa.next;
        return lib;
    }

    
    public void append(Libro i) {
        if (empty()) {
            push(i);
            return;
        }
        Nodo temp = testa;
        while (temp.next != null) {
            temp = temp.next;
        }
        Nodo nuovo = new Nodo(i);
        temp.next = nuovo;
    }

    private boolean inLista(Libro i){
        Nodo temp = testa;
        while(temp != null){
            if(temp.data.equals(i)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void remove(Libro i) throws MiaEccezione {
        if (testa.data.equals(i)) {
            pop();
            return;
        }
        if (!inLista(i)){
            throw new MiaEccezione("Elemento non trovato");
        }
            
        Nodo temp = testa;
        while (temp.next != null && !temp.next.data.equals(i)) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void print() {
        Nodo temp = testa;
        while (temp != null) {
            temp.data.visualizzaInformazioni();
            temp = temp.next;
        }
    }



}
