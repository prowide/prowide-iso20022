
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
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
 * Provides details on the tranches defined for the loan contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContractTranche1", propOrder = {
    "trchNb",
    "xpctdDt",
    "amt",
    "dueDt",
    "drtnCd",
    "lastTrchInd"
})
public class LoanContractTranche1 {

    @XmlElement(name = "TrchNb", required = true)
    protected BigDecimal trchNb;
    @XmlElement(name = "XpctdDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar xpctdDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar dueDt;
    @XmlElement(name = "DrtnCd")
    protected String drtnCd;
    @XmlElement(name = "LastTrchInd")
    protected Boolean lastTrchInd;

    /**
     * Gets the value of the trchNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrchNb() {
        return trchNb;
    }

    /**
     * Sets the value of the trchNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoanContractTranche1 setTrchNb(BigDecimal value) {
        this.trchNb = value;
        return this;
    }

    /**
     * Gets the value of the xpctdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getXpctdDt() {
        return xpctdDt;
    }

    /**
     * Sets the value of the xpctdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanContractTranche1 setXpctdDt(Calendar value) {
        this.xpctdDt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public LoanContractTranche1 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanContractTranche1 setDueDt(Calendar value) {
        this.dueDt = value;
        return this;
    }

    /**
     * Gets the value of the drtnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtnCd() {
        return drtnCd;
    }

    /**
     * Sets the value of the drtnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanContractTranche1 setDrtnCd(String value) {
        this.drtnCd = value;
        return this;
    }

    /**
     * Gets the value of the lastTrchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastTrchInd() {
        return lastTrchInd;
    }

    /**
     * Sets the value of the lastTrchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LoanContractTranche1 setLastTrchInd(Boolean value) {
        this.lastTrchInd = value;
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
