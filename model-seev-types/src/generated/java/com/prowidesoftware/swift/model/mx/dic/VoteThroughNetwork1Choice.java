
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between voting directly to issuers or voting via alternate network channels.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteThroughNetwork1Choice", propOrder = {
    "voteChanl",
    "voteDrctlyToIssr"
})
public class VoteThroughNetwork1Choice {

    @XmlElement(name = "VoteChanl")
    @XmlSchemaType(name = "string")
    protected VoteChannel1Code voteChanl;
    @XmlElement(name = "VoteDrctlyToIssr")
    protected List<String> voteDrctlyToIssr;

    /**
     * Gets the value of the voteChanl property.
     * 
     * @return
     *     possible object is
     *     {@link VoteChannel1Code }
     *     
     */
    public VoteChannel1Code getVoteChanl() {
        return voteChanl;
    }

    /**
     * Sets the value of the voteChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteChannel1Code }
     *     
     */
    public VoteThroughNetwork1Choice setVoteChanl(VoteChannel1Code value) {
        this.voteChanl = value;
        return this;
    }

    /**
     * Gets the value of the voteDrctlyToIssr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voteDrctlyToIssr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteDrctlyToIssr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoteDrctlyToIssr() {
        if (voteDrctlyToIssr == null) {
            voteDrctlyToIssr = new ArrayList<String>();
        }
        return this.voteDrctlyToIssr;
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
     * Adds a new item to the voteDrctlyToIssr list.
     * @see #getVoteDrctlyToIssr()
     * 
     */
    public VoteThroughNetwork1Choice addVoteDrctlyToIssr(String voteDrctlyToIssr) {
        getVoteDrctlyToIssr().add(voteDrctlyToIssr);
        return this;
    }

}
