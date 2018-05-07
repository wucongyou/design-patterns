package com.wucongyou.designpattern.behavioral.chainofresponsibility;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午10:16
 */
public class Request {

    private Level level;
    private String content;

    public Request(Level level, String content) {
        this.level = level;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Request{" +
            "level=" + level +
            ", content='" + content + '\'' +
            '}';
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public enum Level {
        LOW(1, "low"),
        MIDDLE(2, "middle"),
        HIGH(3, "high"),;
        int value;
        String desc;

        Level(int value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "Level{" +
                "value=" + value +
                ", desc='" + desc + '\'' +
                '}';
        }
    }
}
