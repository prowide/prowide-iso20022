
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Identifies the original notification item and to provide the status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalItemAndStatus4", propOrder = {
    "orgnlItmId",
    "orgnlEndToEndId",
    "amt",
    "xpctdValDt",
    "itmSts",
    "addtlStsInf",
    "orgnlItmRef"
})
public class OriginalItemAndStatus4 {

    @XmlElement(name = "OrgnlItmId", required = true)
    protected String orgnlItmId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "XpctdValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate xpctdValDt;
    @XmlElement(name = "ItmSts", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationStatus3Code itmSts;
    @XmlElement(name = "AddtlStsInf")
    protected String addtlStsInf;
    @XmlElement(name = "OrgnlItmRef")
    protected OriginalItemReference3 orgnlItmRef;

    /**
     * Gets the value of the orgnlItmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlItmId() {
        return orgnlItmId;
    }

    /**
     * Sets the value of the orgnlItmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalItemAndStatus4 setOrgnlItmId(String value) {
        this.orgnlItmId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalItemAndStatus4 setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public OriginalItemAndStatus4 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Sets the value of the xpctdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalItemAndStatus4 setXpctdValDt(LocalDate value) {
        this.xpctdValDt = value;
        return this;
    }

    /**
     * Gets the value of the itmSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus3Code }
     *     
     */
    public NotificationStatus3Code getItmSts() {
        return itmSts;
    }

    /**
     * Sets the value of the itmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus3Code }
     *     
     */
    public OriginalItemAndStatus4 setItmSts(NotificationStatus3Code value) {
        this.itmSts = value;
        return this;
    }

    /**
     * Gets the value of the addtlStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlStsInf() {
        return addtlStsInf;
    }

    /**
     * Sets the value of the addtlStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalItemAndStatus4 setAddtlStsInf(String value) {
        this.addtlStsInf = value;
        return this;
    }

    /**
     * Gets the value of the orgnlItmRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalItemReference3 }
     *     
     */
    public OriginalItemReference3 getOrgnlItmRef() {
        return orgnlItmRef;
    }

    /**
     * Sets the value of the orgnlItmRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalItemReference3 }
     *     
     */
    public OriginalItemAndStatus4 setOrgnlItmRef(OriginalItemReference3 value) {
        this.orgnlItmRef = value;
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
