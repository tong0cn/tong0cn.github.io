package kechengbiao;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

//JTable的数据部分
public class Kechengbiao implements TableModel {
	private String[] title = {	//用来储存表头的，用来给getColumnName提供数据。
			"周一","周二","周三","周四","周五","周六","周日"
	};
	//真正放那个七天八节课的数据结构：
	//注意这是一个管理者的数组，每一个单元都是一个管理者而并没有真正的字符串在这里面,
	//所以还需要有一个Kechengbiao的构造函数。
	private String[][] data = new String[8][7];

	public Kechengbiao() { //Kechengbiao的构造函数
		//初始化数组data
		for ( int i=0; i<data.length; i++ ) {
			for ( int j=0; j<data[i].length; j++ ) {
				data[i][j] = ""; //让数组当中的每一单元预先等于一个空字符串。
			}
		}
	}
	
	@Override
	// 我们的表格有几行？eg：8行
	public int getRowCount() {
		return 8;
	}

	@Override
	// 我们的表格有几列？eg：7列（7天）
	public int getColumnCount() {
		return 7;
	}

	@Override
	// 返回每一个列上面的表头的
	public String getColumnName(int arg0) {
		return title[arg0]; //返回title的arg0位置上的东西
	}

	@Override
	// 关于这个Column是什么东西。返回我现在每一个Column上面是一种什么类型的数据。
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class; //每一个的数据都是String
	}

	@Override
	// 每一个格子能不能编辑
	public boolean isCellEditable(int arg0, int arg1) {
		return true;
	}

	@Override
	// 获取七天八节课的值
	public Object getValueAt(int arg0, int arg1) {
		return data[arg0][arg1]; //因为第一个arg是row，第二个arg是column
	}

	@Override
	// 将七天八节课的值设置为
	public void setValueAt(Object arg0, int arg1, int arg2) {
		data[arg1][arg2] = (String)arg0; //把arg0 cast成String
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
