
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
 * Choice between an indication of no disclosure and the provision of shareholding disclosure information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disclosure3Choice", propOrder = {
    "noDsclsr",
    "sfkpgAcctAndHldgs"
})
public class Disclosure3Choice {

    @XmlElement(name = "NoDsclsr")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noDsclsr;
    @XmlElement(name = "SfkpgAcctAndHldgs")
    protected List<SafekeepingAccount17> sfkpgAcctAndHldgs;

    /**
     * Gets the value of the noDsclsr property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoDsclsr() {
        return noDsclsr;
    }

    /**
     * Sets the value of the noDsclsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public Disclosure3Choice setNoDsclsr(NoReasonCode value) {
        this.noDsclsr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcctAndHldgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafekeepingAccount17 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcctAndHldgs property.
     */
    public List<SafekeepingAccount17> getSfkpgAcctAndHldgs() {
        if (sfkpgAcctAndHldgs == null) {
            sfkpgAcctAndHldgs = new ArrayList<>();
        }
        return this.sfkpgAcctAndHldgs;
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
     * Adds a new item to the sfkpgAcctAndHldgs list.
     * @see #getSfkpgAcctAndHldgs()
     * 
     */
    public Disclosure3Choice addSfkpgAcctAndHldgs(SafekeepingAccount17 sfkpgAcctAndHldgs) {
        getSfkpgAcctAndHldgs().add(sfkpgAcctAndHldgs);
        return this;
    }

}
