package day04;
/**
 *	该类用于测试向集合类存入的数据
 */
public class Element {
	private int row;
	private int col;
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	public String toString(){
		return row+","+col;
	}
//	public boolean equals(Object o){
//		if(o==null){
//			return false;
//		}
//		if(o==this){
//			return true;
//		}
//		if(o instanceof Element){
//			Element e=(Element)o;
//			return e.row==this.row&&e.col==this.col;
//		}else {
//			return false;
//		}
//	}
}
