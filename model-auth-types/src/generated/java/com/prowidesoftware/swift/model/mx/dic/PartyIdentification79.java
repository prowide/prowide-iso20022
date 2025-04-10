
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
 * Set of elements used to identify an account owner and the associated decision maker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification79", propOrder = {
    "acctOwnr",
    "dcsnMakr"
})
public class PartyIdentification79 {

    @XmlElement(name = "AcctOwnr", required = true)
    protected List<PartyIdentification76> acctOwnr;
    @XmlElement(name = "DcsnMakr")
    protected List<PersonOrOrganisation2Choice> dcsnMakr;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification76 }
     * 
     * 
     * @return
     *     The value of the acctOwnr property.
     */
    public List<PartyIdentification76> getAcctOwnr() {
        if (acctOwnr == null) {
            acctOwnr = new ArrayList<>();
        }
        return this.acctOwnr;
    }

    /**
     * Gets the value of the dcsnMakr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dcsnMakr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDcsnMakr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonOrOrganisation2Choice }
     * 
     * 
     * @return
     *     The value of the dcsnMakr property.
     */
    public List<PersonOrOrganisation2Choice> getDcsnMakr() {
        if (dcsnMakr == null) {
            dcsnMakr = new ArrayList<>();
        }
        return this.dcsnMakr;
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
     * Adds a new item to the acctOwnr list.
     * @see #getAcctOwnr()
     * 
     */
    public PartyIdentification79 addAcctOwnr(PartyIdentification76 acctOwnr) {
        getAcctOwnr().add(acctOwnr);
        return this;
    }

    /**
     * Adds a new item to the dcsnMakr list.
     * @see #getDcsnMakr()
     * 
     */
    public PartyIdentification79 addDcsnMakr(PersonOrOrganisation2Choice dcsnMakr) {
        getDcsnMakr().add(dcsnMakr);
        return this;
    }

}
