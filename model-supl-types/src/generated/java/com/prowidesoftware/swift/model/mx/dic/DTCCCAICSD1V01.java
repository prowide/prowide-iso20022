
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
 * The DTCCCAICSD1 message extends ISO corporate action Instruction Cancellation Request (CAIC) message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAICSD1V01", propOrder = {
    "reorgInstrCxlDtls"
})
public class DTCCCAICSD1V01 {

    @XmlElement(name = "ReorgInstrCxlDtls")
    protected List<ReorganisationInstructionDetailsSD3> reorgInstrCxlDtls;

    /**
     * Gets the value of the reorgInstrCxlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reorgInstrCxlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReorgInstrCxlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReorganisationInstructionDetailsSD3 }
     * 
     * 
     * @return
     *     The value of the reorgInstrCxlDtls property.
     */
    public List<ReorganisationInstructionDetailsSD3> getReorgInstrCxlDtls() {
        if (reorgInstrCxlDtls == null) {
            reorgInstrCxlDtls = new ArrayList<>();
        }
        return this.reorgInstrCxlDtls;
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
     * Adds a new item to the reorgInstrCxlDtls list.
     * @see #getReorgInstrCxlDtls()
     * 
     */
    public DTCCCAICSD1V01 addReorgInstrCxlDtls(ReorganisationInstructionDetailsSD3 reorgInstrCxlDtls) {
        getReorgInstrCxlDtls().add(reorgInstrCxlDtls);
        return this;
    }

}
