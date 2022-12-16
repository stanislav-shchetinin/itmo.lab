package office;

public class Door implements DoorBehavior {
    private boolean isOpen = false;

    @Override
    public void open(){
        if (!isOpen){
            System.out.println("Дверь открылась");
        }
        isOpen = true;
    }
    @Override
    public void close(){
        if (isOpen){
            System.out.println("Деврь закрылась");
        }
        isOpen = false;
    }
}
