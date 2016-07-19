package com.echo.designpattern.composite;

public class Leaf extends Component {

	@Override
	public void add(Component component) {
	}

	@Override
	public void remove(Component component) {
	}

	@Override
	public void eachChild() {
		System.out.println(name);
	}

	@Override
	protected void eachChild(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println(name);
	}

}
