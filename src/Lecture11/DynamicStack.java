package Lecture11;

import Lecture10.StacksWithArrays;

public class DynamicStack extends StacksWithArrays {

	public DynamicStack() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public DynamicStack(int capacity) throws Exception {
		super(capacity);
	}

	public void push(int item) throws Exception {
		if (this.tos == this.data.length - 1) {
			int[] arr = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
		}
		super.push(item);
	}

	public int pop() throws Exception {
		if (this.size() == this.data.length / 4) {
			int[] arr = new int[this.data.length / 2];
			for (int i = 0; i <= this.size() - 1; i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
		}
		return super.pop();
	}

}
