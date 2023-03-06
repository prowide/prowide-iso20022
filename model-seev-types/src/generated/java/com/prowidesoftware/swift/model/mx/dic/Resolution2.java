
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
 * Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resolution2", propOrder = {
    "issrLabl",
    "desc",
    "titl",
    "tp",
    "forInfOnly",
    "sts",
    "submittdBySctyHldr",
    "voteInstrTp",
    "mgmtRcmmndtn",
    "ntifngPtyRcmmndtn"
})
public class Resolution2 {

    @XmlElement(name = "IssrLabl", required = true)
    protected String issrLabl;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Titl")
    protected String titl;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ResolutionType1Code tp;
    @XmlElement(name = "ForInfOnly")
    protected boolean forInfOnly;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ResolutionStatus1Code sts;
    @XmlElement(name = "SubmittdBySctyHldr")
    protected boolean submittdBySctyHldr;
    @XmlElement(name = "VoteInstrTp")
    @XmlSchemaType(name = "string")
    protected List<VoteInstruction2Code> voteInstrTp;
    @XmlElement(name = "MgmtRcmmndtn")
    @XmlSchemaType(name = "string")
    protected VoteInstruction1Code mgmtRcmmndtn;
    @XmlElement(name = "NtifngPtyRcmmndtn")
    @XmlSchemaType(name = "string")
    protected VoteInstruction1Code ntifngPtyRcmmndtn;

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
    public Resolution2 setIssrLabl(String value) {
        this.issrLabl = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Resolution2 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the titl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitl() {
        return titl;
    }

    /**
     * Sets the value of the titl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Resolution2 setTitl(String value) {
        this.titl = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionType1Code }
     *     
     */
    public ResolutionType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionType1Code }
     *     
     */
    public Resolution2 setTp(ResolutionType1Code value) {
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
    public Resolution2 setForInfOnly(boolean value) {
        this.forInfOnly = value;
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
    public Resolution2 setSts(ResolutionStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the submittdBySctyHldr property.
     * 
     */
    public boolean isSubmittdBySctyHldr() {
        return submittdBySctyHldr;
    }

    /**
     * Sets the value of the submittdBySctyHldr property.
     * 
     */
    public Resolution2 setSubmittdBySctyHldr(boolean value) {
        this.submittdBySctyHldr = value;
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
     * Gets the value of the mgmtRcmmndtn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction1Code }
     *     
     */
    public VoteInstruction1Code getMgmtRcmmndtn() {
        return mgmtRcmmndtn;
    }

    /**
     * Sets the value of the mgmtRcmmndtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction1Code }
     *     
     */
    public Resolution2 setMgmtRcmmndtn(VoteInstruction1Code value) {
        this.mgmtRcmmndtn = value;
        return this;
    }

    /**
     * Gets the value of the ntifngPtyRcmmndtn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction1Code }
     *     
     */
    public VoteInstruction1Code getNtifngPtyRcmmndtn() {
        return ntifngPtyRcmmndtn;
    }

    /**
     * Sets the value of the ntifngPtyRcmmndtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction1Code }
     *     
     */
    public Resolution2 setNtifngPtyRcmmndtn(VoteInstruction1Code value) {
        this.ntifngPtyRcmmndtn = value;
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
    public Resolution2 addVoteInstrTp(VoteInstruction2Code voteInstrTp) {
        getVoteInstrTp().add(voteInstrTp);
        return this;
    }

}
