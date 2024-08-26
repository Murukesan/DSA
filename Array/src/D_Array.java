public class D_Array {
    private  int[] items;
    private int count;
    public D_Array(int length){
        items=new int[length];
    }
    public void print(){
        for(int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int item){
        //If array is full need to double the size
        if(items.length==count){
            int[] new_items=new int[count*2];
            for(int i=0;i<count;i++){
                new_items[i]=items[i];
            }
            items=new_items;
        }
        //Insert at the end
        items[count++]=item;


    }
    public  void removeAt(int index){
        //Validate the index
        if(index <0 || index>=count) {
            throw new IllegalArgumentException();
        }
        //shift the values
        //[10,20,30,40] remove 20 -> [10,30,40]
        for(int i=index;i<count;i++){
            items[i]=items[i+1];
        }
        count--;
    }
    public int indexOf(int item){
        for(int i=0;i<count;i++){
            if(items[i]==item){
                return i;
            }
        }
        return -1;
    }
}
