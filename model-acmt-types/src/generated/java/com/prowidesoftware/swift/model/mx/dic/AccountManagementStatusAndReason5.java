
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementStatusAndReason5", propOrder = {
    "sts",
    "stsRsn",
    "acctApplId",
    "exstgAcctId",
    "acctId",
    "acctSts",
    "blckdSts",
    "fatcaRptgDt",
    "crsRptgDt"
})
public class AccountManagementStatusAndReason5 {

    @XmlElement(name = "Sts", required = true)
    protected Status25Choice sts;
    @XmlElement(name = "StsRsn")
    protected List<AcceptedStatusReason1Choice> stsRsn;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ExstgAcctId")
    protected List<Account23> exstgAcctId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctSts")
    protected AccountStatus2 acctSts;
    @XmlElement(name = "BlckdSts")
    protected BlockedStatusReason2Choice blckdSts;
    @XmlElement(name = "FATCARptgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fatcaRptgDt;
    @XmlElement(name = "CRSRptgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crsRptgDt;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status25Choice }
     *     
     */
    public Status25Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status25Choice }
     *     
     */
    public AccountManagementStatusAndReason5 setSts(Status25Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptedStatusReason1Choice }
     * 
     * 
     */
    public List<AcceptedStatusReason1Choice> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<AcceptedStatusReason1Choice>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the acctApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctApplId() {
        return acctApplId;
    }

    /**
     * Sets the value of the acctApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementStatusAndReason5 setAcctApplId(String value) {
        this.acctApplId = value;
        return this;
    }

    /**
     * Gets the value of the exstgAcctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exstgAcctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExstgAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account23 }
     * 
     * 
     */
    public List<Account23> getExstgAcctId() {
        if (exstgAcctId == null) {
            exstgAcctId = new ArrayList<Account23>();
        }
        return this.exstgAcctId;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementStatusAndReason5 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctSts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus2 }
     *     
     */
    public AccountStatus2 getAcctSts() {
        return acctSts;
    }

    /**
     * Sets the value of the acctSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus2 }
     *     
     */
    public AccountManagementStatusAndReason5 setAcctSts(AccountStatus2 value) {
        this.acctSts = value;
        return this;
    }

    /**
     * Gets the value of the blckdSts property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedStatusReason2Choice }
     *     
     */
    public BlockedStatusReason2Choice getBlckdSts() {
        return blckdSts;
    }

    /**
     * Sets the value of the blckdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedStatusReason2Choice }
     *     
     */
    public AccountManagementStatusAndReason5 setBlckdSts(BlockedStatusReason2Choice value) {
        this.blckdSts = value;
        return this;
    }

    /**
     * Gets the value of the fatcaRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFATCARptgDt() {
        return fatcaRptgDt;
    }

    /**
     * Sets the value of the fatcaRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementStatusAndReason5 setFATCARptgDt(XMLGregorianCalendar value) {
        this.fatcaRptgDt = value;
        return this;
    }

    /**
     * Gets the value of the crsRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCRSRptgDt() {
        return crsRptgDt;
    }

    /**
     * Sets the value of the crsRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementStatusAndReason5 setCRSRptgDt(XMLGregorianCalendar value) {
        this.crsRptgDt = value;
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

    /**
     * Adds a new item to the stsRsn list.
     * @see #getStsRsn()
     * 
     */
    public AccountManagementStatusAndReason5 addStsRsn(AcceptedStatusReason1Choice stsRsn) {
        getStsRsn().add(stsRsn);
        return this;
    }

    /**
     * Adds a new item to the exstgAcctId list.
     * @see #getExstgAcctId()
     * 
     */
    public AccountManagementStatusAndReason5 addExstgAcctId(Account23 exstgAcctId) {
        getExstgAcctId().add(exstgAcctId);
        return this;
    }

}
