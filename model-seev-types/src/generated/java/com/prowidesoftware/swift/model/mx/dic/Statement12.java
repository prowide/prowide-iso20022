
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
@XmlType(name = "Statement12", propOrder = {
    "stmtTp",
    "rptgTp",
    "stmtId",
    "rptNb",
    "stmtDtTm",
    "frqcy",
    "updTp",
    "actvtyInd",
    "ntfctnDdlnPrd"
})
public class Statement12 {

    @XmlElement(name = "StmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionStatementType1Code stmtTp;
    @XmlElement(name = "RptgTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionStatementReportingType1Code rptgTp;
    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTimeChoice stmtDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency4Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType2Choice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "NtfctnDdlnPrd")
    protected DateOrDateTimePeriodChoice ntfctnDdlnPrd;

    /**
     * Gets the value of the stmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStatementType1Code }
     *     
     */
    public CorporateActionStatementType1Code getStmtTp() {
        return stmtTp;
    }

    /**
     * Sets the value of the stmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStatementType1Code }
     *     
     */
    public Statement12 setStmtTp(CorporateActionStatementType1Code value) {
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
    public Statement12 setRptgTp(CorporateActionStatementReportingType1Code value) {
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
    public Statement12 setStmtId(String value) {
        this.stmtId = value;
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
    public Statement12 setRptNb(String value) {
        this.rptNb = value;
        return this;
    }

    /**
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Statement12 setStmtDtTm(DateAndDateTimeChoice value) {
        this.stmtDtTm = value;
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
    public Statement12 setFrqcy(Frequency4Choice value) {
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
    public Statement12 setUpdTp(UpdateType2Choice value) {
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
    public Statement12 setActvtyInd(boolean value) {
        this.actvtyInd = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnDdlnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public DateOrDateTimePeriodChoice getNtfctnDdlnPrd() {
        return ntfctnDdlnPrd;
    }

    /**
     * Sets the value of the ntfctnDdlnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public Statement12 setNtfctnDdlnPrd(DateOrDateTimePeriodChoice value) {
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
