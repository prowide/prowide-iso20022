
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
 * Choice to define the price of the securities transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice20Choice", propOrder = {
    "mntryVal",
    "pctg",
    "dcml",
    "bsisPtSprd"
})
public class SecuritiesTransactionPrice20Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection106 mntryVal;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Dcml")
    protected BigDecimal dcml;
    @XmlElement(name = "BsisPtSprd")
    protected BigDecimal bsisPtSprd;

    /**
     * Gets the value of the mntryVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getMntryVal() {
        return mntryVal;
    }

    /**
     * Sets the value of the mntryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public SecuritiesTransactionPrice20Choice setMntryVal(AmountAndDirection106 value) {
        this.mntryVal = value;
        return this;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTransactionPrice20Choice setPctg(BigDecimal value) {
        this.pctg = value;
        return this;
    }

    /**
     * Gets the value of the dcml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcml() {
        return dcml;
    }

    /**
     * Sets the value of the dcml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTransactionPrice20Choice setDcml(BigDecimal value) {
        this.dcml = value;
        return this;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTransactionPrice20Choice setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
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
