
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information from the National BIC Directory.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectoryParticipantInformation1", propOrder = {
    "ptcptNmAndAdr",
    "acctSvcr",
    "drctPtcpt",
    "ntryCreDt",
    "ntryDeltnDt",
    "svcrTp",
    "svcTp",
    "xchgTp",
    "rstrctnTp",
    "rstrctnFctvDt",
    "ptcptId",
    "mgrtnDtls"
})
public class DirectoryParticipantInformation1 {

    @XmlElement(name = "PtcptNmAndAdr")
    protected EnglishNameLocalNameAndAddress1 ptcptNmAndAdr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification5 acctSvcr;
    @XmlElement(name = "DrctPtcpt")
    protected FinancialInstitutionIdentification9 drctPtcpt;
    @XmlElement(name = "NtryCreDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ntryCreDt;
    @XmlElement(name = "NtryDeltnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ntryDeltnDt;
    @XmlElement(name = "SvcrTp", required = true)
    protected String svcrTp;
    @XmlElement(name = "SvcTp", required = true)
    protected String svcTp;
    @XmlElement(name = "XchgTp", required = true)
    protected String xchgTp;
    @XmlElement(name = "RstrctnTp", required = true)
    protected String rstrctnTp;
    @XmlElement(name = "RstrctnFctvDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rstrctnFctvDt;
    @XmlElement(name = "PtcptId", required = true)
    protected FinancialInstitutionIdentification9 ptcptId;
    @XmlElement(name = "MgrtnDtls", required = true)
    protected SystemMigration1 mgrtnDtls;

    /**
     * Gets the value of the ptcptNmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link EnglishNameLocalNameAndAddress1 }
     *     
     */
    public EnglishNameLocalNameAndAddress1 getPtcptNmAndAdr() {
        return ptcptNmAndAdr;
    }

    /**
     * Sets the value of the ptcptNmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnglishNameLocalNameAndAddress1 }
     *     
     */
    public DirectoryParticipantInformation1 setPtcptNmAndAdr(EnglishNameLocalNameAndAddress1 value) {
        this.ptcptNmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public DirectoryParticipantInformation1 setAcctSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the drctPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public FinancialInstitutionIdentification9 getDrctPtcpt() {
        return drctPtcpt;
    }

    /**
     * Sets the value of the drctPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public DirectoryParticipantInformation1 setDrctPtcpt(FinancialInstitutionIdentification9 value) {
        this.drctPtcpt = value;
        return this;
    }

    /**
     * Gets the value of the ntryCreDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNtryCreDt() {
        return ntryCreDt;
    }

    /**
     * Sets the value of the ntryCreDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DirectoryParticipantInformation1 setNtryCreDt(XMLGregorianCalendar value) {
        this.ntryCreDt = value;
        return this;
    }

    /**
     * Gets the value of the ntryDeltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNtryDeltnDt() {
        return ntryDeltnDt;
    }

    /**
     * Sets the value of the ntryDeltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DirectoryParticipantInformation1 setNtryDeltnDt(XMLGregorianCalendar value) {
        this.ntryDeltnDt = value;
        return this;
    }

    /**
     * Gets the value of the svcrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcrTp() {
        return svcrTp;
    }

    /**
     * Sets the value of the svcrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectoryParticipantInformation1 setSvcrTp(String value) {
        this.svcrTp = value;
        return this;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectoryParticipantInformation1 setSvcTp(String value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the xchgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgTp() {
        return xchgTp;
    }

    /**
     * Sets the value of the xchgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectoryParticipantInformation1 setXchgTp(String value) {
        this.xchgTp = value;
        return this;
    }

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectoryParticipantInformation1 setRstrctnTp(String value) {
        this.rstrctnTp = value;
        return this;
    }

    /**
     * Gets the value of the rstrctnFctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRstrctnFctvDt() {
        return rstrctnFctvDt;
    }

    /**
     * Sets the value of the rstrctnFctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DirectoryParticipantInformation1 setRstrctnFctvDt(XMLGregorianCalendar value) {
        this.rstrctnFctvDt = value;
        return this;
    }

    /**
     * Gets the value of the ptcptId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public FinancialInstitutionIdentification9 getPtcptId() {
        return ptcptId;
    }

    /**
     * Sets the value of the ptcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public DirectoryParticipantInformation1 setPtcptId(FinancialInstitutionIdentification9 value) {
        this.ptcptId = value;
        return this;
    }

    /**
     * Gets the value of the mgrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMigration1 }
     *     
     */
    public SystemMigration1 getMgrtnDtls() {
        return mgrtnDtls;
    }

    /**
     * Sets the value of the mgrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMigration1 }
     *     
     */
    public DirectoryParticipantInformation1 setMgrtnDtls(SystemMigration1 value) {
        this.mgrtnDtls = value;
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
