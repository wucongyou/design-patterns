package com.echo.designpattern.abstractfactory;

public class XiaomiMobilePhoneFactory implements IFactory {

	@Override
	public ICPU assembleCPU() {
		return new MtkCPU();
	}

	@Override
	public IScreen assembleScreen() {
		return new SamsungScreen();
	}

}
