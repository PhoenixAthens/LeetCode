package May_2023;

public class Design_HashSet {
    class MyHashSet {
        int[] arrMain;
        public MyHashSet() {
            arrMain=new int[256];
        }

        public void add(int key) {
            arrMain[calculatePosition(key)]+=1;
        }

        public void remove(int key) {
            int post=calculatePosition(key);
            if(arrMain[post]==key){
                arrMain[post]=0;
            }
        }

        public boolean contains(int key) {
            return arrMain[calculatePosition(key)] != 0;
        }
        public int calculatePosition(int key){
            int hash = Integer.hashCode(key);
            int post = hash & (this.arrMain.length-1);
            if(post<0) post+= arrMain.length;
            return post;
        }
    }
}
