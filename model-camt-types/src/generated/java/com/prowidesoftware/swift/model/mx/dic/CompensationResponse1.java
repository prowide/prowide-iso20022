
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
 * Specifies whether or not the compensation request is granted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompensationResponse1", propOrder = {
    "grantd",
    "initlAmt",
    "pdChrgs",
    "amtDue",
    "xpctdValDt",
    "prd",
    "intrstRate",
    "rsn"
})
public class CompensationResponse1 {

    @XmlElement(name = "Grantd")
    protected boolean grantd;
    @XmlElement(name = "InitlAmt")
    protected ActiveCurrencyAndAmount initlAmt;
    @XmlElement(name = "PdChrgs")
    protected ActiveCurrencyAndAmount pdChrgs;
    @XmlElement(name = "AmtDue")
    protected ActiveCurrencyAndAmount amtDue;
    @XmlElement(name = "XpctdValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdValDt;
    @XmlElement(name = "Prd")
    protected DatePeriod2 prd;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Gets the value of the grantd property.
     * 
     */
    public boolean isGrantd() {
        return grantd;
    }

    /**
     * Sets the value of the grantd property.
     * 
     */
    public CompensationResponse1 setGrantd(boolean value) {
        this.grantd = value;
        return this;
    }

    /**
     * Gets the value of the initlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInitlAmt() {
        return initlAmt;
    }

    /**
     * Sets the value of the initlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CompensationResponse1 setInitlAmt(ActiveCurrencyAndAmount value) {
        this.initlAmt = value;
        return this;
    }

    /**
     * Gets the value of the pdChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPdChrgs() {
        return pdChrgs;
    }

    /**
     * Sets the value of the pdChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CompensationResponse1 setPdChrgs(ActiveCurrencyAndAmount value) {
        this.pdChrgs = value;
        return this;
    }

    /**
     * Gets the value of the amtDue property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmtDue() {
        return amtDue;
    }

    /**
     * Sets the value of the amtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CompensationResponse1 setAmtDue(ActiveCurrencyAndAmount value) {
        this.amtDue = value;
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
    public XMLGregorianCalendar getXpctdValDt() {
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
    public CompensationResponse1 setXpctdValDt(XMLGregorianCalendar value) {
        this.xpctdValDt = value;
        return this;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public CompensationResponse1 setPrd(DatePeriod2 value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CompensationResponse1 setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CompensationResponse1 setRsn(String value) {
        this.rsn = value;
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
