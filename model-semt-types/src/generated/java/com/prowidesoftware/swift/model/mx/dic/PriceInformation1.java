
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount of money for which goods or services are offered, sold, or bought.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformation1", propOrder = {
    "val",
    "valTp",
    "tp",
    "srcOfPric",
    "qtnDt",
    "yldd"
})
public class PriceInformation1 {

    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmountOrUnknownChoice val;
    @XmlElement(name = "ValTp")
    @XmlSchemaType(name = "string")
    protected PriceValueType2Code valTp;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfPrice5Code tp;
    @XmlElement(name = "SrcOfPric")
    protected PriceSourceFormatChoice srcOfPric;
    @XmlElement(name = "QtnDt")
    protected DateAndDateTimeChoice qtnDt;
    @XmlElement(name = "Yldd")
    protected Boolean yldd;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountOrUnknownChoice }
     *     
     */
    public PriceRateOrAmountOrUnknownChoice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountOrUnknownChoice }
     *     
     */
    public PriceInformation1 setVal(PriceRateOrAmountOrUnknownChoice value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the valTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType2Code }
     *     
     */
    public PriceValueType2Code getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType2Code }
     *     
     */
    public PriceInformation1 setValTp(PriceValueType2Code value) {
        this.valTp = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice5Code }
     *     
     */
    public TypeOfPrice5Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice5Code }
     *     
     */
    public PriceInformation1 setTp(TypeOfPrice5Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSourceFormatChoice }
     *     
     */
    public PriceSourceFormatChoice getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSourceFormatChoice }
     *     
     */
    public PriceInformation1 setSrcOfPric(PriceSourceFormatChoice value) {
        this.srcOfPric = value;
        return this;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PriceInformation1 setQtnDt(DateAndDateTimeChoice value) {
        this.qtnDt = value;
        return this;
    }

    /**
     * Gets the value of the yldd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYldd() {
        return yldd;
    }

    /**
     * Sets the value of the yldd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PriceInformation1 setYldd(Boolean value) {
        this.yldd = value;
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
