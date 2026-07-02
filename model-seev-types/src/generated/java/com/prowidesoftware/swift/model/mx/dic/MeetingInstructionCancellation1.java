
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of the cancellation request message requesting cancellation of individual instruction(s).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionCancellation1", propOrder = {
    "mtgInstrCxlReqId",
    "snglInstrId"
})
public class MeetingInstructionCancellation1 {

    @XmlElement(name = "MtgInstrCxlReqId", required = true)
    protected String mtgInstrCxlReqId;
    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;

    /**
     * Gets the value of the mtgInstrCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtgInstrCxlReqId() {
        return mtgInstrCxlReqId;
    }

    /**
     * Sets the value of the mtgInstrCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingInstructionCancellation1 setMtgInstrCxlReqId(String value) {
        this.mtgInstrCxlReqId = value;
        return this;
    }

    /**
     * Gets the value of the snglInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrId() {
        return snglInstrId;
    }

    /**
     * Sets the value of the snglInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingInstructionCancellation1 setSnglInstrId(String value) {
        this.snglInstrId = value;
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

}
