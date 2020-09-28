
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
 * Scope
 * An instructing party, eg, a (new) plan manager sends the RequestForPEPorISAOrPortfolioInformation message to the executing party, eg, a (old) plan manager, on behalf of the initiating party, eg, an investor (client), to request information about financial instruments held on behalf of the client.
 * Usage
 * The RequestForPEPOrISAOrPortfolioInformation message is used to request information about one or more PEP or ISA or portfolio products held in a client's account for which it intends to instruct a transfer at a later time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForPEPOrISAOrPortfolioInformationV01", propOrder = {
    "msgRef",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "pmryIndvInvstr",
    "scndryIndvInvstr",
    "othrIndvInvstr",
    "pmryCorpInvstr",
    "scndryCorpInvstr",
    "othrCorpInvstr",
    "clntAcct",
    "nmneeAcct",
    "newPlanMgr",
    "pdctTrf",
    "xtnsn"
})
public class RequestForPEPOrISAOrPortfolioInformationV01 {

    @XmlElement(name = "MsgRef", required = true)
    protected MessageIdentification1 msgRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference3 rltdRef;
    @XmlElement(name = "PmryIndvInvstr")
    protected IndividualPerson8 pmryIndvInvstr;
    @XmlElement(name = "ScndryIndvInvstr")
    protected IndividualPerson8 scndryIndvInvstr;
    @XmlElement(name = "OthrIndvInvstr")
    protected List<IndividualPerson8> othrIndvInvstr;
    @XmlElement(name = "PmryCorpInvstr")
    protected Organisation4 pmryCorpInvstr;
    @XmlElement(name = "ScndryCorpInvstr")
    protected Organisation4 scndryCorpInvstr;
    @XmlElement(name = "OthrCorpInvstr")
    protected List<Organisation4> othrCorpInvstr;
    @XmlElement(name = "ClntAcct", required = true)
    protected Account5 clntAcct;
    @XmlElement(name = "NmneeAcct")
    protected Account6 nmneeAcct;
    @XmlElement(name = "NewPlanMgr", required = true)
    protected PartyIdentification2Choice newPlanMgr;
    @XmlElement(name = "PdctTrf", required = true)
    protected List<PEPISATransfer5> pdctTrf;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgRef() {
        return msgRef;
    }

    /**
     * Sets the value of the msgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setMsgRef(MessageIdentification1 value) {
        this.msgRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setRltdRef(AdditionalReference3 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the pmryIndvInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson8 }
     *     
     */
    public IndividualPerson8 getPmryIndvInvstr() {
        return pmryIndvInvstr;
    }

    /**
     * Sets the value of the pmryIndvInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson8 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setPmryIndvInvstr(IndividualPerson8 value) {
        this.pmryIndvInvstr = value;
        return this;
    }

    /**
     * Gets the value of the scndryIndvInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson8 }
     *     
     */
    public IndividualPerson8 getScndryIndvInvstr() {
        return scndryIndvInvstr;
    }

    /**
     * Sets the value of the scndryIndvInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson8 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setScndryIndvInvstr(IndividualPerson8 value) {
        this.scndryIndvInvstr = value;
        return this;
    }

    /**
     * Gets the value of the othrIndvInvstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrIndvInvstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrIndvInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson8 }
     * 
     * 
     */
    public List<IndividualPerson8> getOthrIndvInvstr() {
        if (othrIndvInvstr == null) {
            othrIndvInvstr = new ArrayList<IndividualPerson8>();
        }
        return this.othrIndvInvstr;
    }

    /**
     * Gets the value of the pmryCorpInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation4 }
     *     
     */
    public Organisation4 getPmryCorpInvstr() {
        return pmryCorpInvstr;
    }

    /**
     * Sets the value of the pmryCorpInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation4 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setPmryCorpInvstr(Organisation4 value) {
        this.pmryCorpInvstr = value;
        return this;
    }

    /**
     * Gets the value of the scndryCorpInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation4 }
     *     
     */
    public Organisation4 getScndryCorpInvstr() {
        return scndryCorpInvstr;
    }

    /**
     * Sets the value of the scndryCorpInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation4 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setScndryCorpInvstr(Organisation4 value) {
        this.scndryCorpInvstr = value;
        return this;
    }

    /**
     * Gets the value of the othrCorpInvstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrCorpInvstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCorpInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation4 }
     * 
     * 
     */
    public List<Organisation4> getOthrCorpInvstr() {
        if (othrCorpInvstr == null) {
            othrCorpInvstr = new ArrayList<Organisation4>();
        }
        return this.othrCorpInvstr;
    }

    /**
     * Gets the value of the clntAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account5 }
     *     
     */
    public Account5 getClntAcct() {
        return clntAcct;
    }

    /**
     * Sets the value of the clntAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account5 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setClntAcct(Account5 value) {
        this.clntAcct = value;
        return this;
    }

    /**
     * Gets the value of the nmneeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account6 }
     *     
     */
    public Account6 getNmneeAcct() {
        return nmneeAcct;
    }

    /**
     * Sets the value of the nmneeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account6 }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setNmneeAcct(Account6 value) {
        this.nmneeAcct = value;
        return this;
    }

    /**
     * Gets the value of the newPlanMgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getNewPlanMgr() {
        return newPlanMgr;
    }

    /**
     * Sets the value of the newPlanMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 setNewPlanMgr(PartyIdentification2Choice value) {
        this.newPlanMgr = value;
        return this;
    }

    /**
     * Gets the value of the pdctTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdctTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PEPISATransfer5 }
     * 
     * 
     */
    public List<PEPISATransfer5> getPdctTrf() {
        if (pdctTrf == null) {
            pdctTrf = new ArrayList<PEPISATransfer5>();
        }
        return this.pdctTrf;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the othrIndvInvstr list.
     * @see #getOthrIndvInvstr()
     * 
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 addOthrIndvInvstr(IndividualPerson8 othrIndvInvstr) {
        getOthrIndvInvstr().add(othrIndvInvstr);
        return this;
    }

    /**
     * Adds a new item to the othrCorpInvstr list.
     * @see #getOthrCorpInvstr()
     * 
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 addOthrCorpInvstr(Organisation4 othrCorpInvstr) {
        getOthrCorpInvstr().add(othrCorpInvstr);
        return this;
    }

    /**
     * Adds a new item to the pdctTrf list.
     * @see #getPdctTrf()
     * 
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 addPdctTrf(PEPISATransfer5 pdctTrf) {
        getPdctTrf().add(pdctTrf);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public RequestForPEPOrISAOrPortfolioInformationV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
