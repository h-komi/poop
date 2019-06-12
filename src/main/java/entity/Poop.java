package entity;

/**
 * うんちオブジェクト.
 * @author yoko.
 *
 */
public class Poop {
    
    /** code コード. */
    private String code;
    /** name 名前. */
    private String name;
    /** detail 説明文. */
    private String detail;

    /**
     * コンストラクター.
     * @param name 名前
     */
    public Poop(String name) {
        this.name = name;
    }

    /**
     * コードを取得する.
     * @return コード
     */
    public String getCode() {
        return code;
    }

    /**
     * コードを設定する.
     * @param code コード
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 名前を取得する.
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 名前を設定する.
     * @param name 名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 説明文を取得する.
     * @return 説明文
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 説明文を取得する.
     * @param detail 説明文
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }


}
