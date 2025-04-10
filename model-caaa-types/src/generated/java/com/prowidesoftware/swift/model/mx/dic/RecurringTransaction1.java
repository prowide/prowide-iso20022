
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
 * Financial loan (instalment) or a recurring transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringTransaction1", propOrder = {
    "seqNb",
    "prdUnit",
    "instlmtPrd",
    "ttlNbOfPmts",
    "intrstChrgs"
})
public class RecurringTransaction1 {

    @XmlElement(name = "SeqNb", required = true)
    protected String seqNb;
    @XmlElement(name = "PrdUnit", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency4Code prdUnit;
    @XmlElement(name = "InstlmtPrd", required = true)
    protected BigDecimal instlmtPrd;
    @XmlElement(name = "TtlNbOfPmts", required = true)
    protected BigDecimal ttlNbOfPmts;
    @XmlElement(name = "IntrstChrgs")
    protected BigDecimal intrstChrgs;

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecurringTransaction1 setSeqNb(String value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the prdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency4Code }
     *     
     */
    public Frequency4Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Sets the value of the prdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency4Code }
     *     
     */
    public RecurringTransaction1 setPrdUnit(Frequency4Code value) {
        this.prdUnit = value;
        return this;
    }

    /**
     * Gets the value of the instlmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstlmtPrd() {
        return instlmtPrd;
    }

    /**
     * Sets the value of the instlmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RecurringTransaction1 setInstlmtPrd(BigDecimal value) {
        this.instlmtPrd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfPmts() {
        return ttlNbOfPmts;
    }

    /**
     * Sets the value of the ttlNbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RecurringTransaction1 setTtlNbOfPmts(BigDecimal value) {
        this.ttlNbOfPmts = value;
        return this;
    }

    /**
     * Gets the value of the intrstChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstChrgs() {
        return intrstChrgs;
    }

    /**
     * Sets the value of the intrstChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RecurringTransaction1 setIntrstChrgs(BigDecimal value) {
        this.intrstChrgs = value;
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
