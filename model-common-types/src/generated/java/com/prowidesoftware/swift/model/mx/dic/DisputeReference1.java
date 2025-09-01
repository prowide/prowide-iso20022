
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
 * Contains dispute reference details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeReference1", propOrder = {
    "assgnrNtty",
    "othrAssgnrNtty",
    "dsptId"
})
public class DisputeReference1 {

    @XmlElement(name = "AssgnrNtty")
    @XmlSchemaType(name = "string")
    protected PartyType32Code assgnrNtty;
    @XmlElement(name = "OthrAssgnrNtty")
    protected String othrAssgnrNtty;
    @XmlElement(name = "DsptId", required = true)
    protected List<DisputeIdentification1> dsptId;

    /**
     * Gets the value of the assgnrNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType32Code }
     *     
     */
    public PartyType32Code getAssgnrNtty() {
        return assgnrNtty;
    }

    /**
     * Sets the value of the assgnrNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType32Code }
     *     
     */
    public DisputeReference1 setAssgnrNtty(PartyType32Code value) {
        this.assgnrNtty = value;
        return this;
    }

    /**
     * Gets the value of the othrAssgnrNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAssgnrNtty() {
        return othrAssgnrNtty;
    }

    /**
     * Sets the value of the othrAssgnrNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeReference1 setOthrAssgnrNtty(String value) {
        this.othrAssgnrNtty = value;
        return this;
    }

    /**
     * Gets the value of the dsptId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsptId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeIdentification1 }
     * 
     * 
     */
    public List<DisputeIdentification1> getDsptId() {
        if (dsptId == null) {
            dsptId = new ArrayList<DisputeIdentification1>();
        }
        return this.dsptId;
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
     * Adds a new item to the dsptId list.
     * @see #getDsptId()
     * 
     */
    public DisputeReference1 addDsptId(DisputeIdentification1 dsptId) {
        getDsptId().add(dsptId);
        return this;
    }

}
