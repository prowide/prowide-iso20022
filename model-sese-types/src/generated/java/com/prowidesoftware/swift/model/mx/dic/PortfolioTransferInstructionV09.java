
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
 * Scope
 * The PortfolioTransferInstruction message is sent by an instructing party, for example, a (new) plan manager (transferee), to the executing party, for example, a (old) plan manager (transferor), on behalf of the initiating party, for example, an investor (client), to instruct the transfer of financial instruments from the client’s account at the old plan manager (transferor) to the clients account at the new plan manager (transferee). 
 * Usage
 * The PortfolioTransferInstruction message is used to instruct one or more portfolio transfers for one client. Each portfolio transfer is for delivery to the same account. The account may be owned by one or more individual investors or one or more corporate investors.
 * If the instructing party does not have enough information to instruct the portfolio transfer, then it must first send an AccountHoldingInformationRequest message to the executing party in order to receive an AccountHoldingInformation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransferInstructionV09", propOrder = {
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
    "trfrAcct",
    "nmneeAcct",
    "trfee",
    "intrmyInf",
    "pdctTrf",
    "mktPrctcVrsn",
    "xtnsn"
})
public class PortfolioTransferInstructionV09 {

    @XmlElement(name = "MsgRef", required = true)
    protected MessageIdentification1 msgRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference11 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference10 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "PmryIndvInvstr")
    protected IndividualPerson8 pmryIndvInvstr;
    @XmlElement(name = "ScndryIndvInvstr")
    protected IndividualPerson8 scndryIndvInvstr;
    @XmlElement(name = "OthrIndvInvstr")
    protected List<IndividualPerson8> othrIndvInvstr;
    @XmlElement(name = "PmryCorpInvstr")
    protected Organisation36 pmryCorpInvstr;
    @XmlElement(name = "ScndryCorpInvstr")
    protected Organisation36 scndryCorpInvstr;
    @XmlElement(name = "OthrCorpInvstr")
    protected List<Organisation36> othrCorpInvstr;
    @XmlElement(name = "TrfrAcct", required = true)
    protected InvestmentAccount69 trfrAcct;
    @XmlElement(name = "NmneeAcct")
    protected InvestmentAccount69 nmneeAcct;
    @XmlElement(name = "Trfee", required = true)
    protected PartyIdentification132 trfee;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary43> intrmyInf;
    @XmlElement(name = "PdctTrf", required = true)
    protected List<PortfolioTransfer3> pdctTrf;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
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
    public PortfolioTransferInstructionV09 setMsgRef(MessageIdentification1 value) {
        this.msgRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference11 }
     *     
     */
    public AdditionalReference11 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference11 }
     *     
     */
    public PortfolioTransferInstructionV09 setPoolRef(AdditionalReference11 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public PortfolioTransferInstructionV09 setPrvsRef(AdditionalReference10 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public PortfolioTransferInstructionV09 setRltdRef(AdditionalReference10 value) {
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
    public PortfolioTransferInstructionV09 setPmryIndvInvstr(IndividualPerson8 value) {
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
    public PortfolioTransferInstructionV09 setScndryIndvInvstr(IndividualPerson8 value) {
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
     *     {@link Organisation36 }
     *     
     */
    public Organisation36 getPmryCorpInvstr() {
        return pmryCorpInvstr;
    }

    /**
     * Sets the value of the pmryCorpInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation36 }
     *     
     */
    public PortfolioTransferInstructionV09 setPmryCorpInvstr(Organisation36 value) {
        this.pmryCorpInvstr = value;
        return this;
    }

    /**
     * Gets the value of the scndryCorpInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation36 }
     *     
     */
    public Organisation36 getScndryCorpInvstr() {
        return scndryCorpInvstr;
    }

    /**
     * Sets the value of the scndryCorpInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation36 }
     *     
     */
    public PortfolioTransferInstructionV09 setScndryCorpInvstr(Organisation36 value) {
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
     * {@link Organisation36 }
     * 
     * 
     */
    public List<Organisation36> getOthrCorpInvstr() {
        if (othrCorpInvstr == null) {
            othrCorpInvstr = new ArrayList<Organisation36>();
        }
        return this.othrCorpInvstr;
    }

    /**
     * Gets the value of the trfrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount69 }
     *     
     */
    public InvestmentAccount69 getTrfrAcct() {
        return trfrAcct;
    }

    /**
     * Sets the value of the trfrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount69 }
     *     
     */
    public PortfolioTransferInstructionV09 setTrfrAcct(InvestmentAccount69 value) {
        this.trfrAcct = value;
        return this;
    }

    /**
     * Gets the value of the nmneeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount69 }
     *     
     */
    public InvestmentAccount69 getNmneeAcct() {
        return nmneeAcct;
    }

    /**
     * Sets the value of the nmneeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount69 }
     *     
     */
    public PortfolioTransferInstructionV09 setNmneeAcct(InvestmentAccount69 value) {
        this.nmneeAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getTrfee() {
        return trfee;
    }

    /**
     * Sets the value of the trfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PortfolioTransferInstructionV09 setTrfee(PartyIdentification132 value) {
        this.trfee = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary43 }
     * 
     * 
     */
    public List<Intermediary43> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary43>();
        }
        return this.intrmyInf;
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
     * {@link PortfolioTransfer3 }
     * 
     * 
     */
    public List<PortfolioTransfer3> getPdctTrf() {
        if (pdctTrf == null) {
            pdctTrf = new ArrayList<PortfolioTransfer3>();
        }
        return this.pdctTrf;
    }

    /**
     * Gets the value of the mktPrctcVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public MarketPracticeVersion1 getMktPrctcVrsn() {
        return mktPrctcVrsn;
    }

    /**
     * Sets the value of the mktPrctcVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public PortfolioTransferInstructionV09 setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
        return this;
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
    public PortfolioTransferInstructionV09 addOthrIndvInvstr(IndividualPerson8 othrIndvInvstr) {
        getOthrIndvInvstr().add(othrIndvInvstr);
        return this;
    }

    /**
     * Adds a new item to the othrCorpInvstr list.
     * @see #getOthrCorpInvstr()
     * 
     */
    public PortfolioTransferInstructionV09 addOthrCorpInvstr(Organisation36 othrCorpInvstr) {
        getOthrCorpInvstr().add(othrCorpInvstr);
        return this;
    }

    /**
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public PortfolioTransferInstructionV09 addIntrmyInf(Intermediary43 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the pdctTrf list.
     * @see #getPdctTrf()
     * 
     */
    public PortfolioTransferInstructionV09 addPdctTrf(PortfolioTransfer3 pdctTrf) {
        getPdctTrf().add(pdctTrf);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public PortfolioTransferInstructionV09 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
