
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
 * General characteristics related to a statement which reports information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement75", propOrder = {
    "stmtTp",
    "rptgTp",
    "stmtId",
    "instrAggtnPrd",
    "rptNb",
    "stmtDtTm",
    "frqcy",
    "updTp",
    "actvtyInd",
    "ntfctnDdlnPrd"
})
public class Statement75 {

    @XmlElement(name = "StmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionStatementType2Code stmtTp;
    @XmlElement(name = "RptgTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionStatementReportingType1Code rptgTp;
    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "InstrAggtnPrd")
    protected DatePeriod2 instrAggtnPrd;
    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTime2Choice stmtDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency26Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType16Choice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "NtfctnDdlnPrd")
    protected DateOrDateTimePeriod1Choice ntfctnDdlnPrd;

    /**
     * Gets the value of the stmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStatementType2Code }
     *     
     */
    public CorporateActionStatementType2Code getStmtTp() {
        return stmtTp;
    }

    /**
     * Sets the value of the stmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStatementType2Code }
     *     
     */
    public Statement75 setStmtTp(CorporateActionStatementType2Code value) {
        this.stmtTp = value;
        return this;
    }

    /**
     * Gets the value of the rptgTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStatementReportingType1Code }
     *     
     */
    public CorporateActionStatementReportingType1Code getRptgTp() {
        return rptgTp;
    }

    /**
     * Sets the value of the rptgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStatementReportingType1Code }
     *     
     */
    public Statement75 setRptgTp(CorporateActionStatementReportingType1Code value) {
        this.rptgTp = value;
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
    public Statement75 setStmtId(String value) {
        this.stmtId = value;
        return this;
    }

    /**
     * Gets the value of the instrAggtnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getInstrAggtnPrd() {
        return instrAggtnPrd;
    }

    /**
     * Sets the value of the instrAggtnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public Statement75 setInstrAggtnPrd(DatePeriod2 value) {
        this.instrAggtnPrd = value;
        return this;
    }

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Statement75 setRptNb(String value) {
        this.rptNb = value;
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
    public Statement75 setStmtDtTm(DateAndDateTime2Choice value) {
        this.stmtDtTm = value;
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
    public Statement75 setFrqcy(Frequency26Choice value) {
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
    public Statement75 setUpdTp(UpdateType16Choice value) {
        this.updTp = value;
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
    public Statement75 setActvtyInd(boolean value) {
        this.actvtyInd = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnDdlnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public DateOrDateTimePeriod1Choice getNtfctnDdlnPrd() {
        return ntfctnDdlnPrd;
    }

    /**
     * Sets the value of the ntfctnDdlnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public Statement75 setNtfctnDdlnPrd(DateOrDateTimePeriod1Choice value) {
        this.ntfctnDdlnPrd = value;
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
