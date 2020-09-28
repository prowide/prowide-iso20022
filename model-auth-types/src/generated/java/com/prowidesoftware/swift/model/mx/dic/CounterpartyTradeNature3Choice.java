
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
 * Nature of the company activities of the reporting counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyTradeNature3Choice", propOrder = {
    "fi",
    "nfi"
})
public class CounterpartyTradeNature3Choice {

    @XmlElement(name = "FI")
    protected FinancialPartyClassification1Choice fi;
    @XmlElement(name = "NFI")
    protected List<String> nfi;

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialPartyClassification1Choice }
     *     
     */
    public FinancialPartyClassification1Choice getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialPartyClassification1Choice }
     *     
     */
    public CounterpartyTradeNature3Choice setFI(FinancialPartyClassification1Choice value) {
        this.fi = value;
        return this;
    }

    /**
     * Gets the value of the nfi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nfi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNFI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNFI() {
        if (nfi == null) {
            nfi = new ArrayList<String>();
        }
        return this.nfi;
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
     * Adds a new item to the nFI list.
     * @see #getNFI()
     * 
     */
    public CounterpartyTradeNature3Choice addNFI(String nFI) {
        getNFI().add(nFI);
        return this;
    }

}
