package com.echo.designpattern.chainofresponsibility;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午10:16
 */
public class Response {

    private Type type;
    private String message;

    public Response(Type type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
            "type=" + type +
            ", message='" + message + '\'' +
            '}';
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public enum Type {
        HANDLED(1, "handled"),
        PERMISSION_DENIED(2, "permission denied"),;
        int code;
        String desc;

        Type(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "Type{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
        }
    }
}
