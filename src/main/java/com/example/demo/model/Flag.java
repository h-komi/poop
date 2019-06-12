package com.example.demo.model;

public enum Flag {

    ON(0),
    OFF(1);

    private int code;

    private Flag(int code) {
        this.code = code;
    }

    /**
     * codeを取得する.
     * @return code
     */
    public int getCode() {
        return code;
    }
}
