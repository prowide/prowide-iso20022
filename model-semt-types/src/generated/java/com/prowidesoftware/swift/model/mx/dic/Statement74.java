
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
@XmlType(name = "Statement74", propOrder = {
    "rptNb",
    "qryRef",
    "stmtId",
    "stmtDtTm",
    "frqcy",
    "updTp",
    "stmtBsis",
    "actvtyInd",
    "audtdInd",
    "subAcctInd",
    "taxLotInd",
    "sctyIntrstOrSetOff"
})
public class Statement74 {

    @XmlElement(name = "RptNb")
    protected Number3Choice rptNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "StmtId")
    protected String stmtId;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTime2Choice stmtDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency25Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType15Choice updTp;
    @XmlElement(name = "StmtBsis", required = true)
    protected StatementBasis7Choice stmtBsis;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "AudtdInd")
    protected boolean audtdInd;
    @XmlElement(name = "SubAcctInd")
    protected boolean subAcctInd;
    @XmlElement(name = "TaxLotInd")
    protected Boolean taxLotInd;
    @XmlElement(name = "SctyIntrstOrSetOff")
    protected Boolean sctyIntrstOrSetOff;

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
    public Statement74 setRptNb(Number3Choice value) {
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
    public Statement74 setQryRef(String value) {
        this.qryRef = value;
        return this;
    }

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
    public Statement74 setStmtId(String value) {
        this.stmtId = value;
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
    public Statement74 setStmtDtTm(DateAndDateTime2Choice value) {
        this.stmtDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency25Choice }
     *     
     */
    public Frequency25Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency25Choice }
     *     
     */
    public Statement74 setFrqcy(Frequency25Choice value) {
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
    public Statement74 setUpdTp(UpdateType15Choice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis7Choice }
     *     
     */
    public StatementBasis7Choice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis7Choice }
     *     
     */
    public Statement74 setStmtBsis(StatementBasis7Choice value) {
        this.stmtBsis = value;
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
    public Statement74 setActvtyInd(boolean value) {
        this.actvtyInd = value;
        return this;
    }

    /**
     * Gets the value of the audtdInd property.
     * 
     */
    public boolean isAudtdInd() {
        return audtdInd;
    }

    /**
     * Sets the value of the audtdInd property.
     * 
     */
    public Statement74 setAudtdInd(boolean value) {
        this.audtdInd = value;
        return this;
    }

    /**
     * Gets the value of the subAcctInd property.
     * 
     */
    public boolean isSubAcctInd() {
        return subAcctInd;
    }

    /**
     * Sets the value of the subAcctInd property.
     * 
     */
    public Statement74 setSubAcctInd(boolean value) {
        this.subAcctInd = value;
        return this;
    }

    /**
     * Gets the value of the taxLotInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxLotInd() {
        return taxLotInd;
    }

    /**
     * Sets the value of the taxLotInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Statement74 setTaxLotInd(Boolean value) {
        this.taxLotInd = value;
        return this;
    }

    /**
     * Gets the value of the sctyIntrstOrSetOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctyIntrstOrSetOff() {
        return sctyIntrstOrSetOff;
    }

    /**
     * Sets the value of the sctyIntrstOrSetOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Statement74 setSctyIntrstOrSetOff(Boolean value) {
        this.sctyIntrstOrSetOff = value;
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
