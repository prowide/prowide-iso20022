
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
 * Status applying to individual instructions of a MeetingInstruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedInstructionStatus10", propOrder = {
    "instrId",
    "acctId",
    "acctOwnr",
    "subAcctId",
    "rghtsHldr",
    "stgInstr",
    "votePerRsltn"
})
public class DetailedInstructionStatus10 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification40Choice acctOwnr;
    @XmlElement(name = "SubAcctId")
    protected String subAcctId;
    @XmlElement(name = "RghtsHldr")
    protected List<PartyIdentification40Choice> rghtsHldr;
    @XmlElement(name = "StgInstr")
    protected boolean stgInstr;
    @XmlElement(name = "VotePerRsltn")
    protected List<Vote6> votePerRsltn;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionStatus10 setInstrId(String value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionStatus10 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification40Choice }
     *     
     */
    public PartyIdentification40Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification40Choice }
     *     
     */
    public DetailedInstructionStatus10 setAcctOwnr(PartyIdentification40Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the subAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAcctId() {
        return subAcctId;
    }

    /**
     * Sets the value of the subAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionStatus10 setSubAcctId(String value) {
        this.subAcctId = value;
        return this;
    }

    /**
     * Gets the value of the rghtsHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rghtsHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRghtsHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification40Choice }
     * 
     * 
     */
    public List<PartyIdentification40Choice> getRghtsHldr() {
        if (rghtsHldr == null) {
            rghtsHldr = new ArrayList<PartyIdentification40Choice>();
        }
        return this.rghtsHldr;
    }

    /**
     * Gets the value of the stgInstr property.
     * 
     */
    public boolean isStgInstr() {
        return stgInstr;
    }

    /**
     * Sets the value of the stgInstr property.
     * 
     */
    public DetailedInstructionStatus10 setStgInstr(boolean value) {
        this.stgInstr = value;
        return this;
    }

    /**
     * Gets the value of the votePerRsltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the votePerRsltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVotePerRsltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote6 }
     * 
     * 
     */
    public List<Vote6> getVotePerRsltn() {
        if (votePerRsltn == null) {
            votePerRsltn = new ArrayList<Vote6>();
        }
        return this.votePerRsltn;
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
     * Adds a new item to the rghtsHldr list.
     * @see #getRghtsHldr()
     * 
     */
    public DetailedInstructionStatus10 addRghtsHldr(PartyIdentification40Choice rghtsHldr) {
        getRghtsHldr().add(rghtsHldr);
        return this;
    }

    /**
     * Adds a new item to the votePerRsltn list.
     * @see #getVotePerRsltn()
     * 
     */
    public DetailedInstructionStatus10 addVotePerRsltn(Vote6 votePerRsltn) {
        getVotePerRsltn().add(votePerRsltn);
        return this;
    }

}
