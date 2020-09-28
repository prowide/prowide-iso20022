
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
 * Status applying to the instruction cancellation request received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus27Choice", propOrder = {
    "gblCxlSts",
    "dtldCxlSts"
})
public class CancellationStatus27Choice {

    @XmlElement(name = "GblCxlSts")
    protected CancellationStatus26Choice gblCxlSts;
    @XmlElement(name = "DtldCxlSts")
    protected List<DetailedInstructionCancellationStatus14> dtldCxlSts;

    /**
     * Gets the value of the gblCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus26Choice }
     *     
     */
    public CancellationStatus26Choice getGblCxlSts() {
        return gblCxlSts;
    }

    /**
     * Sets the value of the gblCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus26Choice }
     *     
     */
    public CancellationStatus27Choice setGblCxlSts(CancellationStatus26Choice value) {
        this.gblCxlSts = value;
        return this;
    }

    /**
     * Gets the value of the dtldCxlSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtldCxlSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldCxlSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionCancellationStatus14 }
     * 
     * 
     */
    public List<DetailedInstructionCancellationStatus14> getDtldCxlSts() {
        if (dtldCxlSts == null) {
            dtldCxlSts = new ArrayList<DetailedInstructionCancellationStatus14>();
        }
        return this.dtldCxlSts;
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
     * Adds a new item to the dtldCxlSts list.
     * @see #getDtldCxlSts()
     * 
     */
    public CancellationStatus27Choice addDtldCxlSts(DetailedInstructionCancellationStatus14 dtldCxlSts) {
        getDtldCxlSts().add(dtldCxlSts);
        return this;
    }

}
