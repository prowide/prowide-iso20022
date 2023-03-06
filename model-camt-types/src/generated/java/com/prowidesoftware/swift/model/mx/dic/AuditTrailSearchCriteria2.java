
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to search for an audit trail.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrailSearchCriteria2", propOrder = {
    "acctId",
    "acctOwnr",
    "dtPrd",
    "pmtId",
    "audtTrlTp"
})
public class AuditTrailSearchCriteria2 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification4Choice acctId;
    @XmlElement(name = "AcctOwnr")
    protected BranchAndFinancialInstitutionIdentification6 acctOwnr;
    @XmlElement(name = "DtPrd")
    protected DatePeriodSearch1Choice dtPrd;
    @XmlElement(name = "PmtId")
    protected List<PaymentIdentification9> pmtId;
    @XmlElement(name = "AudtTrlTp", required = true)
    protected List<AuditTrailType1Choice> audtTrlTp;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AuditTrailSearchCriteria2 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public AuditTrailSearchCriteria2 setAcctOwnr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the dtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getDtPrd() {
        return dtPrd;
    }

    /**
     * Sets the value of the dtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public AuditTrailSearchCriteria2 setDtPrd(DatePeriodSearch1Choice value) {
        this.dtPrd = value;
        return this;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIdentification9 }
     * 
     * 
     */
    public List<PaymentIdentification9> getPmtId() {
        if (pmtId == null) {
            pmtId = new ArrayList<PaymentIdentification9>();
        }
        return this.pmtId;
    }

    /**
     * Gets the value of the audtTrlTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audtTrlTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudtTrlTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditTrailType1Choice }
     * 
     * 
     */
    public List<AuditTrailType1Choice> getAudtTrlTp() {
        if (audtTrlTp == null) {
            audtTrlTp = new ArrayList<AuditTrailType1Choice>();
        }
        return this.audtTrlTp;
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

    /**
     * Adds a new item to the pmtId list.
     * @see #getPmtId()
     * 
     */
    public AuditTrailSearchCriteria2 addPmtId(PaymentIdentification9 pmtId) {
        getPmtId().add(pmtId);
        return this;
    }

    /**
     * Adds a new item to the audtTrlTp list.
     * @see #getAudtTrlTp()
     * 
     */
    public AuditTrailSearchCriteria2 addAudtTrlTp(AuditTrailType1Choice audtTrlTp) {
        getAudtTrlTp().add(audtTrlTp);
        return this;
    }

}
