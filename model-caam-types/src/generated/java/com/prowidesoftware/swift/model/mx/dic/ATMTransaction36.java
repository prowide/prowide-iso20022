
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
 * Information about the reconciliation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction36", propOrder = {
    "rcncltnOpr"
})
public class ATMTransaction36 {

    @XmlElement(name = "RcncltnOpr")
    protected List<ATMReconciliationOperation1> rcncltnOpr;

    /**
     * Gets the value of the rcncltnOpr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcncltnOpr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcncltnOpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMReconciliationOperation1 }
     * 
     * 
     * @return
     *     The value of the rcncltnOpr property.
     */
    public List<ATMReconciliationOperation1> getRcncltnOpr() {
        if (rcncltnOpr == null) {
            rcncltnOpr = new ArrayList<>();
        }
        return this.rcncltnOpr;
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
     * Adds a new item to the rcncltnOpr list.
     * @see #getRcncltnOpr()
     * 
     */
    public ATMTransaction36 addRcncltnOpr(ATMReconciliationOperation1 rcncltnOpr) {
        getRcncltnOpr().add(rcncltnOpr);
        return this;
    }

}
