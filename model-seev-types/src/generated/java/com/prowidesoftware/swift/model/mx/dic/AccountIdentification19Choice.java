
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts and balance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification19Choice", propOrder = {
    "forAllAccts",
    "acctsListAndBalDtls"
})
public class AccountIdentification19Choice {

    @XmlElement(name = "ForAllAccts")
    protected AccountIdentification10 forAllAccts;
    @XmlElement(name = "AcctsListAndBalDtls")
    protected List<AccountAndBalance18> acctsListAndBalDtls;

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
    public AccountIdentification19Choice setForAllAccts(AccountIdentification10 value) {
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
     * {@link AccountAndBalance18 }
     * 
     * 
     */
    public List<AccountAndBalance18> getAcctsListAndBalDtls() {
        if (acctsListAndBalDtls == null) {
            acctsListAndBalDtls = new ArrayList<AccountAndBalance18>();
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
    public AccountIdentification19Choice addAcctsListAndBalDtls(AccountAndBalance18 acctsListAndBalDtls) {
        getAcctsListAndBalDtls().add(acctsListAndBalDtls);
        return this;
    }

}
