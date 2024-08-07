package com.example.springboot.document;

public class TextDoc implements Document{

    private String id;
    private String content;

    public TextDoc (String id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * @return
     */
    @Override
    public TextDoc clone() {
        TextDoc clone = null;
        try {
            clone = (TextDoc) super.clone();
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
