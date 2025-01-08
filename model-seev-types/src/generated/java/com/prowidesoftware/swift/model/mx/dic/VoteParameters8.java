
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
@XmlType(name = "VoteParameters8", propOrder = {
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
public class VoteParameters8 {

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
    protected VoteMethods5 voteMthds;
    @XmlElement(name = "VtngBlltElctrncAdr")
    protected CommunicationAddress11 vtngBlltElctrncAdr;
    @XmlElement(name = "VtngBlltReqAdr")
    protected PostalAddress1 vtngBlltReqAdr;
    @XmlElement(name = "RvcbltyDdln")
    protected DateFormat58Choice rvcbltyDdln;
    @XmlElement(name = "RvcbltyMktDdln")
    protected DateFormat58Choice rvcbltyMktDdln;
    @XmlElement(name = "BnfclOwnrDsclsr")
    protected Boolean bnfclOwnrDsclsr;
    @XmlElement(name = "EarlyIncntivPrm")
    protected IncentivePremium5 earlyIncntivPrm;
    @XmlElement(name = "IncntivPrm")
    protected IncentivePremium5 incntivPrm;
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
    public VoteParameters8 setSctiesQtyReqrdToVote(FinancialInstrumentQuantity18Choice value) {
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
    public VoteParameters8 setPrtlVoteAllwd(boolean value) {
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
    public VoteParameters8 setSpltVoteAllwd(boolean value) {
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
    public VoteParameters8 setVoteDdln(DateFormat58Choice value) {
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
    public VoteParameters8 setVoteMktDdln(DateFormat58Choice value) {
        this.voteMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteMthds property.
     * 
     * @return
     *     possible object is
     *     {@link VoteMethods5 }
     *     
     */
    public VoteMethods5 getVoteMthds() {
        return voteMthds;
    }

    /**
     * Sets the value of the voteMthds property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteMethods5 }
     *     
     */
    public VoteParameters8 setVoteMthds(VoteMethods5 value) {
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
    public VoteParameters8 setVtngBlltElctrncAdr(CommunicationAddress11 value) {
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
    public VoteParameters8 setVtngBlltReqAdr(PostalAddress1 value) {
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
    public VoteParameters8 setRvcbltyDdln(DateFormat58Choice value) {
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
    public VoteParameters8 setRvcbltyMktDdln(DateFormat58Choice value) {
        this.rvcbltyMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrDsclsr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBnfclOwnrDsclsr() {
        return bnfclOwnrDsclsr;
    }

    /**
     * Sets the value of the bnfclOwnrDsclsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VoteParameters8 setBnfclOwnrDsclsr(Boolean value) {
        this.bnfclOwnrDsclsr = value;
        return this;
    }

    /**
     * Gets the value of the earlyIncntivPrm property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremium5 }
     *     
     */
    public IncentivePremium5 getEarlyIncntivPrm() {
        return earlyIncntivPrm;
    }

    /**
     * Sets the value of the earlyIncntivPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremium5 }
     *     
     */
    public VoteParameters8 setEarlyIncntivPrm(IncentivePremium5 value) {
        this.earlyIncntivPrm = value;
        return this;
    }

    /**
     * Gets the value of the incntivPrm property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremium5 }
     *     
     */
    public IncentivePremium5 getIncntivPrm() {
        return incntivPrm;
    }

    /**
     * Sets the value of the incntivPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremium5 }
     *     
     */
    public VoteParameters8 setIncntivPrm(IncentivePremium5 value) {
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
    public VoteParameters8 setEarlyVoteWthPrmDdln(DateFormat58Choice value) {
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
    public VoteParameters8 setVoteWthPrmDdln(DateFormat58Choice value) {
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
    public VoteParameters8 setVoteWthPrmMktDdln(DateFormat58Choice value) {
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
    public VoteParameters8 setAddtlVtngRqrmnts(String value) {
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
    public VoteParameters8 setPrvsInstrInvldtyInd(Boolean value) {
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
