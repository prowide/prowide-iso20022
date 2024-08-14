
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
 * Restrictions applicable to the security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityRestriction3", propOrder = {
    "fctvPrd",
    "rstrctnTp",
    "lglRstrctnTp",
    "invstrRstrctnTp",
    "invstrTp"
})
public class SecurityRestriction3 {

    @XmlElement(name = "FctvPrd")
    protected DateTimePeriod2 fctvPrd;
    @XmlElement(name = "RstrctnTp")
    protected SecurityRestrictionType2Choice rstrctnTp;
    @XmlElement(name = "LglRstrctnTp")
    protected LegalRestrictions5Choice lglRstrctnTp;
    @XmlElement(name = "InvstrRstrctnTp")
    protected List<InvestorRestrictionType3Choice> invstrRstrctnTp;
    @XmlElement(name = "InvstrTp")
    protected List<InvestorType3Choice> invstrTp;

    /**
     * Gets the value of the fctvPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public DateTimePeriod2 getFctvPrd() {
        return fctvPrd;
    }

    /**
     * Sets the value of the fctvPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public SecurityRestriction3 setFctvPrd(DateTimePeriod2 value) {
        this.fctvPrd = value;
        return this;
    }

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityRestrictionType2Choice }
     *     
     */
    public SecurityRestrictionType2Choice getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityRestrictionType2Choice }
     *     
     */
    public SecurityRestriction3 setRstrctnTp(SecurityRestrictionType2Choice value) {
        this.rstrctnTp = value;
        return this;
    }

    /**
     * Gets the value of the lglRstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link LegalRestrictions5Choice }
     *     
     */
    public LegalRestrictions5Choice getLglRstrctnTp() {
        return lglRstrctnTp;
    }

    /**
     * Sets the value of the lglRstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalRestrictions5Choice }
     *     
     */
    public SecurityRestriction3 setLglRstrctnTp(LegalRestrictions5Choice value) {
        this.lglRstrctnTp = value;
        return this;
    }

    /**
     * Gets the value of the invstrRstrctnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstrRstrctnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrRstrctnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorRestrictionType3Choice }
     * 
     * 
     * @return
     *     The value of the invstrRstrctnTp property.
     */
    public List<InvestorRestrictionType3Choice> getInvstrRstrctnTp() {
        if (invstrRstrctnTp == null) {
            invstrRstrctnTp = new ArrayList<>();
        }
        return this.invstrRstrctnTp;
    }

    /**
     * Gets the value of the invstrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorType3Choice }
     * 
     * 
     * @return
     *     The value of the invstrTp property.
     */
    public List<InvestorType3Choice> getInvstrTp() {
        if (invstrTp == null) {
            invstrTp = new ArrayList<>();
        }
        return this.invstrTp;
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
     * Adds a new item to the invstrRstrctnTp list.
     * @see #getInvstrRstrctnTp()
     * 
     */
    public SecurityRestriction3 addInvstrRstrctnTp(InvestorRestrictionType3Choice invstrRstrctnTp) {
        getInvstrRstrctnTp().add(invstrRstrctnTp);
        return this;
    }

    /**
     * Adds a new item to the invstrTp list.
     * @see #getInvstrTp()
     * 
     */
    public SecurityRestriction3 addInvstrTp(InvestorType3Choice invstrTp) {
        getInvstrTp().add(invstrTp);
        return this;
    }

}
