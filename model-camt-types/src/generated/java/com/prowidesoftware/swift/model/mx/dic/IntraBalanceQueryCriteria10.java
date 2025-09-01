
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria based on which information is included.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceQueryCriteria10", propOrder = {
    "cxlReqId",
    "prcgSts",
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "msgOrgtr",
    "creDtTm"
})
public class IntraBalanceQueryCriteria10 {

    @XmlElement(name = "CxlReqId")
    protected List<String> cxlReqId;
    @XmlElement(name = "PrcgSts")
    protected List<CancellationProcessingStatus9Choice> prcgSts;
    @XmlElement(name = "CshAcct")
    protected List<AccountIdentificationSearchCriteria2Choice> cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected List<SystemPartyIdentification8> cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification8 cshAcctSvcr;
    @XmlElement(name = "MsgOrgtr")
    protected List<SystemPartyIdentification8> msgOrgtr;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeSearch5Choice creDtTm;

    /**
     * Gets the value of the cxlReqId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlReqId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlReqId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCxlReqId() {
        if (cxlReqId == null) {
            cxlReqId = new ArrayList<String>();
        }
        return this.cxlReqId;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationProcessingStatus9Choice }
     * 
     * 
     */
    public List<CancellationProcessingStatus9Choice> getPrcgSts() {
        if (prcgSts == null) {
            prcgSts = new ArrayList<CancellationProcessingStatus9Choice>();
        }
        return this.prcgSts;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     */
    public List<AccountIdentificationSearchCriteria2Choice> getCshAcct() {
        if (cshAcct == null) {
            cshAcct = new ArrayList<AccountIdentificationSearchCriteria2Choice>();
        }
        return this.cshAcct;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification8 }
     * 
     * 
     */
    public List<SystemPartyIdentification8> getCshAcctOwnr() {
        if (cshAcctOwnr == null) {
            cshAcctOwnr = new ArrayList<SystemPartyIdentification8>();
        }
        return this.cshAcctOwnr;
    }

    /**
     * Gets the value of the cshAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getCshAcctSvcr() {
        return cshAcctSvcr;
    }

    /**
     * Sets the value of the cshAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public IntraBalanceQueryCriteria10 setCshAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.cshAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgOrgtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgOrgtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification8 }
     * 
     * 
     */
    public List<SystemPartyIdentification8> getMsgOrgtr() {
        if (msgOrgtr == null) {
            msgOrgtr = new ArrayList<SystemPartyIdentification8>();
        }
        return this.msgOrgtr;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public IntraBalanceQueryCriteria10 setCreDtTm(DateAndDateTimeSearch5Choice value) {
        this.creDtTm = value;
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
     * Adds a new item to the cxlReqId list.
     * @see #getCxlReqId()
     * 
     */
    public IntraBalanceQueryCriteria10 addCxlReqId(String cxlReqId) {
        getCxlReqId().add(cxlReqId);
        return this;
    }

    /**
     * Adds a new item to the prcgSts list.
     * @see #getPrcgSts()
     * 
     */
    public IntraBalanceQueryCriteria10 addPrcgSts(CancellationProcessingStatus9Choice prcgSts) {
        getPrcgSts().add(prcgSts);
        return this;
    }

    /**
     * Adds a new item to the cshAcct list.
     * @see #getCshAcct()
     * 
     */
    public IntraBalanceQueryCriteria10 addCshAcct(AccountIdentificationSearchCriteria2Choice cshAcct) {
        getCshAcct().add(cshAcct);
        return this;
    }

    /**
     * Adds a new item to the cshAcctOwnr list.
     * @see #getCshAcctOwnr()
     * 
     */
    public IntraBalanceQueryCriteria10 addCshAcctOwnr(SystemPartyIdentification8 cshAcctOwnr) {
        getCshAcctOwnr().add(cshAcctOwnr);
        return this;
    }

    /**
     * Adds a new item to the msgOrgtr list.
     * @see #getMsgOrgtr()
     * 
     */
    public IntraBalanceQueryCriteria10 addMsgOrgtr(SystemPartyIdentification8 msgOrgtr) {
        getMsgOrgtr().add(msgOrgtr);
        return this;
    }

}
