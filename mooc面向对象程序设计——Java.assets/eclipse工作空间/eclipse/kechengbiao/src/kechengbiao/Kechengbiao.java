package kechengbiao;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

//JTable�����ݲ���
public class Kechengbiao implements TableModel {
	private String[] title = {	//���������ͷ�ģ�������getColumnName�ṩ���ݡ�
			"��һ","�ܶ�","����","����","����","����","����"
	};
	//�������Ǹ�����˽ڿε����ݽṹ��
	//ע������һ�������ߵ����飬ÿһ����Ԫ����һ�������߶���û���������ַ�����������,
	//���Ի���Ҫ��һ��Kechengbiao�Ĺ��캯����
	private String[][] data = new String[8][7];

	public Kechengbiao() { //Kechengbiao�Ĺ��캯��
		//��ʼ������data
		for ( int i=0; i<data.length; i++ ) {
			for ( int j=0; j<data[i].length; j++ ) {
				data[i][j] = ""; //�����鵱�е�ÿһ��ԪԤ�ȵ���һ�����ַ�����
			}
		}
	}
	
	@Override
	// ���ǵı���м��У�eg��8��
	public int getRowCount() {
		return 8;
	}

	@Override
	// ���ǵı���м��У�eg��7�У�7�죩
	public int getColumnCount() {
		return 7;
	}

	@Override
	// ����ÿһ��������ı�ͷ��
	public String getColumnName(int arg0) {
		return title[arg0]; //����title��arg0λ���ϵĶ���
	}

	@Override
	// �������Column��ʲô����������������ÿһ��Column������һ��ʲô���͵����ݡ�
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class; //ÿһ�������ݶ���String
	}

	@Override
	// ÿһ�������ܲ��ܱ༭
	public boolean isCellEditable(int arg0, int arg1) {
		return true;
	}

	@Override
	// ��ȡ����˽ڿε�ֵ
	public Object getValueAt(int arg0, int arg1) {
		return data[arg0][arg1]; //��Ϊ��һ��arg��row���ڶ���arg��column
	}

	@Override
	// ������˽ڿε�ֵ����Ϊ
	public void setValueAt(Object arg0, int arg1, int arg2) {
		data[arg1][arg2] = (String)arg0; //��arg0 cast��String
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
