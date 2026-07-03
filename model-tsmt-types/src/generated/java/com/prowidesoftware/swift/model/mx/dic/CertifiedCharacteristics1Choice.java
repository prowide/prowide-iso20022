
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
 * Characteristics of the goods that are certified, in the context of a commercial trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedCharacteristics1Choice", propOrder = {
    "orgn",
    "qlty",
    "anlys",
    "wght",
    "qty",
    "hlthIndctn",
    "phytosntryIndctn"
})
public class CertifiedCharacteristics1Choice {

    @XmlElement(name = "Orgn")
    protected String orgn;
    @XmlElement(name = "Qlty")
    protected String qlty;
    @XmlElement(name = "Anlys")
    protected String anlys;
    @XmlElement(name = "Wght")
    protected Quantity4 wght;
    @XmlElement(name = "Qty")
    protected Quantity4 qty;
    @XmlElement(name = "HlthIndctn")
    protected Boolean hlthIndctn;
    @XmlElement(name = "PhytosntryIndctn")
    protected Boolean phytosntryIndctn;

    /**
     * Gets the value of the orgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgn() {
        return orgn;
    }

    /**
     * Sets the value of the orgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertifiedCharacteristics1Choice setOrgn(String value) {
        this.orgn = value;
        return this;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertifiedCharacteristics1Choice setQlty(String value) {
        this.qlty = value;
        return this;
    }

    /**
     * Gets the value of the anlys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnlys() {
        return anlys;
    }

    /**
     * Sets the value of the anlys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertifiedCharacteristics1Choice setAnlys(String value) {
        this.anlys = value;
        return this;
    }

    /**
     * Gets the value of the wght property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity4 }
     *     
     */
    public Quantity4 getWght() {
        return wght;
    }

    /**
     * Sets the value of the wght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity4 }
     *     
     */
    public CertifiedCharacteristics1Choice setWght(Quantity4 value) {
        this.wght = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity4 }
     *     
     */
    public Quantity4 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity4 }
     *     
     */
    public CertifiedCharacteristics1Choice setQty(Quantity4 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the hlthIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHlthIndctn() {
        return hlthIndctn;
    }

    /**
     * Sets the value of the hlthIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CertifiedCharacteristics1Choice setHlthIndctn(Boolean value) {
        this.hlthIndctn = value;
        return this;
    }

    /**
     * Gets the value of the phytosntryIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhytosntryIndctn() {
        return phytosntryIndctn;
    }

    /**
     * Sets the value of the phytosntryIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CertifiedCharacteristics1Choice setPhytosntryIndctn(Boolean value) {
        this.phytosntryIndctn = value;
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
