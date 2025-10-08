
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
 * Specifies the number of votes for an agenda item.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteInstruction1", propOrder = {
    "id",
    "votePerRsltn",
    "idntyOfHldr",
    "stgInstr"
})
public class VoteInstruction1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "VotePerRsltn", required = true)
    protected List<Vote1> votePerRsltn;
    @XmlElement(name = "IdntyOfHldr")
    protected PartyIdentification7Choice idntyOfHldr;
    @XmlElement(name = "StgInstr")
    protected Boolean stgInstr;

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
    public VoteInstruction1 setId(String value) {
        this.id = value;
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
     * {@link Vote1 }
     * 
     * 
     */
    public List<Vote1> getVotePerRsltn() {
        if (votePerRsltn == null) {
            votePerRsltn = new ArrayList<Vote1>();
        }
        return this.votePerRsltn;
    }

    /**
     * Gets the value of the idntyOfHldr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getIdntyOfHldr() {
        return idntyOfHldr;
    }

    /**
     * Sets the value of the idntyOfHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public VoteInstruction1 setIdntyOfHldr(PartyIdentification7Choice value) {
        this.idntyOfHldr = value;
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
    public VoteInstruction1 setStgInstr(Boolean value) {
        this.stgInstr = value;
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
     * Adds a new item to the votePerRsltn list.
     * @see #getVotePerRsltn()
     * 
     */
    public VoteInstruction1 addVotePerRsltn(Vote1 votePerRsltn) {
        getVotePerRsltn().add(votePerRsltn);
        return this;
    }

}
