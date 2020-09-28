
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Return provided by a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldCalculation1", propOrder = {
    "val",
    "clctnTp",
    "redPric",
    "valDtTm",
    "valPrd",
    "clctnDt"
})
public class YieldCalculation1 {

    @XmlElement(name = "Val", required = true)
    protected BigDecimal val;
    @XmlElement(name = "ClctnTp")
    @XmlSchemaType(name = "string")
    protected CalculationType1Code clctnTp;
    @XmlElement(name = "RedPric")
    protected Price1 redPric;
    @XmlElement(name = "ValDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valDtTm;
    @XmlElement(name = "ValPrd", required = true)
    protected DateTimePeriodChoice valPrd;
    @XmlElement(name = "ClctnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clctnDt;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public YieldCalculation1 setVal(BigDecimal value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the clctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationType1Code }
     *     
     */
    public CalculationType1Code getClctnTp() {
        return clctnTp;
    }

    /**
     * Sets the value of the clctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationType1Code }
     *     
     */
    public YieldCalculation1 setClctnTp(CalculationType1Code value) {
        this.clctnTp = value;
        return this;
    }

    /**
     * Gets the value of the redPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getRedPric() {
        return redPric;
    }

    /**
     * Sets the value of the redPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public YieldCalculation1 setRedPric(Price1 value) {
        this.redPric = value;
        return this;
    }

    /**
     * Gets the value of the valDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDtTm() {
        return valDtTm;
    }

    /**
     * Sets the value of the valDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public YieldCalculation1 setValDtTm(XMLGregorianCalendar value) {
        this.valDtTm = value;
        return this;
    }

    /**
     * Gets the value of the valPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getValPrd() {
        return valPrd;
    }

    /**
     * Sets the value of the valPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public YieldCalculation1 setValPrd(DateTimePeriodChoice value) {
        this.valPrd = value;
        return this;
    }

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public YieldCalculation1 setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
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
