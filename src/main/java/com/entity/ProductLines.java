package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
@Entity
@Table(name="productlines")
public class ProductLines {
    private String productLine;
    private String textDescription;
    private String htmlDescription;
    private byte[] image;

    @Id
    @Column(name = "productLine", nullable = false)
    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    @Column(name = "textDescription")
    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    @Column(name = "getHtmlDescription")
    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    @Column(name = "textDescription")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
