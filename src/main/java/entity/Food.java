package entity;

import com.example.demo.model.Flag;

/**
 * 食べ物オブジェクト.
 * @author yoko.
 *
 */
public class Food {

    /** レシピ名. */
    private String name;

    /** 食品フラグ. */
    private Flag isEatable;

    /** 味覚. */
    private String taste;

    /** 食品分類. */
    private String category;

    /**
     * nameを取得する.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * nameを設定する.
     * @param name セットする name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * isEatableを取得する.
     * @return isEatable
     */
    public Flag getIsEatable() {
        return isEatable;
    }

    /**
     * isEatableを設定する.
     * @param isEatable セットする isEatable
     */
    public void setIsEatable(Flag isEatable) {
        this.isEatable = isEatable;
    }

    /**
     * tasteを取得する.
     * @return taste
     */
    public String getTaste() {
        return taste;
    }

    /**
     * tasteを設定する.
     * @param taste セットする taste
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * categoryを取得する.
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * categoryを設定する.
     * @param category セットする category
     */
    public void setCategory(String category) {
        this.category = category;
    }

}
