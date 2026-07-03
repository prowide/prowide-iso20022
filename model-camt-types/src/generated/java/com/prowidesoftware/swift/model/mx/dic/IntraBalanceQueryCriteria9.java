
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
@XmlType(name = "IntraBalanceQueryCriteria9", propOrder = {
    "refs",
    "sts",
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "balTp",
    "cshSubBalId",
    "sttlmAmt",
    "sttldAmt",
    "sttlmCcy",
    "intnddSttlmDt",
    "fctvSttlmDt",
    "prty",
    "msgOrgtr",
    "creDtTm"
})
public class IntraBalanceQueryCriteria9 {

    @XmlElement(name = "Refs")
    protected List<References36Choice> refs;
    @XmlElement(name = "Sts")
    protected IntraBalanceQueryStatus3 sts;
    @XmlElement(name = "CshAcct")
    protected List<AccountIdentificationSearchCriteria2Choice> cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected List<SystemPartyIdentification8> cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 cshAcctSvcr;
    @XmlElement(name = "BalTp")
    protected List<IntraBalanceType3> balTp;
    @XmlElement(name = "CshSubBalId")
    protected List<GenericIdentification37> cshSubBalId;
    @XmlElement(name = "SttlmAmt")
    protected ImpliedCurrencyAmountRange1Choice sttlmAmt;
    @XmlElement(name = "SttldAmt")
    protected ImpliedCurrencyAmountRange1Choice sttldAmt;
    @XmlElement(name = "SttlmCcy")
    protected List<String> sttlmCcy;
    @XmlElement(name = "IntnddSttlmDt")
    protected DateAndDateTimeSearch5Choice intnddSttlmDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTimeSearch5Choice fctvSttlmDt;
    @XmlElement(name = "Prty")
    protected List<PriorityNumeric4Choice> prty;
    @XmlElement(name = "MsgOrgtr")
    protected List<SystemPartyIdentification8> msgOrgtr;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeSearch5Choice creDtTm;

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link References36Choice }
     * 
     * 
     */
    public List<References36Choice> getRefs() {
        if (refs == null) {
            refs = new ArrayList<References36Choice>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceQueryStatus3 }
     *     
     */
    public IntraBalanceQueryStatus3 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceQueryStatus3 }
     *     
     */
    public IntraBalanceQueryCriteria9 setSts(IntraBalanceQueryStatus3 value) {
        this.sts = value;
        return this;
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
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCshAcctSvcr() {
        return cshAcctSvcr;
    }

    /**
     * Sets the value of the cshAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public IntraBalanceQueryCriteria9 setCshAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cshAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraBalanceType3 }
     * 
     * 
     */
    public List<IntraBalanceType3> getBalTp() {
        if (balTp == null) {
            balTp = new ArrayList<IntraBalanceType3>();
        }
        return this.balTp;
    }

    /**
     * Gets the value of the cshSubBalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshSubBalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSubBalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification37 }
     * 
     * 
     */
    public List<GenericIdentification37> getCshSubBalId() {
        if (cshSubBalId == null) {
            cshSubBalId = new ArrayList<GenericIdentification37>();
        }
        return this.cshSubBalId;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public IntraBalanceQueryCriteria9 setSttlmAmt(ImpliedCurrencyAmountRange1Choice value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public IntraBalanceQueryCriteria9 setSttldAmt(ImpliedCurrencyAmountRange1Choice value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSttlmCcy() {
        if (sttlmCcy == null) {
            sttlmCcy = new ArrayList<String>();
        }
        return this.sttlmCcy;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public IntraBalanceQueryCriteria9 setIntnddSttlmDt(DateAndDateTimeSearch5Choice value) {
        this.intnddSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public IntraBalanceQueryCriteria9 setFctvSttlmDt(DateAndDateTimeSearch5Choice value) {
        this.fctvSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityNumeric4Choice }
     * 
     * 
     */
    public List<PriorityNumeric4Choice> getPrty() {
        if (prty == null) {
            prty = new ArrayList<PriorityNumeric4Choice>();
        }
        return this.prty;
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
    public IntraBalanceQueryCriteria9 setCreDtTm(DateAndDateTimeSearch5Choice value) {
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
     * Adds a new item to the refs list.
     * @see #getRefs()
     * 
     */
    public IntraBalanceQueryCriteria9 addRefs(References36Choice refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the cshAcct list.
     * @see #getCshAcct()
     * 
     */
    public IntraBalanceQueryCriteria9 addCshAcct(AccountIdentificationSearchCriteria2Choice cshAcct) {
        getCshAcct().add(cshAcct);
        return this;
    }

    /**
     * Adds a new item to the cshAcctOwnr list.
     * @see #getCshAcctOwnr()
     * 
     */
    public IntraBalanceQueryCriteria9 addCshAcctOwnr(SystemPartyIdentification8 cshAcctOwnr) {
        getCshAcctOwnr().add(cshAcctOwnr);
        return this;
    }

    /**
     * Adds a new item to the balTp list.
     * @see #getBalTp()
     * 
     */
    public IntraBalanceQueryCriteria9 addBalTp(IntraBalanceType3 balTp) {
        getBalTp().add(balTp);
        return this;
    }

    /**
     * Adds a new item to the cshSubBalId list.
     * @see #getCshSubBalId()
     * 
     */
    public IntraBalanceQueryCriteria9 addCshSubBalId(GenericIdentification37 cshSubBalId) {
        getCshSubBalId().add(cshSubBalId);
        return this;
    }

    /**
     * Adds a new item to the sttlmCcy list.
     * @see #getSttlmCcy()
     * 
     */
    public IntraBalanceQueryCriteria9 addSttlmCcy(String sttlmCcy) {
        getSttlmCcy().add(sttlmCcy);
        return this;
    }

    /**
     * Adds a new item to the prty list.
     * @see #getPrty()
     * 
     */
    public IntraBalanceQueryCriteria9 addPrty(PriorityNumeric4Choice prty) {
        getPrty().add(prty);
        return this;
    }

    /**
     * Adds a new item to the msgOrgtr list.
     * @see #getMsgOrgtr()
     * 
     */
    public IntraBalanceQueryCriteria9 addMsgOrgtr(SystemPartyIdentification8 msgOrgtr) {
        getMsgOrgtr().add(msgOrgtr);
        return this;
    }

}
