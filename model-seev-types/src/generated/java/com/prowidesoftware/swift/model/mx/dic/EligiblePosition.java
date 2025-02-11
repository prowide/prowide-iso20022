
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
 * Specifies the voting entitlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligiblePosition", propOrder = {
    "acctId",
    "acctOwnr",
    "hldgBal",
    "rghtsHldr"
})
public class EligiblePosition {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification7Choice acctOwnr;
    @XmlElement(name = "HldgBal")
    protected List<HoldingBalance2> hldgBal;
    @XmlElement(name = "RghtsHldr")
    protected PartyIdentification7Choice rghtsHldr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EligiblePosition setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public EligiblePosition setAcctOwnr(PartyIdentification7Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the hldgBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hldgBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHldgBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingBalance2 }
     * 
     * 
     * @return
     *     The value of the hldgBal property.
     */
    public List<HoldingBalance2> getHldgBal() {
        if (hldgBal == null) {
            hldgBal = new ArrayList<>();
        }
        return this.hldgBal;
    }

    /**
     * Gets the value of the rghtsHldr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getRghtsHldr() {
        return rghtsHldr;
    }

    /**
     * Sets the value of the rghtsHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public EligiblePosition setRghtsHldr(PartyIdentification7Choice value) {
        this.rghtsHldr = value;
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
     * Adds a new item to the hldgBal list.
     * @see #getHldgBal()
     * 
     */
    public EligiblePosition addHldgBal(HoldingBalance2 hldgBal) {
        getHldgBal().add(hldgBal);
        return this;
    }

}
