
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Goods or services that are part of a commercial trade agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportedGoods1", propOrder = {
    "purchsOrdrRef",
    "goodsDesc",
    "buyrDfndInf",
    "sellrDfndInf"
})
public class TransportedGoods1 {

    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "GoodsDesc")
    protected String goodsDesc;
    @XmlElement(name = "BuyrDfndInf")
    protected List<UserDefinedInformation1> buyrDfndInf;
    @XmlElement(name = "SellrDfndInf")
    protected List<UserDefinedInformation1> sellrDfndInf;

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public TransportedGoods1 setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
        return this;
    }

    /**
     * Gets the value of the goodsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * Sets the value of the goodsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportedGoods1 setGoodsDesc(String value) {
        this.goodsDesc = value;
        return this;
    }

    /**
     * Gets the value of the buyrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the buyrDfndInf property.
     */
    public List<UserDefinedInformation1> getBuyrDfndInf() {
        if (buyrDfndInf == null) {
            buyrDfndInf = new ArrayList<>();
        }
        return this.buyrDfndInf;
    }

    /**
     * Gets the value of the sellrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the sellrDfndInf property.
     */
    public List<UserDefinedInformation1> getSellrDfndInf() {
        if (sellrDfndInf == null) {
            sellrDfndInf = new ArrayList<>();
        }
        return this.sellrDfndInf;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the buyrDfndInf list.
     * @see #getBuyrDfndInf()
     * 
     */
    public TransportedGoods1 addBuyrDfndInf(UserDefinedInformation1 buyrDfndInf) {
        getBuyrDfndInf().add(buyrDfndInf);
        return this;
    }

    /**
     * Adds a new item to the sellrDfndInf list.
     * @see #getSellrDfndInf()
     * 
     */
    public TransportedGoods1 addSellrDfndInf(UserDefinedInformation1 sellrDfndInf) {
        getSellrDfndInf().add(sellrDfndInf);
        return this;
    }

}
