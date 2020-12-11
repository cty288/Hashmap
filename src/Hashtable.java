public class Hashtable {
    private int size;
    private DataItem[] hashArray;

    public Hashtable(int size){
        this.size=size;
        hashArray=new DataItem[size];
    }

    public void display(){
        for(int i=0; i<hashArray.length;i++){
            if(hashArray[i]!=null){
                System.out.print(hashArray[i].getData());
            }
            System.out.print(" | ");
        }
        System.out.println();
    }

    //hash function is key % size
    private int hash(DataItem data){
        return data.getData() % size;
    }

    public void insert(int data){
        DataItem newItem=new DataItem(data);
        int position = hash(newItem);
        int count=0;
        while(true){
            if(count==size){
                System.out.println("The hashtable is full!");
                break;
            }
            if(hashArray[position]==null){
                hashArray[position]=newItem;
                break;
            }
            position=(position+1)%size;
            count++;
        }
    }

    public DataItem search(int data){
        int count=0;
        int position=hash(new DataItem(data));
        while(true){
            if(count==size || hashArray[position]==null){
                System.out.println("Unable to find the item");
                return null;
            }
            if(hashArray[position].getData()==data){
                return hashArray[position];
            }
            position=(position+1)%size;
            count++;
        }
    }

    public DataItem delete(int data){
        int count=0;
        int position=hash(new DataItem(data));
        while(true){
            if(count==size || hashArray[position]==null){
                return null;
            }
            if(hashArray[position].getData()==data){
                DataItem temp= new DataItem(hashArray[position].getData());
                hashArray[position]=null;
                return temp;
            }
            position=(position+1)%size;
            count++;
        }
    }
}
