
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Merchant token information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantToken1", propOrder = {
    "tkn",
    "tknXpryDt",
    "tknChrtc",
    "tknRqstr",
    "tknAssrncLvl",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknInittdInd"
})
public class MerchantToken1 {

    @XmlElement(name = "Tkn")
    protected String tkn;
    @XmlElement(name = "TknXpryDt")
    protected String tknXpryDt;
    @XmlElement(name = "TknChrtc")
    protected List<String> tknChrtc;
    @XmlElement(name = "TknRqstr")
    protected PaymentTokenIdentifiers1 tknRqstr;
    @XmlElement(name = "TknAssrncLvl")
    protected BigDecimal tknAssrncLvl;
    @XmlElement(name = "TknAssrncData")
    protected byte[] tknAssrncData;
    @XmlElement(name = "TknAssrncMtd")
    protected String tknAssrncMtd;
    @XmlElement(name = "TknInittdInd")
    protected Boolean tknInittdInd;

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MerchantToken1 setTkn(String value) {
        this.tkn = value;
        return this;
    }

    /**
     * Gets the value of the tknXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknXpryDt() {
        return tknXpryDt;
    }

    /**
     * Sets the value of the tknXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MerchantToken1 setTknXpryDt(String value) {
        this.tknXpryDt = value;
        return this;
    }

    /**
     * Gets the value of the tknChrtc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tknChrtc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTknChrtc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTknChrtc() {
        if (tknChrtc == null) {
            tknChrtc = new ArrayList<String>();
        }
        return this.tknChrtc;
    }

    /**
     * Gets the value of the tknRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public PaymentTokenIdentifiers1 getTknRqstr() {
        return tknRqstr;
    }

    /**
     * Sets the value of the tknRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public MerchantToken1 setTknRqstr(PaymentTokenIdentifiers1 value) {
        this.tknRqstr = value;
        return this;
    }

    /**
     * Gets the value of the tknAssrncLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTknAssrncLvl() {
        return tknAssrncLvl;
    }

    /**
     * Sets the value of the tknAssrncLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MerchantToken1 setTknAssrncLvl(BigDecimal value) {
        this.tknAssrncLvl = value;
        return this;
    }

    /**
     * Gets the value of the tknAssrncData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTknAssrncData() {
        return tknAssrncData;
    }

    /**
     * Sets the value of the tknAssrncData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public MerchantToken1 setTknAssrncData(byte[] value) {
        this.tknAssrncData = value;
        return this;
    }

    /**
     * Gets the value of the tknAssrncMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncMtd() {
        return tknAssrncMtd;
    }

    /**
     * Sets the value of the tknAssrncMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MerchantToken1 setTknAssrncMtd(String value) {
        this.tknAssrncMtd = value;
        return this;
    }

    /**
     * Gets the value of the tknInittdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTknInittdInd() {
        return tknInittdInd;
    }

    /**
     * Sets the value of the tknInittdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MerchantToken1 setTknInittdInd(Boolean value) {
        this.tknInittdInd = value;
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

    /**
     * Adds a new item to the tknChrtc list.
     * @see #getTknChrtc()
     * 
     */
    public MerchantToken1 addTknChrtc(String tknChrtc) {
        getTknChrtc().add(tknChrtc);
        return this;
    }

}
