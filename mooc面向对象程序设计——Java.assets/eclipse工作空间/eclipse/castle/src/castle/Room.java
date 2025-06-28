package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir, Room room) {	//����ڡ�û��s����Ϊ�����赥��
    	exits.put(dir, room);
    }


    @Override
    public String toString()
    {
        return description;
    }
    
    
    //������϶�1����Ҫһ���Է��������Ķ�����
    public String getExitDesc() {	//�����Է���һ�����������ʲô������ַ���
    	// ����StringBuffer����String������ϵͳ������
    	StringBuffer sb = new StringBuffer();	
    	for (String dir : exits.keySet() ) {	//���ڳ���exits��keySet���õ�ÿһ��key
    		sb.append(dir);	//�Ѵ洢��dir���key�ӽ�ȥ
    		sb.append(' ');	//����Ҫ��һ���ո�
    	}
    		sb.append("west ");
    	return sb.toString();
    }
    
    //������϶�2�����Ǹ�Room�Ǳߵõ��������������û�ж���
    //��������ַ���direction����������һ��ʲôRoom��
    public Room getExit(String direction) {	
    	return exits.get(direction);
    }
    
}
