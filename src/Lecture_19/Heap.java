package Lecture_19;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
	ArrayList<T> data;
	boolean isMin;

	Heap() {
		this(false);
	}

	Heap(T[] items, boolean isMin) {
		this(isMin);
		for (T item : items) {
			this.data.add(item);
		}

		for (int i = this.data.size() / 2 - 1; i >= 0; i--) {
			this.downHeapify(i);
		}
	}

	Heap(boolean isMin) {
		this.isMin = isMin;
		this.data = new ArrayList<>();
	}

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public T getMP() {
		return this.data.get(0);
	}

	public void add(T item) {
		this.data.add(item);
		this.upheapify(this.data.size() - 1);
	}

	private void upheapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) / 2;
		if (!isLarger(pi, ci)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	public void display() {
		this.display(0);
	}

	private void display(int idx) {
		int lci = 2 * idx + 1;
		int rci = 2 * idx + 2;
		T node = this.data.get(idx);
		String str = "";
		if (lci < this.data.size()) {
			T lc = this.data.get(lci);
			str += lc + "=>";
		} else {
			str += "END=>";
		}
		str = str + node;
		if (rci < this.data.size()) {
			T rc = this.data.get(rci);
			str = str + "<=" + rc;
		} else {
			str = str + "<=END";
		}

		System.out.println(str);
		if (lci < this.data.size()) {
			this.display(lci);
		}
		if (rci < this.data.size()) {
			this.display(rci);
		}
	}

	private void swap(int i, int j) {
		T temp = this.data.get(i);
		this.data.set(i, this.data.get(j));
		this.data.set(j, temp);
	}

	private boolean isLarger(int i, int j) {
		T ithitem = this.data.get(i);
		T jthitem = this.data.get(j);
		if (isMin) {
			return ithitem.compareTo(jthitem) < 0;
		} else {
			return ithitem.compareTo(jthitem) > 0;
		}
	}

	public T remove() {
		T rv = this.data.get(0);
		this.swap(0, this.data.size() - 1);
		this.data.remove(this.data.size() - 1);
		this.downHeapify(0);
		return rv;
	}

	private void downHeapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mi = pi;
		if (lci < this.data.size() && isLarger(lci, mi)) {
			mi = lci;
		}

		if (rci < this.data.size() && isLarger(rci, mi)) {
			mi = rci;
		}

		if (mi != pi) {
			this.swap(mi, pi);
			this.downHeapify(mi);
		}
	}

}

