
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
 * Contains fee collection reference details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeCollectionReference1", propOrder = {
    "assgnrNtty",
    "othrAssgnrNtty",
    "feeColltnId"
})
public class FeeCollectionReference1 {

    @XmlElement(name = "AssgnrNtty")
    @XmlSchemaType(name = "string")
    protected PartyType32Code assgnrNtty;
    @XmlElement(name = "OthrAssgnrNtty")
    protected String othrAssgnrNtty;
    @XmlElement(name = "FeeColltnId", required = true)
    protected List<FeeCollectionIdentification1> feeColltnId;

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
    public FeeCollectionReference1 setAssgnrNtty(PartyType32Code value) {
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
    public FeeCollectionReference1 setOthrAssgnrNtty(String value) {
        this.othrAssgnrNtty = value;
        return this;
    }

    /**
     * Gets the value of the feeColltnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the feeColltnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeColltnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeCollectionIdentification1 }
     * 
     * 
     * @return
     *     The value of the feeColltnId property.
     */
    public List<FeeCollectionIdentification1> getFeeColltnId() {
        if (feeColltnId == null) {
            feeColltnId = new ArrayList<>();
        }
        return this.feeColltnId;
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
     * Adds a new item to the feeColltnId list.
     * @see #getFeeColltnId()
     * 
     */
    public FeeCollectionReference1 addFeeColltnId(FeeCollectionIdentification1 feeColltnId) {
        getFeeColltnId().add(feeColltnId);
        return this;
    }

}
