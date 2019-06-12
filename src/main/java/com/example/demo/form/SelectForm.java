package com.example.demo.form;

import java.util.List;

public class SelectForm {

    /** selectList 食べ物の選択肢リスト. */
    private List<String> selectList;

    /**
     * selectListを取得する.
     * @return selectList
     */
    public List<String> getSelectList() {
        return selectList;
    }

    /**
     * selectListを設定する.
     * @param selectList セットする selectList
     */
    public void setSelectList(List<String> selectList) {
        this.selectList = selectList;
    }
    
}
