
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains financial reconciliation data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialReconcillation1", propOrder = {
    "rcncltnImpct",
    "tp",
    "othrTp",
    "amt",
    "cnt"
})
public class FinancialReconcillation1 {

    @XmlElement(name = "RcncltnImpct", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationImpact1Code rcncltnImpct;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationCategory1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Cnt", required = true)
    protected BigDecimal cnt;

    /**
     * Gets the value of the rcncltnImpct property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationImpact1Code }
     *     
     */
    public ReconciliationImpact1Code getRcncltnImpct() {
        return rcncltnImpct;
    }

    /**
     * Sets the value of the rcncltnImpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationImpact1Code }
     *     
     */
    public FinancialReconcillation1 setRcncltnImpct(ReconciliationImpact1Code value) {
        this.rcncltnImpct = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationCategory1Code }
     *     
     */
    public ReconciliationCategory1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationCategory1Code }
     *     
     */
    public FinancialReconcillation1 setTp(ReconciliationCategory1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialReconcillation1 setOthrTp(String value) {
        this.othrTp = value;
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
    public FinancialReconcillation1 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialReconcillation1 setCnt(BigDecimal value) {
        this.cnt = value;
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
