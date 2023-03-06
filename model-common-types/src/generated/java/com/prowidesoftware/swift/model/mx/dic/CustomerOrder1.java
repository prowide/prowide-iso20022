
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Customer order attached to a customer, recorded in the POI system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrder1", propOrder = {
    "cstmrOrdrId",
    "saleRefId",
    "opnOrdrStat",
    "startDt",
    "endDt",
    "unit",
    "frcstdAmt",
    "curAmt",
    "ccy",
    "accsdBy",
    "addtlInf"
})
public class CustomerOrder1 {

    @XmlElement(name = "CstmrOrdrId", required = true)
    protected String cstmrOrdrId;
    @XmlElement(name = "SaleRefId", required = true)
    protected String saleRefId;
    @XmlElement(name = "OpnOrdrStat")
    protected Boolean opnOrdrStat;
    @XmlElement(name = "StartDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "Unit")
    @XmlSchemaType(name = "string")
    protected AmountUnit1Code unit;
    @XmlElement(name = "FrcstdAmt", required = true)
    protected BigDecimal frcstdAmt;
    @XmlElement(name = "CurAmt")
    protected BigDecimal curAmt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "AccsdBy")
    protected String accsdBy;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the cstmrOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrOrdrId() {
        return cstmrOrdrId;
    }

    /**
     * Sets the value of the cstmrOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerOrder1 setCstmrOrdrId(String value) {
        this.cstmrOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerOrder1 setSaleRefId(String value) {
        this.saleRefId = value;
        return this;
    }

    /**
     * Gets the value of the opnOrdrStat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnOrdrStat() {
        return opnOrdrStat;
    }

    /**
     * Sets the value of the opnOrdrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CustomerOrder1 setOpnOrdrStat(Boolean value) {
        this.opnOrdrStat = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerOrder1 setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerOrder1 setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
        return this;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountUnit1Code }
     *     
     */
    public AmountUnit1Code getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountUnit1Code }
     *     
     */
    public CustomerOrder1 setUnit(AmountUnit1Code value) {
        this.unit = value;
        return this;
    }

    /**
     * Gets the value of the frcstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrcstdAmt() {
        return frcstdAmt;
    }

    /**
     * Sets the value of the frcstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerOrder1 setFrcstdAmt(BigDecimal value) {
        this.frcstdAmt = value;
        return this;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerOrder1 setCurAmt(BigDecimal value) {
        this.curAmt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerOrder1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the accsdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccsdBy() {
        return accsdBy;
    }

    /**
     * Sets the value of the accsdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerOrder1 setAccsdBy(String value) {
        this.accsdBy = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerOrder1 setAddtlInf(String value) {
        this.addtlInf = value;
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
