package com.echo.designpattern.behavioral.chainofresponsibility;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午10:21
 */
public abstract class AbstractHandler {

    protected Request.Level level;
    protected AbstractHandler successor;

    public Request.Level getLevel() {
        return level;
    }

    public void setLevel(Request.Level level) {
        this.level = level;
    }

    protected AbstractHandler getSuccessor() {
        return successor;
    }

    protected AbstractHandler setSuccessor(AbstractHandler successor) {
        this.successor = successor;
        return successor;
    }

    protected Response handle(Request req) {
        if (level == req.getLevel()) {
            return new Response(Response.Type.HANDLED, this.getClass().getSimpleName() + " handled req: " + req);
        }
        return getSuccessor() == null ? new Response(Response.Type.PERMISSION_DENIED, "no successor")
            : getSuccessor().handle(req);
    }
}
