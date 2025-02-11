
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information describing how the voting process is organised.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteParameters5", propOrder = {
    "sctiesQtyReqrdToVote",
    "prtlVoteAllwd",
    "spltVoteAllwd",
    "voteDdln",
    "voteMktDdln",
    "voteMthds",
    "vtngBlltElctrncAdr",
    "vtngBlltReqAdr",
    "rvcbltyDdln",
    "rvcbltyMktDdln",
    "bnfclOwnrDsclsr",
    "earlyIncntivPrm",
    "incntivPrm",
    "earlyVoteWthPrmDdln",
    "voteWthPrmDdln",
    "voteWthPrmMktDdln",
    "addtlVtngRqrmnts",
    "prvsInstrInvldtyInd"
})
public class VoteParameters5 {

    @XmlElement(name = "SctiesQtyReqrdToVote")
    protected FinancialInstrumentQuantity18Choice sctiesQtyReqrdToVote;
    @XmlElement(name = "PrtlVoteAllwd")
    protected boolean prtlVoteAllwd;
    @XmlElement(name = "SpltVoteAllwd")
    protected boolean spltVoteAllwd;
    @XmlElement(name = "VoteDdln")
    protected DateFormat58Choice voteDdln;
    @XmlElement(name = "VoteMktDdln")
    protected DateFormat58Choice voteMktDdln;
    @XmlElement(name = "VoteMthds")
    protected VoteMethods3 voteMthds;
    @XmlElement(name = "VtngBlltElctrncAdr")
    protected CommunicationAddress11 vtngBlltElctrncAdr;
    @XmlElement(name = "VtngBlltReqAdr")
    protected PostalAddress1 vtngBlltReqAdr;
    @XmlElement(name = "RvcbltyDdln")
    protected DateFormat58Choice rvcbltyDdln;
    @XmlElement(name = "RvcbltyMktDdln")
    protected DateFormat58Choice rvcbltyMktDdln;
    @XmlElement(name = "BnfclOwnrDsclsr")
    protected boolean bnfclOwnrDsclsr;
    @XmlElement(name = "EarlyIncntivPrm")
    protected IncentivePremium4 earlyIncntivPrm;
    @XmlElement(name = "IncntivPrm")
    protected IncentivePremium4 incntivPrm;
    @XmlElement(name = "EarlyVoteWthPrmDdln")
    protected DateFormat58Choice earlyVoteWthPrmDdln;
    @XmlElement(name = "VoteWthPrmDdln")
    protected DateFormat58Choice voteWthPrmDdln;
    @XmlElement(name = "VoteWthPrmMktDdln")
    protected DateFormat58Choice voteWthPrmMktDdln;
    @XmlElement(name = "AddtlVtngRqrmnts")
    protected String addtlVtngRqrmnts;
    @XmlElement(name = "PrvsInstrInvldtyInd")
    protected Boolean prvsInstrInvldtyInd;

    /**
     * Gets the value of the sctiesQtyReqrdToVote property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getSctiesQtyReqrdToVote() {
        return sctiesQtyReqrdToVote;
    }

    /**
     * Sets the value of the sctiesQtyReqrdToVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public VoteParameters5 setSctiesQtyReqrdToVote(FinancialInstrumentQuantity18Choice value) {
        this.sctiesQtyReqrdToVote = value;
        return this;
    }

    /**
     * Gets the value of the prtlVoteAllwd property.
     * 
     */
    public boolean isPrtlVoteAllwd() {
        return prtlVoteAllwd;
    }

    /**
     * Sets the value of the prtlVoteAllwd property.
     * 
     */
    public VoteParameters5 setPrtlVoteAllwd(boolean value) {
        this.prtlVoteAllwd = value;
        return this;
    }

    /**
     * Gets the value of the spltVoteAllwd property.
     * 
     */
    public boolean isSpltVoteAllwd() {
        return spltVoteAllwd;
    }

    /**
     * Sets the value of the spltVoteAllwd property.
     * 
     */
    public VoteParameters5 setSpltVoteAllwd(boolean value) {
        this.spltVoteAllwd = value;
        return this;
    }

    /**
     * Gets the value of the voteDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getVoteDdln() {
        return voteDdln;
    }

    /**
     * Sets the value of the voteDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public VoteParameters5 setVoteDdln(DateFormat58Choice value) {
        this.voteDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getVoteMktDdln() {
        return voteMktDdln;
    }

    /**
     * Sets the value of the voteMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public VoteParameters5 setVoteMktDdln(DateFormat58Choice value) {
        this.voteMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteMthds property.
     * 
     * @return
     *     possible object is
     *     {@link VoteMethods3 }
     *     
     */
    public VoteMethods3 getVoteMthds() {
        return voteMthds;
    }

    /**
     * Sets the value of the voteMthds property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteMethods3 }
     *     
     */
    public VoteParameters5 setVoteMthds(VoteMethods3 value) {
        this.voteMthds = value;
        return this;
    }

    /**
     * Gets the value of the vtngBlltElctrncAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress11 }
     *     
     */
    public CommunicationAddress11 getVtngBlltElctrncAdr() {
        return vtngBlltElctrncAdr;
    }

    /**
     * Sets the value of the vtngBlltElctrncAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress11 }
     *     
     */
    public VoteParameters5 setVtngBlltElctrncAdr(CommunicationAddress11 value) {
        this.vtngBlltElctrncAdr = value;
        return this;
    }

    /**
     * Gets the value of the vtngBlltReqAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getVtngBlltReqAdr() {
        return vtngBlltReqAdr;
    }

    /**
     * Sets the value of the vtngBlltReqAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public VoteParameters5 setVtngBlltReqAdr(PostalAddress1 value) {
        this.vtngBlltReqAdr = value;
        return this;
    }

    /**
     * Gets the value of the rvcbltyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRvcbltyDdln() {
        return rvcbltyDdln;
    }

    /**
     * Sets the value of the rvcbltyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public VoteParameters5 setRvcbltyDdln(DateFormat58Choice value) {
        this.rvcbltyDdln = value;
        return this;
    }

    /**
     * Gets the value of the rvcbltyMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRvcbltyMktDdln() {
        return rvcbltyMktDdln;
    }

    /**
     * Sets the value of the rvcbltyMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public VoteParameters5 setRvcbltyMktDdln(DateFormat58Choice value) {
        this.rvcbltyMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrDsclsr property.
     * 
     */
    public boolean isBnfclOwnrDsclsr() {
        return bnfclOwnrDsclsr;
    }

    /**
     * Sets the value of the bnfclOwnrDsclsr property.
     * 
     */
    public VoteParameters5 setBnfclOwnrDsclsr(boolean value) {
        this.bnfclOwnrDsclsr = value;
        return this;
    }

    /**
     * Gets the value of the earlyIncntivPrm property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremium4 }
     *     
     */
    public IncentivePremium4 getEarlyIncntivPrm() {
        return earlyIncntivPrm;
    }

    /**
     * Sets the value of the earlyIncntivPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremium4 }
     *     
     */
    public VoteParameters5 setEarlyIncntivPrm(IncentivePremium4 value) {
        this.earlyIncntivPrm = value;
        return this;
    }

    /**
     * Gets the value of the incntivPrm property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremium4 }
     *     
     */
    public IncentivePremium4 getIncntivPrm() {
        return incntivPrm;
    }

    /**
     * Sets the value of the incntivPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremium4 }
     *     
     */
    public VoteParameters5 setIncntivPrm(IncentivePremium4 value) {
        this.incntivPrm = value;
        return this;
    }

    /**
     * Gets the value of the earlyVoteWthPrmDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getEarlyVoteWthPrmDdln() {
        return earlyVoteWthPrmDdln;
    }

    /**
     * Sets the value of the earlyVoteWthPrmDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public VoteParameters5 setEarlyVoteWthPrmDdln(DateFormat58Choice value) {
        this.earlyVoteWthPrmDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteWthPrmDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getVoteWthPrmDdln() {
        return voteWthPrmDdln;
    }

    /**
     * Sets the value of the voteWthPrmDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public VoteParameters5 setVoteWthPrmDdln(DateFormat58Choice value) {
        this.voteWthPrmDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteWthPrmMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getVoteWthPrmMktDdln() {
        return voteWthPrmMktDdln;
    }

    /**
     * Sets the value of the voteWthPrmMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public VoteParameters5 setVoteWthPrmMktDdln(DateFormat58Choice value) {
        this.voteWthPrmMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the addtlVtngRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlVtngRqrmnts() {
        return addtlVtngRqrmnts;
    }

    /**
     * Sets the value of the addtlVtngRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteParameters5 setAddtlVtngRqrmnts(String value) {
        this.addtlVtngRqrmnts = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstrInvldtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrvsInstrInvldtyInd() {
        return prvsInstrInvldtyInd;
    }

    /**
     * Sets the value of the prvsInstrInvldtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VoteParameters5 setPrvsInstrInvldtyInd(Boolean value) {
        this.prvsInstrInvldtyInd = value;
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
