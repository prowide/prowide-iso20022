
package com.prowidesoftware.swift.model.mx.dic;

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
 * Resolutions at the agenda of a meeting and type of resolution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resolution5", propOrder = {
    "issrLabl",
    "desc",
    "listgGrpRsltnLabl",
    "tp",
    "forInfOnly",
    "voteTp",
    "sts",
    "submittdBySctyHldr",
    "rghtToWdrwInd",
    "voteInstrTp",
    "mgmtRcmmndtn",
    "ntifngPtyRcmmndtn",
    "entitlmnt",
    "vtngRghtsThrshldForApprvl",
    "urlAdr"
})
public class Resolution5 {

    @XmlElement(name = "IssrLabl", required = true)
    protected String issrLabl;
    @XmlElement(name = "Desc")
    protected List<ItemDescription1> desc;
    @XmlElement(name = "ListgGrpRsltnLabl")
    protected String listgGrpRsltnLabl;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ResolutionType2Code tp;
    @XmlElement(name = "ForInfOnly")
    protected boolean forInfOnly;
    @XmlElement(name = "VoteTp")
    @XmlSchemaType(name = "string")
    protected VoteType1Code voteTp;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ResolutionStatus1Code sts;
    @XmlElement(name = "SubmittdBySctyHldr")
    protected Boolean submittdBySctyHldr;
    @XmlElement(name = "RghtToWdrwInd")
    protected Boolean rghtToWdrwInd;
    @XmlElement(name = "VoteInstrTp")
    protected List<VoteInstructionType1> voteInstrTp;
    @XmlElement(name = "MgmtRcmmndtn")
    @XmlSchemaType(name = "string")
    protected VoteInstruction5Code mgmtRcmmndtn;
    @XmlElement(name = "NtifngPtyRcmmndtn")
    @XmlSchemaType(name = "string")
    protected VoteInstruction5Code ntifngPtyRcmmndtn;
    @XmlElement(name = "Entitlmnt")
    protected Entitlement1Choice entitlmnt;
    @XmlElement(name = "VtngRghtsThrshldForApprvl")
    protected NumberOrPercentage1Choice vtngRghtsThrshldForApprvl;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;

    /**
     * Gets the value of the issrLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrLabl() {
        return issrLabl;
    }

    /**
     * Sets the value of the issrLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Resolution5 setIssrLabl(String value) {
        this.issrLabl = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDescription1 }
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<ItemDescription1> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the listgGrpRsltnLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListgGrpRsltnLabl() {
        return listgGrpRsltnLabl;
    }

    /**
     * Sets the value of the listgGrpRsltnLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Resolution5 setListgGrpRsltnLabl(String value) {
        this.listgGrpRsltnLabl = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionType2Code }
     *     
     */
    public ResolutionType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionType2Code }
     *     
     */
    public Resolution5 setTp(ResolutionType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the forInfOnly property.
     * 
     */
    public boolean isForInfOnly() {
        return forInfOnly;
    }

    /**
     * Sets the value of the forInfOnly property.
     * 
     */
    public Resolution5 setForInfOnly(boolean value) {
        this.forInfOnly = value;
        return this;
    }

    /**
     * Gets the value of the voteTp property.
     * 
     * @return
     *     possible object is
     *     {@link VoteType1Code }
     *     
     */
    public VoteType1Code getVoteTp() {
        return voteTp;
    }

    /**
     * Sets the value of the voteTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteType1Code }
     *     
     */
    public Resolution5 setVoteTp(VoteType1Code value) {
        this.voteTp = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionStatus1Code }
     *     
     */
    public ResolutionStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionStatus1Code }
     *     
     */
    public Resolution5 setSts(ResolutionStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the submittdBySctyHldr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmittdBySctyHldr() {
        return submittdBySctyHldr;
    }

    /**
     * Sets the value of the submittdBySctyHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Resolution5 setSubmittdBySctyHldr(Boolean value) {
        this.submittdBySctyHldr = value;
        return this;
    }

    /**
     * Gets the value of the rghtToWdrwInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRghtToWdrwInd() {
        return rghtToWdrwInd;
    }

    /**
     * Sets the value of the rghtToWdrwInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Resolution5 setRghtToWdrwInd(Boolean value) {
        this.rghtToWdrwInd = value;
        return this;
    }

    /**
     * Gets the value of the voteInstrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteInstrTp property.
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
     * {@link VoteInstructionType1 }
     * 
     * 
     * @return
     *     The value of the voteInstrTp property.
     */
    public List<VoteInstructionType1> getVoteInstrTp() {
        if (voteInstrTp == null) {
            voteInstrTp = new ArrayList<>();
        }
        return this.voteInstrTp;
    }

    /**
     * Gets the value of the mgmtRcmmndtn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction5Code }
     *     
     */
    public VoteInstruction5Code getMgmtRcmmndtn() {
        return mgmtRcmmndtn;
    }

    /**
     * Sets the value of the mgmtRcmmndtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction5Code }
     *     
     */
    public Resolution5 setMgmtRcmmndtn(VoteInstruction5Code value) {
        this.mgmtRcmmndtn = value;
        return this;
    }

    /**
     * Gets the value of the ntifngPtyRcmmndtn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction5Code }
     *     
     */
    public VoteInstruction5Code getNtifngPtyRcmmndtn() {
        return ntifngPtyRcmmndtn;
    }

    /**
     * Sets the value of the ntifngPtyRcmmndtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction5Code }
     *     
     */
    public Resolution5 setNtifngPtyRcmmndtn(VoteInstruction5Code value) {
        this.ntifngPtyRcmmndtn = value;
        return this;
    }

    /**
     * Gets the value of the entitlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Entitlement1Choice }
     *     
     */
    public Entitlement1Choice getEntitlmnt() {
        return entitlmnt;
    }

    /**
     * Sets the value of the entitlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entitlement1Choice }
     *     
     */
    public Resolution5 setEntitlmnt(Entitlement1Choice value) {
        this.entitlmnt = value;
        return this;
    }

    /**
     * Gets the value of the vtngRghtsThrshldForApprvl property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOrPercentage1Choice }
     *     
     */
    public NumberOrPercentage1Choice getVtngRghtsThrshldForApprvl() {
        return vtngRghtsThrshldForApprvl;
    }

    /**
     * Sets the value of the vtngRghtsThrshldForApprvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOrPercentage1Choice }
     *     
     */
    public Resolution5 setVtngRghtsThrshldForApprvl(NumberOrPercentage1Choice value) {
        this.vtngRghtsThrshldForApprvl = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Resolution5 setURLAdr(String value) {
        this.urlAdr = value;
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
     * Adds a new item to the desc list.
     * @see #getDesc()
     * 
     */
    public Resolution5 addDesc(ItemDescription1 desc) {
        getDesc().add(desc);
        return this;
    }

    /**
     * Adds a new item to the voteInstrTp list.
     * @see #getVoteInstrTp()
     * 
     */
    public Resolution5 addVoteInstrTp(VoteInstructionType1 voteInstrTp) {
        getVoteInstrTp().add(voteInstrTp);
        return this;
    }

}
