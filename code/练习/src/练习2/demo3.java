package 练习2;

public class demo3 {
	public int getVal(int iRecordNum,int IType) {
		int x=0,y=0;
		while(iRecordNum-- > 0) {
			if(IType == 0) {
				x=y+2;
			}else {
				if(IType == 1) {
					x=y+10;
				}else {
					x=y+20;
				}
			}
		}
		return x;
	}
}
