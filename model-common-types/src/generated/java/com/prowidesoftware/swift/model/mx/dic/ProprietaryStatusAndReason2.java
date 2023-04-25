
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
 * Provides the proprietary status and reason of an instruction or an instruction cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryStatusAndReason2", propOrder = {
    "prtrySts",
    "prtryRsn"
})
public class ProprietaryStatusAndReason2 {

    @XmlElement(name = "PrtrySts", required = true)
    protected GenericIdentification25 prtrySts;
    @XmlElement(name = "PrtryRsn")
    protected List<ProprietaryReason2> prtryRsn;

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification25 }
     *     
     */
    public GenericIdentification25 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification25 }
     *     
     */
    public ProprietaryStatusAndReason2 setPrtrySts(GenericIdentification25 value) {
        this.prtrySts = value;
        return this;
    }

    /**
     * Gets the value of the prtryRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtryRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtryRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason2 }
     * 
     * 
     * @return
     *     The value of the prtryRsn property.
     */
    public List<ProprietaryReason2> getPrtryRsn() {
        if (prtryRsn == null) {
            prtryRsn = new ArrayList<>();
        }
        return this.prtryRsn;
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
     * Adds a new item to the prtryRsn list.
     * @see #getPrtryRsn()
     * 
     */
    public ProprietaryStatusAndReason2 addPrtryRsn(ProprietaryReason2 prtryRsn) {
        getPrtryRsn().add(prtryRsn);
        return this;
    }

}
