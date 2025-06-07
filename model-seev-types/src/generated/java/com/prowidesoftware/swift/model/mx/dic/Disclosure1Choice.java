
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
 * Choice between an indication of no disclosure and the provision of shareholding disclosure information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disclosure1Choice", propOrder = {
    "noDsclsr",
    "sfkpgAcctAndHldgs"
})
public class Disclosure1Choice {

    @XmlElement(name = "NoDsclsr")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noDsclsr;
    @XmlElement(name = "SfkpgAcctAndHldgs")
    protected List<SafekeepingAccount8> sfkpgAcctAndHldgs;

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
    public Disclosure1Choice setNoDsclsr(NoReasonCode value) {
        this.noDsclsr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sfkpgAcctAndHldgs property.
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
     * {@link SafekeepingAccount8 }
     * 
     * 
     */
    public List<SafekeepingAccount8> getSfkpgAcctAndHldgs() {
        if (sfkpgAcctAndHldgs == null) {
            sfkpgAcctAndHldgs = new ArrayList<SafekeepingAccount8>();
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
    public Disclosure1Choice addSfkpgAcctAndHldgs(SafekeepingAccount8 sfkpgAcctAndHldgs) {
        getSfkpgAcctAndHldgs().add(sfkpgAcctAndHldgs);
        return this;
    }

}
