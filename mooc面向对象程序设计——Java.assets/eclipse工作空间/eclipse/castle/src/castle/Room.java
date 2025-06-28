package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir, Room room) {	//设出口。没有s是因为这是设单个
    	exits.put(dir, room);
    }


    @Override
    public String toString()
    {
        return description;
    }
    
    
    //降低耦合度1：需要一个对房间描述的东西。
    public String getExitDesc() {	//它可以返回一个表达现在有什么房间的字符串
    	// 改用StringBuffer而非String来减少系统开销。
    	StringBuffer sb = new StringBuffer();	
    	for (String dir : exits.keySet() ) {	//对于出口exits的keySet，拿到每一个key
    		sb.append(dir);	//把存储在dir里的key加进去
    		sb.append(' ');	//还需要加一个空格
    	}
    		sb.append("west ");
    	return sb.toString();
    }
    
    //降低耦合度2：从那个Room那边得到这个方向上面有没有东西
    //根据这个字符串direction决定：返回一个什么Room。
    public Room getExit(String direction) {	
    	return exits.get(direction);
    }
    
}
