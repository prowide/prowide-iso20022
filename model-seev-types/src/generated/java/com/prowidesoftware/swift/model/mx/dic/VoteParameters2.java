
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "VoteParameters2", propOrder = {
    "sctiesQtyReqrdToVote",
    "prtlVoteAllwd",
    "spltVoteAllwd",
    "voteDdln",
    "voteSTPDdln",
    "voteMktDdln",
    "voteMthds",
    "vtngBlltElctrncAdr",
    "vtngBlltReqAdr",
    "rvcbltyDdln",
    "rvcbltySTPDdln",
    "rvcbltyMktDdln",
    "bnfclOwnrDsclsr",
    "voteInstrTp",
    "incntivPrm",
    "voteWthPrmDdln",
    "voteWthPrmSTPDdln",
    "voteWthPrmMktDdln",
    "addtlVtngRqrmnts"
})
public class VoteParameters2 {

    @XmlElement(name = "SctiesQtyReqrdToVote")
    protected BigDecimal sctiesQtyReqrdToVote;
    @XmlElement(name = "PrtlVoteAllwd")
    protected boolean prtlVoteAllwd;
    @XmlElement(name = "SpltVoteAllwd")
    protected boolean spltVoteAllwd;
    @XmlElement(name = "VoteDdln")
    protected DateFormat2Choice voteDdln;
    @XmlElement(name = "VoteSTPDdln")
    protected DateFormat2Choice voteSTPDdln;
    @XmlElement(name = "VoteMktDdln")
    protected DateFormat2Choice voteMktDdln;
    @XmlElement(name = "VoteMthds")
    protected VoteMethods voteMthds;
    @XmlElement(name = "VtngBlltElctrncAdr")
    protected CommunicationAddress4 vtngBlltElctrncAdr;
    @XmlElement(name = "VtngBlltReqAdr")
    protected PostalAddress1 vtngBlltReqAdr;
    @XmlElement(name = "RvcbltyDdln")
    protected DateFormat2Choice rvcbltyDdln;
    @XmlElement(name = "RvcbltySTPDdln")
    protected DateFormat2Choice rvcbltySTPDdln;
    @XmlElement(name = "RvcbltyMktDdln")
    protected DateFormat2Choice rvcbltyMktDdln;
    @XmlElement(name = "BnfclOwnrDsclsr")
    protected boolean bnfclOwnrDsclsr;
    @XmlElement(name = "VoteInstrTp")
    @XmlSchemaType(name = "string")
    protected List<VoteInstruction2Code> voteInstrTp;
    @XmlElement(name = "IncntivPrm")
    protected IncentivePremium3 incntivPrm;
    @XmlElement(name = "VoteWthPrmDdln")
    protected DateFormat2Choice voteWthPrmDdln;
    @XmlElement(name = "VoteWthPrmSTPDdln")
    protected DateFormat2Choice voteWthPrmSTPDdln;
    @XmlElement(name = "VoteWthPrmMktDdln")
    protected DateFormat2Choice voteWthPrmMktDdln;
    @XmlElement(name = "AddtlVtngRqrmnts")
    protected String addtlVtngRqrmnts;

    /**
     * Gets the value of the sctiesQtyReqrdToVote property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSctiesQtyReqrdToVote() {
        return sctiesQtyReqrdToVote;
    }

    /**
     * Sets the value of the sctiesQtyReqrdToVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public VoteParameters2 setSctiesQtyReqrdToVote(BigDecimal value) {
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
    public VoteParameters2 setPrtlVoteAllwd(boolean value) {
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
    public VoteParameters2 setSpltVoteAllwd(boolean value) {
        this.spltVoteAllwd = value;
        return this;
    }

    /**
     * Gets the value of the voteDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getVoteDdln() {
        return voteDdln;
    }

    /**
     * Sets the value of the voteDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setVoteDdln(DateFormat2Choice value) {
        this.voteDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getVoteSTPDdln() {
        return voteSTPDdln;
    }

    /**
     * Sets the value of the voteSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setVoteSTPDdln(DateFormat2Choice value) {
        this.voteSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getVoteMktDdln() {
        return voteMktDdln;
    }

    /**
     * Sets the value of the voteMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setVoteMktDdln(DateFormat2Choice value) {
        this.voteMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteMthds property.
     * 
     * @return
     *     possible object is
     *     {@link VoteMethods }
     *     
     */
    public VoteMethods getVoteMthds() {
        return voteMthds;
    }

    /**
     * Sets the value of the voteMthds property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteMethods }
     *     
     */
    public VoteParameters2 setVoteMthds(VoteMethods value) {
        this.voteMthds = value;
        return this;
    }

    /**
     * Gets the value of the vtngBlltElctrncAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress4 }
     *     
     */
    public CommunicationAddress4 getVtngBlltElctrncAdr() {
        return vtngBlltElctrncAdr;
    }

    /**
     * Sets the value of the vtngBlltElctrncAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress4 }
     *     
     */
    public VoteParameters2 setVtngBlltElctrncAdr(CommunicationAddress4 value) {
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
    public VoteParameters2 setVtngBlltReqAdr(PostalAddress1 value) {
        this.vtngBlltReqAdr = value;
        return this;
    }

    /**
     * Gets the value of the rvcbltyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRvcbltyDdln() {
        return rvcbltyDdln;
    }

    /**
     * Sets the value of the rvcbltyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setRvcbltyDdln(DateFormat2Choice value) {
        this.rvcbltyDdln = value;
        return this;
    }

    /**
     * Gets the value of the rvcbltySTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRvcbltySTPDdln() {
        return rvcbltySTPDdln;
    }

    /**
     * Sets the value of the rvcbltySTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setRvcbltySTPDdln(DateFormat2Choice value) {
        this.rvcbltySTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the rvcbltyMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRvcbltyMktDdln() {
        return rvcbltyMktDdln;
    }

    /**
     * Sets the value of the rvcbltyMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setRvcbltyMktDdln(DateFormat2Choice value) {
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
    public VoteParameters2 setBnfclOwnrDsclsr(boolean value) {
        this.bnfclOwnrDsclsr = value;
        return this;
    }

    /**
     * Gets the value of the voteInstrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voteInstrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteInstrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoteInstruction2Code }
     * 
     * 
     */
    public List<VoteInstruction2Code> getVoteInstrTp() {
        if (voteInstrTp == null) {
            voteInstrTp = new ArrayList<VoteInstruction2Code>();
        }
        return this.voteInstrTp;
    }

    /**
     * Gets the value of the incntivPrm property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremium3 }
     *     
     */
    public IncentivePremium3 getIncntivPrm() {
        return incntivPrm;
    }

    /**
     * Sets the value of the incntivPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremium3 }
     *     
     */
    public VoteParameters2 setIncntivPrm(IncentivePremium3 value) {
        this.incntivPrm = value;
        return this;
    }

    /**
     * Gets the value of the voteWthPrmDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getVoteWthPrmDdln() {
        return voteWthPrmDdln;
    }

    /**
     * Sets the value of the voteWthPrmDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setVoteWthPrmDdln(DateFormat2Choice value) {
        this.voteWthPrmDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteWthPrmSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getVoteWthPrmSTPDdln() {
        return voteWthPrmSTPDdln;
    }

    /**
     * Sets the value of the voteWthPrmSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setVoteWthPrmSTPDdln(DateFormat2Choice value) {
        this.voteWthPrmSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteWthPrmMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getVoteWthPrmMktDdln() {
        return voteWthPrmMktDdln;
    }

    /**
     * Sets the value of the voteWthPrmMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public VoteParameters2 setVoteWthPrmMktDdln(DateFormat2Choice value) {
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
    public VoteParameters2 setAddtlVtngRqrmnts(String value) {
        this.addtlVtngRqrmnts = value;
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
     * Adds a new item to the voteInstrTp list.
     * @see #getVoteInstrTp()
     * 
     */
    public VoteParameters2 addVoteInstrTp(VoteInstruction2Code voteInstrTp) {
        getVoteInstrTp().add(voteInstrTp);
        return this;
    }

}
