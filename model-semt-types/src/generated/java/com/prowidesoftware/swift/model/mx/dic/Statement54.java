
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Characteristics of the statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement54", propOrder = {
    "stmtDtOrPrd",
    "frqcy",
    "updTp",
    "stmtBsis",
    "stmtTp"
})
public class Statement54 {

    @XmlElement(name = "StmtDtOrPrd")
    protected DateAndPeriod1Choice stmtDtOrPrd;
    @XmlElement(name = "Frqcy")
    protected Frequency26Choice frqcy;
    @XmlElement(name = "UpdTp")
    protected UpdateType16Choice updTp;
    @XmlElement(name = "StmtBsis")
    protected StatementBasis9Choice stmtBsis;
    @XmlElement(name = "StmtTp")
    protected StatementType6Choice stmtTp;

    /**
     * Gets the value of the stmtDtOrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPeriod1Choice }
     *     
     */
    public DateAndPeriod1Choice getStmtDtOrPrd() {
        return stmtDtOrPrd;
    }

    /**
     * Sets the value of the stmtDtOrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPeriod1Choice }
     *     
     */
    public Statement54 setStmtDtOrPrd(DateAndPeriod1Choice value) {
        this.stmtDtOrPrd = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency26Choice }
     *     
     */
    public Frequency26Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency26Choice }
     *     
     */
    public Statement54 setFrqcy(Frequency26Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType16Choice }
     *     
     */
    public UpdateType16Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType16Choice }
     *     
     */
    public Statement54 setUpdTp(UpdateType16Choice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis9Choice }
     *     
     */
    public StatementBasis9Choice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis9Choice }
     *     
     */
    public Statement54 setStmtBsis(StatementBasis9Choice value) {
        this.stmtBsis = value;
        return this;
    }

    /**
     * Gets the value of the stmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType6Choice }
     *     
     */
    public StatementType6Choice getStmtTp() {
        return stmtTp;
    }

    /**
     * Sets the value of the stmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType6Choice }
     *     
     */
    public Statement54 setStmtTp(StatementType6Choice value) {
        this.stmtTp = value;
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
