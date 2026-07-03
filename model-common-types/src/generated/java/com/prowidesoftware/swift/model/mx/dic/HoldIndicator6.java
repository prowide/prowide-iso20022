
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
 * Specifies whether the transaction is on hold/blocked/frozen.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldIndicator6", propOrder = {
    "ind",
    "rsn"
})
public class HoldIndicator6 {

    @XmlElement(name = "Ind")
    protected boolean ind;
    @XmlElement(name = "Rsn")
    protected List<RegistrationReason5> rsn;

    /**
     * Gets the value of the ind property.
     * 
     */
    public boolean isInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     */
    public HoldIndicator6 setInd(boolean value) {
        this.ind = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationReason5 }
     * 
     * 
     */
    public List<RegistrationReason5> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<RegistrationReason5>();
        }
        return this.rsn;
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
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public HoldIndicator6 addRsn(RegistrationReason5 rsn) {
        getRsn().add(rsn);
        return this;
    }

}
