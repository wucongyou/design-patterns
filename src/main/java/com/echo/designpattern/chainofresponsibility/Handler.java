package com.echo.designpattern.chainofresponsibility;

/**
 * 抽象处理者
 */
public abstract class Handler {
	protected Handler successor;

	/**
	 * 处理请求的顶层逻辑
	 */
	public boolean handleRequest(Request req) {
		if (this.getHandlerLevel() == req.getRequestLevel()) {
			System.out.print("成功 ：");
			handle(req);
			return true;
		} else {
			if (this.getSuccessor() != null) {
				System.out.print("传递 ：");
				return pass(req);

			} else {
				System.out.print("失败 ：");
				failToHandle(req);
				return false;
			}
		}
	}

	/**
	 * 获得处理者等级
	 */
	public abstract int getHandlerLevel();

	/**
	 * 获得处理者描述
	 */
	public abstract String getHandlerDesc();

	/**
	 * 处理
	 */
	protected void handle(Request req) {
		System.out.println(this.getHandlerDesc() + " 处理了请求 " + req + ".");
	}

	/**
	 * 传递
	 */
	protected boolean pass(Request req) {
		System.out.println(this.getHandlerDesc() + " 将请求 " + req + " 传递给 " + this.getSuccessor().getHandlerDesc());
		return getSuccessor().handleRequest(req);
	}

	/**
	 * 处理失败
	 */
	protected void failToHandle(Request req) {
		System.out.println("职责链上的所有处理者都不能胜任该请求.");
	}

	/**
	 * 获取后继处理器
	 */
	protected Handler getSuccessor() {
		return successor;
	}

	/**
	 * 设置后继处理器
	 */
	protected void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}
