package org.example;

public class XmlStrategy implements Strategy{

    @Override
    public void start(StringBuilder sb) {
        sb.append("<xl>").append(System.lineSeparator());
    }

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("<ml>").append(item).append("</ml>").append(System.lineSeparator());
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</xl>").append(System.lineSeparator());
    }
}
