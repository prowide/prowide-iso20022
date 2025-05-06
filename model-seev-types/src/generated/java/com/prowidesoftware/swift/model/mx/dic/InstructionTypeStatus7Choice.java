
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
 * Choice of instruction type status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionTypeStatus7Choice", propOrder = {
    "instrSts",
    "cxlSts"
})
public class InstructionTypeStatus7Choice {

    @XmlElement(name = "InstrSts")
    protected List<DetailedInstructionStatus21> instrSts;
    @XmlElement(name = "CxlSts")
    protected CancellationStatus31Choice cxlSts;

    /**
     * Gets the value of the instrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionStatus21 }
     * 
     * 
     * @return
     *     The value of the instrSts property.
     */
    public List<DetailedInstructionStatus21> getInstrSts() {
        if (instrSts == null) {
            instrSts = new ArrayList<>();
        }
        return this.instrSts;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus31Choice }
     *     
     */
    public CancellationStatus31Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus31Choice }
     *     
     */
    public InstructionTypeStatus7Choice setCxlSts(CancellationStatus31Choice value) {
        this.cxlSts = value;
        return this;
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
     * Adds a new item to the instrSts list.
     * @see #getInstrSts()
     * 
     */
    public InstructionTypeStatus7Choice addInstrSts(DetailedInstructionStatus21 instrSts) {
        getInstrSts().add(instrSts);
        return this;
    }

}
