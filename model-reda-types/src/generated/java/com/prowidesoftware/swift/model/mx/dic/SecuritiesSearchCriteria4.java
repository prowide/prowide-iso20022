
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
 * Criteria for a query about securities reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSearchCriteria4", propOrder = {
    "finInstrmId",
    "clssfctnFinInstrm",
    "mtrtyDt",
    "isseDt",
    "isseCcy",
    "ctryOfIsse",
    "sctySts",
    "mntngCSD",
    "invstrCSD",
    "issrCSD",
    "techIssrCSD",
    "csd"
})
public class SecuritiesSearchCriteria4 {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification39 finInstrmId;
    @XmlElement(name = "ClssfctnFinInstrm")
    protected String clssfctnFinInstrm;
    @XmlElement(name = "MtrtyDt")
    protected DatePeriodSearch1Choice mtrtyDt;
    @XmlElement(name = "IsseDt")
    protected DatePeriodSearch1Choice isseDt;
    @XmlElement(name = "IsseCcy")
    protected String isseCcy;
    @XmlElement(name = "CtryOfIsse")
    protected String ctryOfIsse;
    @XmlElement(name = "SctySts")
    protected SecurityStatus3Choice sctySts;
    @XmlElement(name = "MntngCSD")
    protected SystemPartyIdentification2Choice mntngCSD;
    @XmlElement(name = "InvstrCSD")
    protected SystemPartyIdentification2Choice invstrCSD;
    @XmlElement(name = "IssrCSD")
    protected SystemPartyIdentification2Choice issrCSD;
    @XmlElement(name = "TechIssrCSD")
    protected SystemPartyIdentification2Choice techIssrCSD;
    @XmlElement(name = "CSD")
    protected SystemPartyIdentification2Choice csd;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecuritiesSearchCriteria4 setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Sets the value of the clssfctnFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSearchCriteria4 setClssfctnFinInstrm(String value) {
        this.clssfctnFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public SecuritiesSearchCriteria4 setMtrtyDt(DatePeriodSearch1Choice value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public SecuritiesSearchCriteria4 setIsseDt(DatePeriodSearch1Choice value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the isseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsseCcy() {
        return isseCcy;
    }

    /**
     * Sets the value of the isseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSearchCriteria4 setIsseCcy(String value) {
        this.isseCcy = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSearchCriteria4 setCtryOfIsse(String value) {
        this.ctryOfIsse = value;
        return this;
    }

    /**
     * Gets the value of the sctySts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityStatus3Choice }
     *     
     */
    public SecurityStatus3Choice getSctySts() {
        return sctySts;
    }

    /**
     * Sets the value of the sctySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityStatus3Choice }
     *     
     */
    public SecuritiesSearchCriteria4 setSctySts(SecurityStatus3Choice value) {
        this.sctySts = value;
        return this;
    }

    /**
     * Gets the value of the mntngCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getMntngCSD() {
        return mntngCSD;
    }

    /**
     * Sets the value of the mntngCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SecuritiesSearchCriteria4 setMntngCSD(SystemPartyIdentification2Choice value) {
        this.mntngCSD = value;
        return this;
    }

    /**
     * Gets the value of the invstrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getInvstrCSD() {
        return invstrCSD;
    }

    /**
     * Sets the value of the invstrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SecuritiesSearchCriteria4 setInvstrCSD(SystemPartyIdentification2Choice value) {
        this.invstrCSD = value;
        return this;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getIssrCSD() {
        return issrCSD;
    }

    /**
     * Sets the value of the issrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SecuritiesSearchCriteria4 setIssrCSD(SystemPartyIdentification2Choice value) {
        this.issrCSD = value;
        return this;
    }

    /**
     * Gets the value of the techIssrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getTechIssrCSD() {
        return techIssrCSD;
    }

    /**
     * Sets the value of the techIssrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SecuritiesSearchCriteria4 setTechIssrCSD(SystemPartyIdentification2Choice value) {
        this.techIssrCSD = value;
        return this;
    }

    /**
     * Gets the value of the csd property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getCSD() {
        return csd;
    }

    /**
     * Sets the value of the csd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SecuritiesSearchCriteria4 setCSD(SystemPartyIdentification2Choice value) {
        this.csd = value;
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
