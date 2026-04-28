
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
@XmlType(name = "IntraPositionQueryCriteria7__1", propOrder = {
    "refs",
    "sts",
    "finInstrmId",
    "sfkpgAcctOwnr",
    "sfkpgAcct",
    "balTp",
    "sctiesSubBalId",
    "sttlmQty",
    "sttldQty",
    "intnddSttlmDt",
    "fctvSttlmDt",
    "prty",
    "ctryOfIsse",
    "msgOrgtr",
    "creDtTm"
})
public class IntraPositionQueryCriteria71 {

    @XmlElement(name = "Refs")
    protected List<References36Choice1> refs;
    @XmlElement(name = "Sts")
    protected IntraPositionQueryStatus31 sts;
    @XmlElement(name = "FinInstrmId")
    protected List<SecurityIdentification191> finInstrmId;
    @XmlElement(name = "SfkpgAcctOwnr")
    protected List<SystemPartyIdentification81> sfkpgAcctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected List<SecuritiesAccount191> sfkpgAcct;
    @XmlElement(name = "BalTp")
    protected List<IntraPositionType21> balTp;
    @XmlElement(name = "SctiesSubBalId")
    protected List<GenericIdentification371> sctiesSubBalId;
    @XmlElement(name = "SttlmQty")
    protected QuantitySearch2Choice1 sttlmQty;
    @XmlElement(name = "SttldQty")
    protected QuantitySearch2Choice1 sttldQty;
    @XmlElement(name = "IntnddSttlmDt")
    protected DateAndDateTimeSearch5Choice1 intnddSttlmDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTimeSearch5Choice1 fctvSttlmDt;
    @XmlElement(name = "Prty")
    protected List<PriorityNumeric4Choice1> prty;
    @XmlElement(name = "CtryOfIsse")
    protected List<String> ctryOfIsse;
    @XmlElement(name = "MsgOrgtr")
    protected List<SystemPartyIdentification81> msgOrgtr;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeSearch5Choice2 creDtTm;

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
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
     * {@link References36Choice1 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<References36Choice1> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionQueryStatus31 }
     *     
     */
    public IntraPositionQueryStatus31 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionQueryStatus31 }
     *     
     */
    public IntraPositionQueryCriteria71 setSts(IntraPositionQueryStatus31 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification191 }
     * 
     * 
     * @return
     *     The value of the finInstrmId property.
     */
    public List<SecurityIdentification191> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<>();
        }
        return this.finInstrmId;
    }

    /**
     * Gets the value of the sfkpgAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sfkpgAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification81 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcctOwnr property.
     */
    public List<SystemPartyIdentification81> getSfkpgAcctOwnr() {
        if (sfkpgAcctOwnr == null) {
            sfkpgAcctOwnr = new ArrayList<>();
        }
        return this.sfkpgAcctOwnr;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sfkpgAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccount191 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcct property.
     */
    public List<SecuritiesAccount191> getSfkpgAcct() {
        if (sfkpgAcct == null) {
            sfkpgAcct = new ArrayList<>();
        }
        return this.sfkpgAcct;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balTp property.
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
     * {@link IntraPositionType21 }
     * 
     * 
     * @return
     *     The value of the balTp property.
     */
    public List<IntraPositionType21> getBalTp() {
        if (balTp == null) {
            balTp = new ArrayList<>();
        }
        return this.balTp;
    }

    /**
     * Gets the value of the sctiesSubBalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesSubBalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesSubBalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification371 }
     * 
     * 
     * @return
     *     The value of the sctiesSubBalId property.
     */
    public List<GenericIdentification371> getSctiesSubBalId() {
        if (sctiesSubBalId == null) {
            sctiesSubBalId = new ArrayList<>();
        }
        return this.sctiesSubBalId;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySearch2Choice1 }
     *     
     */
    public QuantitySearch2Choice1 getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySearch2Choice1 }
     *     
     */
    public IntraPositionQueryCriteria71 setSttlmQty(QuantitySearch2Choice1 value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySearch2Choice1 }
     *     
     */
    public QuantitySearch2Choice1 getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySearch2Choice1 }
     *     
     */
    public IntraPositionQueryCriteria71 setSttldQty(QuantitySearch2Choice1 value) {
        this.sttldQty = value;
        return this;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public DateAndDateTimeSearch5Choice1 getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public IntraPositionQueryCriteria71 setIntnddSttlmDt(DateAndDateTimeSearch5Choice1 value) {
        this.intnddSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public DateAndDateTimeSearch5Choice1 getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public IntraPositionQueryCriteria71 setFctvSttlmDt(DateAndDateTimeSearch5Choice1 value) {
        this.fctvSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prty property.
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
     * {@link PriorityNumeric4Choice1 }
     * 
     * 
     * @return
     *     The value of the prty property.
     */
    public List<PriorityNumeric4Choice1> getPrty() {
        if (prty == null) {
            prty = new ArrayList<>();
        }
        return this.prty;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctryOfIsse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtryOfIsse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ctryOfIsse property.
     */
    public List<String> getCtryOfIsse() {
        if (ctryOfIsse == null) {
            ctryOfIsse = new ArrayList<>();
        }
        return this.ctryOfIsse;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgOrgtr property.
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
     * {@link SystemPartyIdentification81 }
     * 
     * 
     * @return
     *     The value of the msgOrgtr property.
     */
    public List<SystemPartyIdentification81> getMsgOrgtr() {
        if (msgOrgtr == null) {
            msgOrgtr = new ArrayList<>();
        }
        return this.msgOrgtr;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice2 }
     *     
     */
    public DateAndDateTimeSearch5Choice2 getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice2 }
     *     
     */
    public IntraPositionQueryCriteria71 setCreDtTm(DateAndDateTimeSearch5Choice2 value) {
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
    public IntraPositionQueryCriteria71 addRefs(References36Choice1 refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the finInstrmId list.
     * @see #getFinInstrmId()
     * 
     */
    public IntraPositionQueryCriteria71 addFinInstrmId(SecurityIdentification191 finInstrmId) {
        getFinInstrmId().add(finInstrmId);
        return this;
    }

    /**
     * Adds a new item to the sfkpgAcctOwnr list.
     * @see #getSfkpgAcctOwnr()
     * 
     */
    public IntraPositionQueryCriteria71 addSfkpgAcctOwnr(SystemPartyIdentification81 sfkpgAcctOwnr) {
        getSfkpgAcctOwnr().add(sfkpgAcctOwnr);
        return this;
    }

    /**
     * Adds a new item to the sfkpgAcct list.
     * @see #getSfkpgAcct()
     * 
     */
    public IntraPositionQueryCriteria71 addSfkpgAcct(SecuritiesAccount191 sfkpgAcct) {
        getSfkpgAcct().add(sfkpgAcct);
        return this;
    }

    /**
     * Adds a new item to the balTp list.
     * @see #getBalTp()
     * 
     */
    public IntraPositionQueryCriteria71 addBalTp(IntraPositionType21 balTp) {
        getBalTp().add(balTp);
        return this;
    }

    /**
     * Adds a new item to the sctiesSubBalId list.
     * @see #getSctiesSubBalId()
     * 
     */
    public IntraPositionQueryCriteria71 addSctiesSubBalId(GenericIdentification371 sctiesSubBalId) {
        getSctiesSubBalId().add(sctiesSubBalId);
        return this;
    }

    /**
     * Adds a new item to the prty list.
     * @see #getPrty()
     * 
     */
    public IntraPositionQueryCriteria71 addPrty(PriorityNumeric4Choice1 prty) {
        getPrty().add(prty);
        return this;
    }

    /**
     * Adds a new item to the ctryOfIsse list.
     * @see #getCtryOfIsse()
     * 
     */
    public IntraPositionQueryCriteria71 addCtryOfIsse(String ctryOfIsse) {
        getCtryOfIsse().add(ctryOfIsse);
        return this;
    }

    /**
     * Adds a new item to the msgOrgtr list.
     * @see #getMsgOrgtr()
     * 
     */
    public IntraPositionQueryCriteria71 addMsgOrgtr(SystemPartyIdentification81 msgOrgtr) {
        getMsgOrgtr().add(msgOrgtr);
        return this;
    }

}
