
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
 * Information about the members of a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberDetails1", propOrder = {
    "mmbRtrAdr",
    "ctctRef",
    "comAdr"
})
public class MemberDetails1 {

    @XmlElement(name = "MmbRtrAdr")
    protected List<MemberIdentificationChoice> mmbRtrAdr;
    @XmlElement(name = "CtctRef")
    protected List<ContactIdentificationAndAddress> ctctRef;
    @XmlElement(name = "ComAdr")
    protected CommunicationAddressDetails comAdr;

    /**
     * Gets the value of the mmbRtrAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmbRtrAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmbRtrAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentificationChoice }
     * 
     * 
     */
    public List<MemberIdentificationChoice> getMmbRtrAdr() {
        if (mmbRtrAdr == null) {
            mmbRtrAdr = new ArrayList<MemberIdentificationChoice>();
        }
        return this.mmbRtrAdr;
    }

    /**
     * Gets the value of the ctctRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctctRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtctRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentificationAndAddress }
     * 
     * 
     */
    public List<ContactIdentificationAndAddress> getCtctRef() {
        if (ctctRef == null) {
            ctctRef = new ArrayList<ContactIdentificationAndAddress>();
        }
        return this.ctctRef;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddressDetails }
     *     
     */
    public CommunicationAddressDetails getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddressDetails }
     *     
     */
    public MemberDetails1 setComAdr(CommunicationAddressDetails value) {
        this.comAdr = value;
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
     * Adds a new item to the mmbRtrAdr list.
     * @see #getMmbRtrAdr()
     * 
     */
    public MemberDetails1 addMmbRtrAdr(MemberIdentificationChoice mmbRtrAdr) {
        getMmbRtrAdr().add(mmbRtrAdr);
        return this;
    }

    /**
     * Adds a new item to the ctctRef list.
     * @see #getCtctRef()
     * 
     */
    public MemberDetails1 addCtctRef(ContactIdentificationAndAddress ctctRef) {
        getCtctRef().add(ctctRef);
        return this;
    }

}
