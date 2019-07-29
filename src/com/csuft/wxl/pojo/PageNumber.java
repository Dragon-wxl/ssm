package com.csuft.wxl.pojo;

public class PageNumber {
	int start=0;
    int count = 10;
    int last = 0;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
    public void next(int all) {
		if (0==all%count) {
			last=all-count;
		}else {
			last=all-all%count;
		}
	}
}
