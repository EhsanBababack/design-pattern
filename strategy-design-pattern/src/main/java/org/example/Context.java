package org.example;

import java.util.List;

public class Context {
    Strategy strategy;
    StringBuilder sb = new StringBuilder();

    public Context(OutPutFormat outPutFormat) {
        setOutPutFormat(outPutFormat);
    }

    private void setOutPutFormat(OutPutFormat outPutFormat) {
        switch (outPutFormat) {
            case XML -> strategy = new XmlStrategy();
            case HTML -> strategy = new HtmlStrategy();
        }
    }

    public void appendList(List<String> items) {
        strategy.start(sb);
        for (String item : items) {
            strategy.addListItem(sb, item);
        }
        strategy.end(sb);
    }


    @Override
    public String toString() {
        return sb.toString();
    }
}
