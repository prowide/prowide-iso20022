
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Complete name of the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderName1", propOrder = {
    "nm",
    "gvnNm",
    "mddlInitls",
    "lastNm"
})
public class CardholderName1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlInitls")
    protected String mddlInitls;
    @XmlElement(name = "LastNm")
    protected String lastNm;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderName1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderName1 setGvnNm(String value) {
        this.gvnNm = value;
        return this;
    }

    /**
     * Gets the value of the mddlInitls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlInitls() {
        return mddlInitls;
    }

    /**
     * Sets the value of the mddlInitls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderName1 setMddlInitls(String value) {
        this.mddlInitls = value;
        return this;
    }

    /**
     * Gets the value of the lastNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNm() {
        return lastNm;
    }

    /**
     * Sets the value of the lastNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderName1 setLastNm(String value) {
        this.lastNm = value;
        return this;
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

}
