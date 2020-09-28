
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the vote instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteInstruction", propOrder = {
    "id",
    "reqdExctnDt",
    "voteExctnConf",
    "votePerRsltn",
    "voteInstrForMtgRsltn"
})
public class VoteInstruction {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "ReqdExctnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "VoteExctnConf")
    protected boolean voteExctnConf;
    @XmlElement(name = "VotePerRsltn", required = true)
    protected VoteChoice votePerRsltn;
    @XmlElement(name = "VoteInstrForMtgRsltn")
    protected VoteInstructionForMeetingResolution voteInstrForMtgRsltn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteInstruction setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public VoteInstruction setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the voteExctnConf property.
     * 
     */
    public boolean isVoteExctnConf() {
        return voteExctnConf;
    }

    /**
     * Sets the value of the voteExctnConf property.
     * 
     */
    public VoteInstruction setVoteExctnConf(boolean value) {
        this.voteExctnConf = value;
        return this;
    }

    /**
     * Gets the value of the votePerRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteChoice }
     *     
     */
    public VoteChoice getVotePerRsltn() {
        return votePerRsltn;
    }

    /**
     * Sets the value of the votePerRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteChoice }
     *     
     */
    public VoteInstruction setVotePerRsltn(VoteChoice value) {
        this.votePerRsltn = value;
        return this;
    }

    /**
     * Gets the value of the voteInstrForMtgRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionForMeetingResolution }
     *     
     */
    public VoteInstructionForMeetingResolution getVoteInstrForMtgRsltn() {
        return voteInstrForMtgRsltn;
    }

    /**
     * Sets the value of the voteInstrForMtgRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionForMeetingResolution }
     *     
     */
    public VoteInstruction setVoteInstrForMtgRsltn(VoteInstructionForMeetingResolution value) {
        this.voteInstrForMtgRsltn = value;
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
