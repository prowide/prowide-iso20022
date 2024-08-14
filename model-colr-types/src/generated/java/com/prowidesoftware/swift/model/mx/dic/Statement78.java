
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "Statement78", propOrder = {
    "stmtId",
    "rptNb",
    "qryRef",
    "stmtDtTm",
    "frqcy",
    "updTp",
    "collSd",
    "stmtBsis",
    "stsTp",
    "summryInd",
    "actvtyInd"
})
public class Statement78 {

    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "RptNb")
    protected Number3Choice rptNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTime2Choice stmtDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency22Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType15Choice updTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "StmtBsis", required = true)
    protected StatementBasis14Choice stmtBsis;
    @XmlElement(name = "StsTp")
    @XmlSchemaType(name = "string")
    protected StatementStatusType1Code stsTp;
    @XmlElement(name = "SummryInd")
    protected boolean summryInd;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Statement78 setStmtId(String value) {
        this.stmtId = value;
        return this;
    }

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number3Choice }
     *     
     */
    public Number3Choice getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number3Choice }
     *     
     */
    public Statement78 setRptNb(Number3Choice value) {
        this.rptNb = value;
        return this;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Statement78 setQryRef(String value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public Statement78 setStmtDtTm(DateAndDateTime2Choice value) {
        this.stmtDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency22Choice }
     *     
     */
    public Frequency22Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency22Choice }
     *     
     */
    public Statement78 setFrqcy(Frequency22Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType15Choice }
     *     
     */
    public UpdateType15Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType15Choice }
     *     
     */
    public Statement78 setUpdTp(UpdateType15Choice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public Statement78 setCollSd(CollateralRole1Code value) {
        this.collSd = value;
        return this;
    }

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis14Choice }
     *     
     */
    public StatementBasis14Choice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis14Choice }
     *     
     */
    public Statement78 setStmtBsis(StatementBasis14Choice value) {
        this.stmtBsis = value;
        return this;
    }

    /**
     * Gets the value of the stsTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementStatusType1Code }
     *     
     */
    public StatementStatusType1Code getStsTp() {
        return stsTp;
    }

    /**
     * Sets the value of the stsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementStatusType1Code }
     *     
     */
    public Statement78 setStsTp(StatementStatusType1Code value) {
        this.stsTp = value;
        return this;
    }

    /**
     * Gets the value of the summryInd property.
     * 
     */
    public boolean isSummryInd() {
        return summryInd;
    }

    /**
     * Sets the value of the summryInd property.
     * 
     */
    public Statement78 setSummryInd(boolean value) {
        this.summryInd = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public Statement78 setActvtyInd(boolean value) {
        this.actvtyInd = value;
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
