
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
@XmlType(name = "Statement29", propOrder = {
    "stmtDtOrPrd",
    "frqcy",
    "updTp",
    "stmtBsis",
    "stmtTp"
})
public class Statement29 {

    @XmlElement(name = "StmtDtOrPrd")
    protected DateAndPeriod1Choice stmtDtOrPrd;
    @XmlElement(name = "Frqcy")
    protected Frequency6Choice frqcy;
    @XmlElement(name = "UpdTp")
    protected UpdateType3Choice updTp;
    @XmlElement(name = "StmtBsis")
    protected StatementBasis4Choice stmtBsis;
    @XmlElement(name = "StmtTp")
    protected StatementType3Choice stmtTp;

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
    public Statement29 setStmtDtOrPrd(DateAndPeriod1Choice value) {
        this.stmtDtOrPrd = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency6Choice }
     *     
     */
    public Frequency6Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency6Choice }
     *     
     */
    public Statement29 setFrqcy(Frequency6Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType3Choice }
     *     
     */
    public UpdateType3Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType3Choice }
     *     
     */
    public Statement29 setUpdTp(UpdateType3Choice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis4Choice }
     *     
     */
    public StatementBasis4Choice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis4Choice }
     *     
     */
    public Statement29 setStmtBsis(StatementBasis4Choice value) {
        this.stmtBsis = value;
        return this;
    }

    /**
     * Gets the value of the stmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType3Choice }
     *     
     */
    public StatementType3Choice getStmtTp() {
        return stmtTp;
    }

    /**
     * Sets the value of the stmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType3Choice }
     *     
     */
    public Statement29 setStmtTp(StatementType3Choice value) {
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
