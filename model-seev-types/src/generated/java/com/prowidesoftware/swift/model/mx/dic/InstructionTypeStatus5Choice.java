
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
@XmlType(name = "InstructionTypeStatus5Choice", propOrder = {
    "instrSts",
    "cxlSts"
})
public class InstructionTypeStatus5Choice {

    @XmlElement(name = "InstrSts")
    protected List<DetailedInstructionStatus16> instrSts;
    @XmlElement(name = "CxlSts")
    protected CancellationStatus27Choice cxlSts;

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
     * {@link DetailedInstructionStatus16 }
     * 
     * 
     * @return
     *     The value of the instrSts property.
     */
    public List<DetailedInstructionStatus16> getInstrSts() {
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
     *     {@link CancellationStatus27Choice }
     *     
     */
    public CancellationStatus27Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus27Choice }
     *     
     */
    public InstructionTypeStatus5Choice setCxlSts(CancellationStatus27Choice value) {
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
    public InstructionTypeStatus5Choice addInstrSts(DetailedInstructionStatus16 instrSts) {
        getInstrSts().add(instrSts);
        return this;
    }

}
