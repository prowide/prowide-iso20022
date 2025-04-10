
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prfrmdTx property.
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
     */
    public List<PerformedTransaction1> getPrfrmdTx() {
        if (prfrmdTx == null) {
            prfrmdTx = new ArrayList<PerformedTransaction1>();
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
