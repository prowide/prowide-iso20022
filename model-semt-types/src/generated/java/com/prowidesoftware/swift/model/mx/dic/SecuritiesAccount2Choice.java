
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
 * Specifies one or a range of securities accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccount2Choice", propOrder = {
    "rg",
    "acct"
})
public class SecuritiesAccount2Choice {

    @XmlElement(name = "Rg")
    protected SecuritiesAccountRange2 rg;
    @XmlElement(name = "Acct")
    protected List<SecuritiesAccount19> acct;

    /**
     * Gets the value of the rg property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountRange2 }
     *     
     */
    public SecuritiesAccountRange2 getRg() {
        return rg;
    }

    /**
     * Sets the value of the rg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountRange2 }
     *     
     */
    public SecuritiesAccount2Choice setRg(SecuritiesAccountRange2 value) {
        this.rg = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccount19 }
     * 
     * 
     * @return
     *     The value of the acct property.
     */
    public List<SecuritiesAccount19> getAcct() {
        if (acct == null) {
            acct = new ArrayList<>();
        }
        return this.acct;
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
     * Adds a new item to the acct list.
     * @see #getAcct()
     * 
     */
    public SecuritiesAccount2Choice addAcct(SecuritiesAccount19 acct) {
        getAcct().add(acct);
        return this;
    }

}
