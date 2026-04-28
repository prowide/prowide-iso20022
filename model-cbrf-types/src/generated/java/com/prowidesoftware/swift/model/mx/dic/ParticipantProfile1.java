
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
 * Information from participant profile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantProfile1", propOrder = {
    "ptcptInf",
    "ptcptAcctInf"
})
public class ParticipantProfile1 {

    @XmlElement(name = "PtcptInf", required = true)
    protected ParticipantInformation1 ptcptInf;
    @XmlElement(name = "PtcptAcctInf")
    protected List<ParticipantAccount1> ptcptAcctInf;

    /**
     * Gets the value of the ptcptInf property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantInformation1 }
     *     
     */
    public ParticipantInformation1 getPtcptInf() {
        return ptcptInf;
    }

    /**
     * Sets the value of the ptcptInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantInformation1 }
     *     
     */
    public ParticipantProfile1 setPtcptInf(ParticipantInformation1 value) {
        this.ptcptInf = value;
        return this;
    }

    /**
     * Gets the value of the ptcptAcctInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcptAcctInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtcptAcctInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantAccount1 }
     * 
     * 
     */
    public List<ParticipantAccount1> getPtcptAcctInf() {
        if (ptcptAcctInf == null) {
            ptcptAcctInf = new ArrayList<ParticipantAccount1>();
        }
        return this.ptcptAcctInf;
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
     * Adds a new item to the ptcptAcctInf list.
     * @see #getPtcptAcctInf()
     * 
     */
    public ParticipantProfile1 addPtcptAcctInf(ParticipantAccount1 ptcptAcctInf) {
        getPtcptAcctInf().add(ptcptAcctInf);
        return this;
    }

}
