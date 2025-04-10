
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reinvestment information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reinvestment1", propOrder = {
    "fndDtls",
    "reqdNAVCcy",
    "rinvstmtPctg"
})
public class Reinvestment1 {

    @XmlElement(name = "FndDtls", required = true)
    protected FinancialInstrument29 fndDtls;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "RinvstmtPctg", required = true)
    protected BigDecimal rinvstmtPctg;

    /**
     * Gets the value of the fndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument29 }
     *     
     */
    public FinancialInstrument29 getFndDtls() {
        return fndDtls;
    }

    /**
     * Sets the value of the fndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument29 }
     *     
     */
    public Reinvestment1 setFndDtls(FinancialInstrument29 value) {
        this.fndDtls = value;
        return this;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reinvestment1 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRinvstmtPctg() {
        return rinvstmtPctg;
    }

    /**
     * Sets the value of the rinvstmtPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Reinvestment1 setRinvstmtPctg(BigDecimal value) {
        this.rinvstmtPctg = value;
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
