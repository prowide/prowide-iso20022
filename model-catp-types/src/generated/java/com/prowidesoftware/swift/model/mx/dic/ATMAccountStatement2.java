
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Statement information of an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMAccountStatement2", propOrder = {
    "txDt",
    "valDt",
    "shrtTxt",
    "cdtTx",
    "amt",
    "ccy",
    "lngTxt"
})
public class ATMAccountStatement2 {

    @XmlElement(name = "TxDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txDt;
    @XmlElement(name = "ValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "ShrtTxt")
    protected String shrtTxt;
    @XmlElement(name = "CdtTx")
    protected Boolean cdtTx;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "LngTxt")
    protected String lngTxt;

    /**
     * Gets the value of the txDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTxDt() {
        return txDt;
    }

    /**
     * Sets the value of the txDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMAccountStatement2 setTxDt(XMLGregorianCalendar value) {
        this.txDt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMAccountStatement2 setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the shrtTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtTxt() {
        return shrtTxt;
    }

    /**
     * Sets the value of the shrtTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMAccountStatement2 setShrtTxt(String value) {
        this.shrtTxt = value;
        return this;
    }

    /**
     * Gets the value of the cdtTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtTx() {
        return cdtTx;
    }

    /**
     * Sets the value of the cdtTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMAccountStatement2 setCdtTx(Boolean value) {
        this.cdtTx = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMAccountStatement2 setAmt(BigDecimal value) {
        this.amt = value;
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
    public ATMAccountStatement2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the lngTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngTxt() {
        return lngTxt;
    }

    /**
     * Sets the value of the lngTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMAccountStatement2 setLngTxt(String value) {
        this.lngTxt = value;
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
