
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "Member6", propOrder = {
    "mmbRtrAdr",
    "ctctRef",
    "comAdr"
})
public class Member6 {

    @XmlElement(name = "MmbRtrAdr")
    protected List<MemberIdentification3Choice> mmbRtrAdr;
    @XmlElement(name = "CtctRef")
    protected List<ContactIdentificationAndAddress1> ctctRef;
    @XmlElement(name = "ComAdr")
    protected CommunicationAddress8 comAdr;

    /**
     * Gets the value of the mmbRtrAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mmbRtrAdr property.
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
     * {@link MemberIdentification3Choice }
     * 
     * 
     * @return
     *     The value of the mmbRtrAdr property.
     */
    public List<MemberIdentification3Choice> getMmbRtrAdr() {
        if (mmbRtrAdr == null) {
            mmbRtrAdr = new ArrayList<>();
        }
        return this.mmbRtrAdr;
    }

    /**
     * Gets the value of the ctctRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctctRef property.
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
     * {@link ContactIdentificationAndAddress1 }
     * 
     * 
     * @return
     *     The value of the ctctRef property.
     */
    public List<ContactIdentificationAndAddress1> getCtctRef() {
        if (ctctRef == null) {
            ctctRef = new ArrayList<>();
        }
        return this.ctctRef;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress8 }
     *     
     */
    public CommunicationAddress8 getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress8 }
     *     
     */
    public Member6 setComAdr(CommunicationAddress8 value) {
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
    public Member6 addMmbRtrAdr(MemberIdentification3Choice mmbRtrAdr) {
        getMmbRtrAdr().add(mmbRtrAdr);
        return this;
    }

    /**
     * Adds a new item to the ctctRef list.
     * @see #getCtctRef()
     * 
     */
    public Member6 addCtctRef(ContactIdentificationAndAddress1 ctctRef) {
        getCtctRef().add(ctctRef);
        return this;
    }

}
