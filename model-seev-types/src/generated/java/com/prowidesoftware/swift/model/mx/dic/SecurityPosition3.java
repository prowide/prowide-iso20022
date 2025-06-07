
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
 * Net position of a segregated holding, in a single security, within the overall position held in a securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPosition3", propOrder = {
    "id",
    "acct",
    "voteInstr",
    "sctySubPos"
})
public class SecurityPosition3 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification3 id;
    @XmlElement(name = "Acct")
    protected EligiblePosition1 acct;
    @XmlElement(name = "VoteInstr")
    protected VoteInstruction1 voteInstr;
    @XmlElement(name = "SctySubPos")
    protected List<SecurityPosition4> sctySubPos;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityIdentification3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityPosition3 setId(SecurityIdentification3 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link EligiblePosition1 }
     *     
     */
    public EligiblePosition1 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePosition1 }
     *     
     */
    public SecurityPosition3 setAcct(EligiblePosition1 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the voteInstr property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction1 }
     *     
     */
    public VoteInstruction1 getVoteInstr() {
        return voteInstr;
    }

    /**
     * Sets the value of the voteInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction1 }
     *     
     */
    public SecurityPosition3 setVoteInstr(VoteInstruction1 value) {
        this.voteInstr = value;
        return this;
    }

    /**
     * Gets the value of the sctySubPos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctySubPos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctySubPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityPosition4 }
     * 
     * 
     */
    public List<SecurityPosition4> getSctySubPos() {
        if (sctySubPos == null) {
            sctySubPos = new ArrayList<SecurityPosition4>();
        }
        return this.sctySubPos;
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
     * Adds a new item to the sctySubPos list.
     * @see #getSctySubPos()
     * 
     */
    public SecurityPosition3 addSctySubPos(SecurityPosition4 sctySubPos) {
        getSctySubPos().add(sctySubPos);
        return this;
    }

}
