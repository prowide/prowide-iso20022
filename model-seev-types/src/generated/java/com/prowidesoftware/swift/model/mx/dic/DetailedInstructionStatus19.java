
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
 * Information about a meeting instruction vote.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedInstructionStatus19", propOrder = {
    "snglInstrId",
    "acctId",
    "acctOwnr",
    "subAcctId",
    "rghtsHldr",
    "prxy",
    "stgInstr",
    "modltyOfCntg",
    "voteRctDtTm",
    "votePerRsltn"
})
public class DetailedInstructionStatus19 {

    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification231Choice acctOwnr;
    @XmlElement(name = "SubAcctId")
    protected String subAcctId;
    @XmlElement(name = "RghtsHldr")
    protected List<PartyIdentification246Choice> rghtsHldr;
    @XmlElement(name = "Prxy")
    protected PartyIdentification232Choice prxy;
    @XmlElement(name = "StgInstr")
    protected Boolean stgInstr;
    @XmlElement(name = "ModltyOfCntg", required = true)
    protected ModalityOfCounting1Choice modltyOfCntg;
    @XmlElement(name = "VoteRctDtTm")
    protected DateAndDateTime1Choice voteRctDtTm;
    @XmlElement(name = "VotePerRsltn")
    protected List<Vote19> votePerRsltn;

    /**
     * Gets the value of the snglInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrId() {
        return snglInstrId;
    }

    /**
     * Sets the value of the snglInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionStatus19 setSnglInstrId(String value) {
        this.snglInstrId = value;
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
    public DetailedInstructionStatus19 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification231Choice }
     *     
     */
    public PartyIdentification231Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification231Choice }
     *     
     */
    public DetailedInstructionStatus19 setAcctOwnr(PartyIdentification231Choice value) {
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
    public DetailedInstructionStatus19 setSubAcctId(String value) {
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
     * {@link PartyIdentification246Choice }
     * 
     * 
     */
    public List<PartyIdentification246Choice> getRghtsHldr() {
        if (rghtsHldr == null) {
            rghtsHldr = new ArrayList<PartyIdentification246Choice>();
        }
        return this.rghtsHldr;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public DetailedInstructionStatus19 setPrxy(PartyIdentification232Choice value) {
        this.prxy = value;
        return this;
    }

    /**
     * Gets the value of the stgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgInstr() {
        return stgInstr;
    }

    /**
     * Sets the value of the stgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DetailedInstructionStatus19 setStgInstr(Boolean value) {
        this.stgInstr = value;
        return this;
    }

    /**
     * Gets the value of the modltyOfCntg property.
     * 
     * @return
     *     possible object is
     *     {@link ModalityOfCounting1Choice }
     *     
     */
    public ModalityOfCounting1Choice getModltyOfCntg() {
        return modltyOfCntg;
    }

    /**
     * Sets the value of the modltyOfCntg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalityOfCounting1Choice }
     *     
     */
    public DetailedInstructionStatus19 setModltyOfCntg(ModalityOfCounting1Choice value) {
        this.modltyOfCntg = value;
        return this;
    }

    /**
     * Gets the value of the voteRctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getVoteRctDtTm() {
        return voteRctDtTm;
    }

    /**
     * Sets the value of the voteRctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DetailedInstructionStatus19 setVoteRctDtTm(DateAndDateTime1Choice value) {
        this.voteRctDtTm = value;
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
     * {@link Vote19 }
     * 
     * 
     */
    public List<Vote19> getVotePerRsltn() {
        if (votePerRsltn == null) {
            votePerRsltn = new ArrayList<Vote19>();
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
    public DetailedInstructionStatus19 addRghtsHldr(PartyIdentification246Choice rghtsHldr) {
        getRghtsHldr().add(rghtsHldr);
        return this;
    }

    /**
     * Adds a new item to the votePerRsltn list.
     * @see #getVotePerRsltn()
     * 
     */
    public DetailedInstructionStatus19 addVotePerRsltn(Vote19 votePerRsltn) {
        getVotePerRsltn().add(votePerRsltn);
        return this;
    }

}
