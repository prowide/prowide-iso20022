
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
 * Instruction to be cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelInstruction1", propOrder = {
    "snglInstrId",
    "instdPos"
})
public class CancelInstruction1 {

    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;
    @XmlElement(name = "InstdPos")
    protected List<SafekeepingAccount9> instdPos;

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
    public CancelInstruction1 setSnglInstrId(String value) {
        this.snglInstrId = value;
        return this;
    }

    /**
     * Gets the value of the instdPos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdPos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafekeepingAccount9 }
     * 
     * 
     */
    public List<SafekeepingAccount9> getInstdPos() {
        if (instdPos == null) {
            instdPos = new ArrayList<SafekeepingAccount9>();
        }
        return this.instdPos;
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
     * Adds a new item to the instdPos list.
     * @see #getInstdPos()
     * 
     */
    public CancelInstruction1 addInstdPos(SafekeepingAccount9 instdPos) {
        getInstdPos().add(instdPos);
        return this;
    }

}
