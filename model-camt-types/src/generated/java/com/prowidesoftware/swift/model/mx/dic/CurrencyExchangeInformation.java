
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
 * Reports on currency exchange information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchangeInformation", propOrder = {
    "ccyXchgRpt"
})
public class CurrencyExchangeInformation {

    @XmlElement(name = "CcyXchgRpt", required = true)
    protected List<CurrencyExchangeReport> ccyXchgRpt;

    /**
     * Gets the value of the ccyXchgRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccyXchgRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyXchgRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyExchangeReport }
     * 
     * 
     * @return
     *     The value of the ccyXchgRpt property.
     */
    public List<CurrencyExchangeReport> getCcyXchgRpt() {
        if (ccyXchgRpt == null) {
            ccyXchgRpt = new ArrayList<>();
        }
        return this.ccyXchgRpt;
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
     * Adds a new item to the ccyXchgRpt list.
     * @see #getCcyXchgRpt()
     * 
     */
    public CurrencyExchangeInformation addCcyXchgRpt(CurrencyExchangeReport ccyXchgRpt) {
        getCcyXchgRpt().add(ccyXchgRpt);
        return this;
    }

}
