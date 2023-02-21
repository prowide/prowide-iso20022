
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
 * Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification47Choice", propOrder = {
    "forAllAccts",
    "acctsListAndBalDtls"
})
public class AccountIdentification47Choice {

    @XmlElement(name = "ForAllAccts")
    protected AccountIdentification10 forAllAccts;
    @XmlElement(name = "AcctsListAndBalDtls")
    protected List<AccountAndBalance47> acctsListAndBalDtls;

    /**
     * Gets the value of the forAllAccts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification10 }
     *     
     */
    public AccountIdentification10 getForAllAccts() {
        return forAllAccts;
    }

    /**
     * Sets the value of the forAllAccts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification10 }
     *     
     */
    public AccountIdentification47Choice setForAllAccts(AccountIdentification10 value) {
        this.forAllAccts = value;
        return this;
    }

    /**
     * Gets the value of the acctsListAndBalDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctsListAndBalDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctsListAndBalDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountAndBalance47 }
     * 
     * 
     */
    public List<AccountAndBalance47> getAcctsListAndBalDtls() {
        if (acctsListAndBalDtls == null) {
            acctsListAndBalDtls = new ArrayList<AccountAndBalance47>();
        }
        return this.acctsListAndBalDtls;
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
     * Adds a new item to the acctsListAndBalDtls list.
     * @see #getAcctsListAndBalDtls()
     * 
     */
    public AccountIdentification47Choice addAcctsListAndBalDtls(AccountAndBalance47 acctsListAndBalDtls) {
        getAcctsListAndBalDtls().add(acctsListAndBalDtls);
        return this;
    }

}
