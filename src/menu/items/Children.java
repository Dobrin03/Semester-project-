package menu.items;

import main_class.MainTag;
import menu.program_actions.GetChildren;

import java.util.Scanner;

public class Children implements Action {
    @Override
    public void action(MainTag mainTag, String[] data){
        if(data.length==2) {
            GetChildren getChildren=new GetChildren();
            String id=data[1];


            System.out.println(getChildren.action(mainTag, id).toString()+'\n');
        }
        else{
            System.out.println("Невалидни данни за команда "+data[0]+"\n");
        }
    }
}
