
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
 * Status applying to the instruction request received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatus7Choice", propOrder = {
    "gblInstrSts",
    "dtldInstrSts"
})
public class InstructionStatus7Choice {

    @XmlElement(name = "GblInstrSts")
    protected InstructionStatus8Choice gblInstrSts;
    @XmlElement(name = "DtldInstrSts")
    protected List<DetailedInstructionStatus12> dtldInstrSts;

    /**
     * Gets the value of the gblInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatus8Choice }
     *     
     */
    public InstructionStatus8Choice getGblInstrSts() {
        return gblInstrSts;
    }

    /**
     * Sets the value of the gblInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatus8Choice }
     *     
     */
    public InstructionStatus7Choice setGblInstrSts(InstructionStatus8Choice value) {
        this.gblInstrSts = value;
        return this;
    }

    /**
     * Gets the value of the dtldInstrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldInstrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldInstrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionStatus12 }
     * 
     * 
     * @return
     *     The value of the dtldInstrSts property.
     */
    public List<DetailedInstructionStatus12> getDtldInstrSts() {
        if (dtldInstrSts == null) {
            dtldInstrSts = new ArrayList<>();
        }
        return this.dtldInstrSts;
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
     * Adds a new item to the dtldInstrSts list.
     * @see #getDtldInstrSts()
     * 
     */
    public InstructionStatus7Choice addDtldInstrSts(DetailedInstructionStatus12 dtldInstrSts) {
        getDtldInstrSts().add(dtldInstrSts);
        return this;
    }

}
