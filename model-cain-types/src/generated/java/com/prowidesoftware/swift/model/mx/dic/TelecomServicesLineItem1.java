
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Telecom services line item carries detail level telephony billing data. 
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomServicesLineItem1", propOrder = {
    "startDtTm",
    "tmPrd",
    "drtn",
    "callFr",
    "callTo",
    "chrg",
    "ttlTax",
    "ttlAmt",
    "desc",
    "addtlData"
})
public class TelecomServicesLineItem1 {

    @XmlElement(name = "StartDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar startDtTm;
    @XmlElement(name = "TmPrd")
    protected String tmPrd;
    @XmlElement(name = "Drtn", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar drtn;
    @XmlElement(name = "CallFr")
    protected TelecomCallDetails1 callFr;
    @XmlElement(name = "CallTo")
    protected TelecomCallDetails1 callTo;
    @XmlElement(name = "Chrg")
    protected List<Amount11> chrg;
    @XmlElement(name = "TtlTax")
    protected List<Tax33> ttlTax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem1 setStartDtTm(Calendar value) {
        this.startDtTm = value;
        return this;
    }

    /**
     * Gets the value of the tmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmPrd() {
        return tmPrd;
    }

    /**
     * Sets the value of the tmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem1 setTmPrd(String value) {
        this.tmPrd = value;
        return this;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem1 setDrtn(Calendar value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the callFr property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomCallDetails1 }
     *     
     */
    public TelecomCallDetails1 getCallFr() {
        return callFr;
    }

    /**
     * Sets the value of the callFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomCallDetails1 }
     *     
     */
    public TelecomServicesLineItem1 setCallFr(TelecomCallDetails1 value) {
        this.callFr = value;
        return this;
    }

    /**
     * Gets the value of the callTo property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomCallDetails1 }
     *     
     */
    public TelecomCallDetails1 getCallTo() {
        return callTo;
    }

    /**
     * Sets the value of the callTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomCallDetails1 }
     *     
     */
    public TelecomServicesLineItem1 setCallTo(TelecomCallDetails1 value) {
        this.callTo = value;
        return this;
    }

    /**
     * Gets the value of the chrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount11 }
     * 
     * 
     * @return
     *     The value of the chrg property.
     */
    public List<Amount11> getChrg() {
        if (chrg == null) {
            chrg = new ArrayList<>();
        }
        return this.chrg;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax33 }
     * 
     * 
     * @return
     *     The value of the ttlTax property.
     */
    public List<Tax33> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<>();
        }
        return this.ttlTax;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TelecomServicesLineItem1 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesLineItem1 setAddtlData(String value) {
        this.addtlData = value;
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
     * Adds a new item to the chrg list.
     * @see #getChrg()
     * 
     */
    public TelecomServicesLineItem1 addChrg(Amount11 chrg) {
        getChrg().add(chrg);
        return this;
    }

    /**
     * Adds a new item to the ttlTax list.
     * @see #getTtlTax()
     * 
     */
    public TelecomServicesLineItem1 addTtlTax(Tax33 ttlTax) {
        getTtlTax().add(ttlTax);
        return this;
    }

}
