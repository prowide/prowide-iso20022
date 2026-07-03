
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
 * An executing party, for example, a (old) plan manager (Transferor), sends the PortfolioTransferConfirmation message to the instructing party, for example, a (new) plan manager (Transferee), to confirm the transfer of one or more ISA or portfolio products from the client's account at the old plan manager (Transferor) to the client's account at the new plan manager (Transferee) through a nominee account.
 * Usage
 * The PortfolioTransferConfirmation message is used to confirm the transfer of one or more ISA or portfolio products.
 * The reference of each product transfer confirmation is identified in TransferConfirmationIdentification. The reference of the original product transfer is specified in TransferInstructionReference. The message identification of the PortfolioTransferInstruction message in which the product transfers were conveyed may also be quoted in RelatedReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransferConfirmationV07", propOrder = {
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
    "cshAcct",
    "pdctTrf",
    "mktPrctcVrsn",
    "xtnsn"
})
public class PortfolioTransferConfirmationV07 {

    @XmlElement(name = "MsgRef", required = true)
    protected MessageIdentification1 msgRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference6 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference6 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference6 rltdRef;
    @XmlElement(name = "PmryIndvInvstr")
    protected IndividualPerson8 pmryIndvInvstr;
    @XmlElement(name = "ScndryIndvInvstr")
    protected IndividualPerson8 scndryIndvInvstr;
    @XmlElement(name = "OthrIndvInvstr")
    protected List<IndividualPerson8> othrIndvInvstr;
    @XmlElement(name = "PmryCorpInvstr")
    protected Organisation21 pmryCorpInvstr;
    @XmlElement(name = "ScndryCorpInvstr")
    protected Organisation21 scndryCorpInvstr;
    @XmlElement(name = "OthrCorpInvstr")
    protected List<Organisation21> othrCorpInvstr;
    @XmlElement(name = "TrfrAcct", required = true)
    protected Account19 trfrAcct;
    @XmlElement(name = "NmneeAcct")
    protected Account19 nmneeAcct;
    @XmlElement(name = "Trfee", required = true)
    protected PartyIdentification70Choice trfee;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary34> intrmyInf;
    @XmlElement(name = "CshAcct")
    protected CashAccount34 cshAcct;
    @XmlElement(name = "PdctTrf", required = true)
    protected List<ISATransfer26> pdctTrf;
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
    public PortfolioTransferConfirmationV07 setMsgRef(MessageIdentification1 value) {
        this.msgRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public PortfolioTransferConfirmationV07 setPoolRef(AdditionalReference6 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public PortfolioTransferConfirmationV07 setPrvsRef(AdditionalReference6 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public PortfolioTransferConfirmationV07 setRltdRef(AdditionalReference6 value) {
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
    public PortfolioTransferConfirmationV07 setPmryIndvInvstr(IndividualPerson8 value) {
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
    public PortfolioTransferConfirmationV07 setScndryIndvInvstr(IndividualPerson8 value) {
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
     *     {@link Organisation21 }
     *     
     */
    public Organisation21 getPmryCorpInvstr() {
        return pmryCorpInvstr;
    }

    /**
     * Sets the value of the pmryCorpInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation21 }
     *     
     */
    public PortfolioTransferConfirmationV07 setPmryCorpInvstr(Organisation21 value) {
        this.pmryCorpInvstr = value;
        return this;
    }

    /**
     * Gets the value of the scndryCorpInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation21 }
     *     
     */
    public Organisation21 getScndryCorpInvstr() {
        return scndryCorpInvstr;
    }

    /**
     * Sets the value of the scndryCorpInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation21 }
     *     
     */
    public PortfolioTransferConfirmationV07 setScndryCorpInvstr(Organisation21 value) {
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
     * {@link Organisation21 }
     * 
     * 
     */
    public List<Organisation21> getOthrCorpInvstr() {
        if (othrCorpInvstr == null) {
            othrCorpInvstr = new ArrayList<Organisation21>();
        }
        return this.othrCorpInvstr;
    }

    /**
     * Gets the value of the trfrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account19 }
     *     
     */
    public Account19 getTrfrAcct() {
        return trfrAcct;
    }

    /**
     * Sets the value of the trfrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account19 }
     *     
     */
    public PortfolioTransferConfirmationV07 setTrfrAcct(Account19 value) {
        this.trfrAcct = value;
        return this;
    }

    /**
     * Gets the value of the nmneeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account19 }
     *     
     */
    public Account19 getNmneeAcct() {
        return nmneeAcct;
    }

    /**
     * Sets the value of the nmneeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account19 }
     *     
     */
    public PortfolioTransferConfirmationV07 setNmneeAcct(Account19 value) {
        this.nmneeAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification70Choice getTrfee() {
        return trfee;
    }

    /**
     * Sets the value of the trfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PortfolioTransferConfirmationV07 setTrfee(PartyIdentification70Choice value) {
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
     * {@link Intermediary34 }
     * 
     * 
     */
    public List<Intermediary34> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary34>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount34 }
     *     
     */
    public CashAccount34 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount34 }
     *     
     */
    public PortfolioTransferConfirmationV07 setCshAcct(CashAccount34 value) {
        this.cshAcct = value;
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
     * {@link ISATransfer26 }
     * 
     * 
     */
    public List<ISATransfer26> getPdctTrf() {
        if (pdctTrf == null) {
            pdctTrf = new ArrayList<ISATransfer26>();
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
    public PortfolioTransferConfirmationV07 setMktPrctcVrsn(MarketPracticeVersion1 value) {
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
    public PortfolioTransferConfirmationV07 addOthrIndvInvstr(IndividualPerson8 othrIndvInvstr) {
        getOthrIndvInvstr().add(othrIndvInvstr);
        return this;
    }

    /**
     * Adds a new item to the othrCorpInvstr list.
     * @see #getOthrCorpInvstr()
     * 
     */
    public PortfolioTransferConfirmationV07 addOthrCorpInvstr(Organisation21 othrCorpInvstr) {
        getOthrCorpInvstr().add(othrCorpInvstr);
        return this;
    }

    /**
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public PortfolioTransferConfirmationV07 addIntrmyInf(Intermediary34 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the pdctTrf list.
     * @see #getPdctTrf()
     * 
     */
    public PortfolioTransferConfirmationV07 addPdctTrf(ISATransfer26 pdctTrf) {
        getPdctTrf().add(pdctTrf);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public PortfolioTransferConfirmationV07 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
