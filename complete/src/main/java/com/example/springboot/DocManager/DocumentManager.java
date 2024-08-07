package com.example.springboot.DocManager;

import com.example.springboot.document.Document;
import com.example.springboot.document.SpreadDoc;
import com.example.springboot.document.TextDoc;

import java.util.*;

public class DocumentManager {

    private Map<String, Document> prototypes = new HashMap<>();

    public DocumentManager() {
        prototypes.put("text", new TextDoc("111","Hey text"));
        prototypes.put("spreadsheet", new SpreadDoc("112","hey spread"));
    }

    public Document createDocument(String type) {
        return prototypes.get(type).clone();
    }

}
