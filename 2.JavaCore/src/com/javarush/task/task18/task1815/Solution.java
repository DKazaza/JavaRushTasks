package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface ti;
        String HeaderText;

        public TableInterfaceWrapper(TableInterface ti) {
            this.ti = ti;
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            ti.setHeaderText(newHeaderText);
        }

        @Override
        public String getHeaderText() {
            return ti.getHeaderText().toUpperCase();
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            ti.setModel(rows);

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}