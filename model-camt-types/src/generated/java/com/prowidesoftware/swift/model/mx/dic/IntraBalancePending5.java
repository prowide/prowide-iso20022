
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
 * Provides the data for the pending intra-balance movements.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalancePending5", propOrder = {
    "stsAndRsn",
    "mvmnt"
})
public class IntraBalancePending5 {

    @XmlElement(name = "StsAndRsn")
    protected PendingStatusAndReason2 stsAndRsn;
    @XmlElement(name = "Mvmnt", required = true)
    protected List<IntraBalancePending6> mvmnt;

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatusAndReason2 }
     *     
     */
    public PendingStatusAndReason2 getStsAndRsn() {
        return stsAndRsn;
    }

    /**
     * Sets the value of the stsAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatusAndReason2 }
     *     
     */
    public IntraBalancePending5 setStsAndRsn(PendingStatusAndReason2 value) {
        this.stsAndRsn = value;
        return this;
    }

    /**
     * Gets the value of the mvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraBalancePending6 }
     * 
     * 
     */
    public List<IntraBalancePending6> getMvmnt() {
        if (mvmnt == null) {
            mvmnt = new ArrayList<IntraBalancePending6>();
        }
        return this.mvmnt;
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
     * Adds a new item to the mvmnt list.
     * @see #getMvmnt()
     * 
     */
    public IntraBalancePending5 addMvmnt(IntraBalancePending6 mvmnt) {
        getMvmnt().add(mvmnt);
        return this;
    }

}
