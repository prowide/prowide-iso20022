
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "VoteParameters", propOrder = {
    "sctiesQtyReqrdToVote",
    "prtlVoteAllwd",
    "spltVoteAllwd",
    "voteDdln",
    "voteElctrncDdln",
    "voteMktDdln",
    "voteMthds",
    "vtngBlltElctrncAdr",
    "vtngBlltReqAdr",
    "bnfclOwnrDsclsr",
    "addtlVtngRqrmnts",
    "incntivPrm",
    "voteInstrTp",
    "voteWthPrmDdln",
    "voteWthPrmElctrncDdln",
    "voteWthPrmMktDdln"
})
public class VoteParameters {

    @XmlElement(name = "SctiesQtyReqrdToVote")
    protected BigDecimal sctiesQtyReqrdToVote;
    @XmlElement(name = "PrtlVoteAllwd")
    protected Boolean prtlVoteAllwd;
    @XmlElement(name = "SpltVoteAllwd")
    protected Boolean spltVoteAllwd;
    @XmlElement(name = "VoteDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voteDdln;
    @XmlElement(name = "VoteElctrncDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voteElctrncDdln;
    @XmlElement(name = "VoteMktDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voteMktDdln;
    @XmlElement(name = "VoteMthds")
    protected VoteMethods voteMthds;
    @XmlElement(name = "VtngBlltElctrncAdr")
    protected CommunicationAddress4 vtngBlltElctrncAdr;
    @XmlElement(name = "VtngBlltReqAdr")
    protected PostalAddress1 vtngBlltReqAdr;
    @XmlElement(name = "BnfclOwnrDsclsr")
    protected Boolean bnfclOwnrDsclsr;
    @XmlElement(name = "AddtlVtngRqrmnts")
    protected String addtlVtngRqrmnts;
    @XmlElement(name = "IncntivPrm")
    protected IncentivePremium1 incntivPrm;
    @XmlElement(name = "VoteInstrTp")
    @XmlSchemaType(name = "string")
    protected List<VoteInstruction2Code> voteInstrTp;
    @XmlElement(name = "VoteWthPrmDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voteWthPrmDdln;
    @XmlElement(name = "VoteWthPrmElctrncDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voteWthPrmElctrncDdln;
    @XmlElement(name = "VoteWthPrmMktDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voteWthPrmMktDdln;

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
    public VoteParameters setSctiesQtyReqrdToVote(BigDecimal value) {
        this.sctiesQtyReqrdToVote = value;
        return this;
    }

    /**
     * Gets the value of the prtlVoteAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlVoteAllwd() {
        return prtlVoteAllwd;
    }

    /**
     * Sets the value of the prtlVoteAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VoteParameters setPrtlVoteAllwd(Boolean value) {
        this.prtlVoteAllwd = value;
        return this;
    }

    /**
     * Gets the value of the spltVoteAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltVoteAllwd() {
        return spltVoteAllwd;
    }

    /**
     * Sets the value of the spltVoteAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VoteParameters setSpltVoteAllwd(Boolean value) {
        this.spltVoteAllwd = value;
        return this;
    }

    /**
     * Gets the value of the voteDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVoteDdln() {
        return voteDdln;
    }

    /**
     * Sets the value of the voteDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteParameters setVoteDdln(XMLGregorianCalendar value) {
        this.voteDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteElctrncDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVoteElctrncDdln() {
        return voteElctrncDdln;
    }

    /**
     * Sets the value of the voteElctrncDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteParameters setVoteElctrncDdln(XMLGregorianCalendar value) {
        this.voteElctrncDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVoteMktDdln() {
        return voteMktDdln;
    }

    /**
     * Sets the value of the voteMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteParameters setVoteMktDdln(XMLGregorianCalendar value) {
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
    public VoteParameters setVoteMthds(VoteMethods value) {
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
    public VoteParameters setVtngBlltElctrncAdr(CommunicationAddress4 value) {
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
    public VoteParameters setVtngBlltReqAdr(PostalAddress1 value) {
        this.vtngBlltReqAdr = value;
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
    public VoteParameters setBnfclOwnrDsclsr(Boolean value) {
        this.bnfclOwnrDsclsr = value;
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
    public VoteParameters setAddtlVtngRqrmnts(String value) {
        this.addtlVtngRqrmnts = value;
        return this;
    }

    /**
     * Gets the value of the incntivPrm property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremium1 }
     *     
     */
    public IncentivePremium1 getIncntivPrm() {
        return incntivPrm;
    }

    /**
     * Sets the value of the incntivPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremium1 }
     *     
     */
    public VoteParameters setIncntivPrm(IncentivePremium1 value) {
        this.incntivPrm = value;
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
     * Gets the value of the voteWthPrmDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVoteWthPrmDdln() {
        return voteWthPrmDdln;
    }

    /**
     * Sets the value of the voteWthPrmDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteParameters setVoteWthPrmDdln(XMLGregorianCalendar value) {
        this.voteWthPrmDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteWthPrmElctrncDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVoteWthPrmElctrncDdln() {
        return voteWthPrmElctrncDdln;
    }

    /**
     * Sets the value of the voteWthPrmElctrncDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteParameters setVoteWthPrmElctrncDdln(XMLGregorianCalendar value) {
        this.voteWthPrmElctrncDdln = value;
        return this;
    }

    /**
     * Gets the value of the voteWthPrmMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVoteWthPrmMktDdln() {
        return voteWthPrmMktDdln;
    }

    /**
     * Sets the value of the voteWthPrmMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteParameters setVoteWthPrmMktDdln(XMLGregorianCalendar value) {
        this.voteWthPrmMktDdln = value;
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
    public VoteParameters addVoteInstrTp(VoteInstruction2Code voteInstrTp) {
        getVoteInstrTp().add(voteInstrTp);
        return this;
    }

}
