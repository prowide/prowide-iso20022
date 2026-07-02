
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
 * The DTCCCAISSD1 message extends ISO Corporate Action Instruction Status Advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAISSD1V02", propOrder = {
    "reorgInstrDtls"
})
public class DTCCCAISSD1V02 {

    @XmlElement(name = "ReorgInstrDtls")
    protected List<ReorganisationInstructionDetailsSD2> reorgInstrDtls;

    /**
     * Gets the value of the reorgInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reorgInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReorgInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReorganisationInstructionDetailsSD2 }
     * 
     * 
     */
    public List<ReorganisationInstructionDetailsSD2> getReorgInstrDtls() {
        if (reorgInstrDtls == null) {
            reorgInstrDtls = new ArrayList<ReorganisationInstructionDetailsSD2>();
        }
        return this.reorgInstrDtls;
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
     * Adds a new item to the reorgInstrDtls list.
     * @see #getReorgInstrDtls()
     * 
     */
    public DTCCCAISSD1V02 addReorgInstrDtls(ReorganisationInstructionDetailsSD2 reorgInstrDtls) {
        getReorgInstrDtls().add(reorgInstrDtls);
        return this;
    }

}
