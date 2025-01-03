
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
 * Content of the Batch Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResponse1", propOrder = {
    "prfrmdTx"
})
public class BatchResponse1 {

    @XmlElement(name = "PrfrmdTx")
    protected List<PerformedTransaction1> prfrmdTx;

    /**
     * Gets the value of the prfrmdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prfrmdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrfrmdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformedTransaction1 }
     * 
     * 
     * @return
     *     The value of the prfrmdTx property.
     */
    public List<PerformedTransaction1> getPrfrmdTx() {
        if (prfrmdTx == null) {
            prfrmdTx = new ArrayList<>();
        }
        return this.prfrmdTx;
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
     * Adds a new item to the prfrmdTx list.
     * @see #getPrfrmdTx()
     * 
     */
    public BatchResponse1 addPrfrmdTx(PerformedTransaction1 prfrmdTx) {
        getPrfrmdTx().add(prfrmdTx);
        return this;
    }

}
