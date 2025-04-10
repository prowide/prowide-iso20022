
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
 * Business status of the party for processing in the system. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyStatus2", propOrder = {
    "sts",
    "stsRsn",
    "sysPtyId"
})
public class PartyStatus2 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected Status6Code sts;
    @XmlElement(name = "StsRsn")
    protected List<StatusReasonInformation10> stsRsn;
    @XmlElement(name = "SysPtyId")
    protected SystemPartyIdentification8 sysPtyId;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status6Code }
     *     
     */
    public Status6Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status6Code }
     *     
     */
    public PartyStatus2 setSts(Status6Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation10 }
     * 
     * 
     * @return
     *     The value of the stsRsn property.
     */
    public List<StatusReasonInformation10> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the sysPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getSysPtyId() {
        return sysPtyId;
    }

    /**
     * Sets the value of the sysPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public PartyStatus2 setSysPtyId(SystemPartyIdentification8 value) {
        this.sysPtyId = value;
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
     * Adds a new item to the stsRsn list.
     * @see #getStsRsn()
     * 
     */
    public PartyStatus2 addStsRsn(StatusReasonInformation10 stsRsn) {
        getStsRsn().add(stsRsn);
        return this;
    }

}
