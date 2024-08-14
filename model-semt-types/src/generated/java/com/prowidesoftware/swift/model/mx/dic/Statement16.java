
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "Statement16", propOrder = {
    "stmtDtOrPrd",
    "frqcy",
    "updTp",
    "stmtBsis",
    "stmtTp"
})
public class Statement16 {

    @XmlElement(name = "StmtDtOrPrd")
    protected DateAndPeriod1Choice stmtDtOrPrd;
    @XmlElement(name = "Frqcy")
    protected Frequency4Choice frqcy;
    @XmlElement(name = "UpdTp")
    protected UpdateType2Choice updTp;
    @XmlElement(name = "StmtBsis")
    protected StatementBasis3Choice stmtBsis;
    @XmlElement(name = "StmtTp")
    protected StatementType2Choice stmtTp;

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
    public Statement16 setStmtDtOrPrd(DateAndPeriod1Choice value) {
        this.stmtDtOrPrd = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency4Choice }
     *     
     */
    public Frequency4Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency4Choice }
     *     
     */
    public Statement16 setFrqcy(Frequency4Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType2Choice }
     *     
     */
    public UpdateType2Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType2Choice }
     *     
     */
    public Statement16 setUpdTp(UpdateType2Choice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis3Choice }
     *     
     */
    public StatementBasis3Choice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis3Choice }
     *     
     */
    public Statement16 setStmtBsis(StatementBasis3Choice value) {
        this.stmtBsis = value;
        return this;
    }

    /**
     * Gets the value of the stmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType2Choice }
     *     
     */
    public StatementType2Choice getStmtTp() {
        return stmtTp;
    }

    /**
     * Sets the value of the stmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType2Choice }
     *     
     */
    public Statement16 setStmtTp(StatementType2Choice value) {
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
