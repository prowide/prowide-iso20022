
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
@XmlType(name = "ProprietaryStatusAndReason6", propOrder = {
    "prtrySts",
    "prtryRsn"
})
public class ProprietaryStatusAndReason6 {

    @XmlElement(name = "PrtrySts", required = true)
    protected GenericIdentification30 prtrySts;
    @XmlElement(name = "PrtryRsn")
    protected List<ProprietaryReason4> prtryRsn;

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public ProprietaryStatusAndReason6 setPrtrySts(GenericIdentification30 value) {
        this.prtrySts = value;
        return this;
    }

    /**
     * Gets the value of the prtryRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtryRsn property.
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
     * {@link ProprietaryReason4 }
     * 
     * 
     */
    public List<ProprietaryReason4> getPrtryRsn() {
        if (prtryRsn == null) {
            prtryRsn = new ArrayList<ProprietaryReason4>();
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
    public ProprietaryStatusAndReason6 addPrtryRsn(ProprietaryReason4 prtryRsn) {
        getPrtryRsn().add(prtryRsn);
        return this;
    }

}
