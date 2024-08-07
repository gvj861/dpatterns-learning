package com.example.springboot.document;

public class SpreadDoc implements Document{

    private String id;
    private String content;

    public SpreadDoc (String id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * @return
     */
    @Override
    public SpreadDoc clone() {
        SpreadDoc clone = null;
        try {
            clone = (SpreadDoc) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return this.id;
    }

    public String getContent() {
        return content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
